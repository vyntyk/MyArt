package com.example.myart.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myart.MyRecyclerViewAdapter;
import com.example.myart.R;
import com.example.myart.repository.Repository;
import com.example.myart.repository.impl.RepositoryImpl;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import java.util.stream.Collectors;

public class HomeFragment extends Fragment implements MyRecyclerViewAdapter.ItemClickListener{

    private HomeViewModel homeViewModel;
    private MyRecyclerViewAdapter adapter;
    private FrameLayout container;
    private ConstraintLayout constraintLayout;

    @Override
    public void onItemClick(View view, int position) {
       Toast.makeText(getContext(), "You clicked " + adapter.getItem(position) +
               " on row number " + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Repository<String> repository = new RepositoryImpl();
        List<String> data = repository.getData().stream().collect(Collectors.toList());
        adapter = new MyRecyclerViewAdapter(data);
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        adapter.setClickListener(this);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view,
                              @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}