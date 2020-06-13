package com.example.recycler;

public class CellData {
    String tv1 = "默读";
    String tv2 = "我们不断追溯与求索犯罪者的动机，，探寻其中最幽微的喜怒哀乐，不是为了设身处地地同情乃至于……";
    String tv3 = "9.8分";
    int id = R.drawable.image;
    public CellData(String tv1, String tv2, String tv3, int id){
        this.tv1 = tv1;
        this.tv2 = tv2;
        this.tv3 = tv3;
        this.id = id;
    }
    public CellData(){}
}
