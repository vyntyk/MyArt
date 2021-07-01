package com.example.myart.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myart.MyRecyclerViewAdapter;
import com.example.myart.R;
import com.example.myart.repository.Repository;
import com.example.myart.repository.impl.RepositoryImpl;

import java.util.List;
import java.util.stream.Collectors;

public class HomeFragment extends Fragment implements MyRecyclerViewAdapter.ItemClickListener{

    private HomeViewModel homeViewModel;
    RecyclerView recyclerView;
    MyRecyclerViewAdapter adapter;
    private FrameLayout container;
    private ConstraintLayout constraintLayout;

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        Repository<String> repository = new RepositoryImpl();
        List<String> data = repository.getData().stream().collect(Collectors.toList());

        RecyclerView recyclerView = recyclerView.findViewById(R.id.recycler);
        //recyclerView.setLayoutManager(new ConstraintLayoutManager(this));
        //adapter = new MyRecyclerViewAdapter(this, data);
        //adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return root;
    }
}