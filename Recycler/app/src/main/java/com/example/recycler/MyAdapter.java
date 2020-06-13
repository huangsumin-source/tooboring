package com.example.recycler;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.ViewHolder>{
    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        ViewHolder holder;
        if(viewType == 0){
            v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view1, parent, false);
            holder = new Holder1(v);
        }else{
            v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view, parent, false);
            holder = new Holder(v);
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData();
    }

    @Override
    public int getItemCount() {
            return 2;
            }

    @Override
    public int getItemViewType(int position) {
            return position;
            }

    public abstract static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public abstract void setData();
    }

    public class Holder1 extends ViewHolder{
        RecyclerView rv;
        RecyclerView.LayoutManager layoutManager;
        RecyclerView.Adapter adapter;
        public Holder1(@NonNull View itemView) {
            super(itemView);
            rv = itemView.findViewById(R.id.rv1);
            layoutManager = new GridLayoutManager(itemView.getContext(), 4);
            adapter = new Adapter1();
        }

        @Override
        public void setData() {
            rv.setLayoutManager(layoutManager);
            rv.setAdapter(adapter);
        }
    }

    public class Holder extends ViewHolder{
        RecyclerView rv;
        RecyclerView.LayoutManager layoutManager;
        RecyclerView.Adapter adapter;
        public Holder(@NonNull View itemView) {
            super(itemView);
            rv = itemView.findViewById(R.id.rv);
            layoutManager = new LinearLayoutManager(itemView.getContext(),LinearLayoutManager.VERTICAL,false);
            adapter = new Adapter();
        }

        @Override
        public void setData() {
            rv.setLayoutManager(layoutManager);
            rv.setAdapter(adapter);
        }
    }
}
