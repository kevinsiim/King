package com.example.opilane.king;

public class King {
    private String name;
    private int from, to;
    public King(String name,int from,int to){
        this.name=name;
        this.from=from;
        this.to=to;
    }

    public String getName() {
        return name;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
    public String toString(){
        return name;
    }
}
