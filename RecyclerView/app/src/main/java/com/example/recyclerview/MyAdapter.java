package com.example.recyclerview;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class MyAdapter extends RecyclerView.ViewHolder{
    private View tv;
    private TextView tv1, tv2, tv3;
    private Button btn;
    public MyAdapter(View root){
        super(root);
        tv1 = root.findViewById(R.id.textView1);
        tv2 = root.findViewById(R.id.textView2);
        tv3 = root.findViewById(R.id.textView3);
        btn = root.findViewById(R.id.button);
    }

    public TextView getTv1() {
        return tv1;
    }

    public TextView getTv2() {
        return tv2;
    }

    public TextView getTv3() {
        return tv3;
    }

    public Button getBtn() {
        return btn;
    }
}
