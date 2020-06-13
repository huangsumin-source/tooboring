package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter1 extends RecyclerView.Adapter<Adapter1.ViewHolder>{
    private CellData1[] data1 = new CellData1[]{new CellData1(),new CellData1(),new CellData1(),new CellData1(),new CellData1(),new CellData1(),new CellData1(),new CellData1()};
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv_item1, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(position);
    }


    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv1, tv2;
        ImageView iv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);
            iv = itemView.findViewById(R.id.iv);
        }

        public void setData(int position) {
            tv1.setText(data1[position].tv1);
            tv2.setText(data1[position].tv2);
            iv.setImageResource(data1[position].id);
        }
    }
}

