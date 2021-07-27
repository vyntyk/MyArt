package com.example.myart.repository.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TaskImpl {
     public static void main(String[] args) throws Exception{
          URL url = new URL("https://api.themoviedb.org/3/movie/550?api_key=b25438f366b7d3b21111047f0342c590");
          HttpURLConnection con = (HttpURLConnection) url.openConnection();
          con.setDoOutput(true);
          con.setRequestMethod("GET");
          con.setUseCaches(true);
          con.setRequestProperty("Content-Type", "application/json");

          StringBuilder ab = new StringBuilder();
          if (HttpURLConnection.HTTP_OK == con.getResponseCode()) {
               BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));

               String line;
               while ((line = in.readLine()) != null) {
                    ab.append(line);
                    ab.append("\n");
               }
               System.out.println(ab.toString());
          } else {
               System.out.println("fail: " + con.getResponseCode() + con.getResponseMessage());
          }

     }
}


