package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RecyclerView rv = findViewById(R.id.my_recycler_view);
        setContentView(R.layout.activity_main);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new RecyclerView.Adapter() {
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

                MyAdapter viewHolder = new MyAdapter(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell,null));
                return viewHolder;
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                MyAdapter vh = (MyAdapter) holder;
                CellData cd = data[position];
                vh.getTv1().setText(cd.tv1);
                vh.getTv2().setText(cd.tv2);
                vh.getTv3().setText(cd.tv3);
                vh.getTv().setText(cd.tv);
            }

            @Override
            public int getItemCount() {
                return data.length;
            }

            private CellData[] data = new CellData[]{new CellData("1", "2", "3", "4"), new CellData("1", "2", "3", "5")};
        });
    }

}