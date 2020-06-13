package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mainRv;
    private RecyclerView.LayoutManager mainLayoutManager;
    private RecyclerView.Adapter adapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);
        mainRv = findViewById(R.id.main_rv);
        mainLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mainRv.setLayoutManager(mainLayoutManager);
        adapter = new MyAdapter();
        mainRv.setAdapter(adapter);
    }
}