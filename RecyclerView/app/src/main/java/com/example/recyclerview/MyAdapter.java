package com.example.recyclerview;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class MyAdapter extends RecyclerView.ViewHolder{
    private TextView tv1, tv2, tv3, tv;
    public MyAdapter(View root){
        super(root);
        tv1 = root.findViewById(R.id.textView1);
        tv2 = root.findViewById(R.id.textView2);
        tv3 = root.findViewById(R.id.textView3);
        tv = root.findViewById(R.id.textview);
    }

    public TextView getTv() { return tv; }

    public TextView getTv1() {
        return tv1;
    }

    public TextView getTv2() {
        return tv2;
    }

    public TextView getTv3() {
        return tv3;
    }
}
