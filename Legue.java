package com.awesam;

import java.util.ArrayList;

import java.util.Collections;

public class Legue<T extends Team>  {
    private final String name;
    ArrayList <T> legue=new ArrayList<>();

    public Legue(String name) {
        this.name = name;
    }
    public boolean add(T team){
        if (legue.contains(team))return false;
        else{
            legue.add(team);
            return true;
        }
    }
    public void showLegueTable(){
        Collections.sort(legue);
        for (T t:legue) {
            System.out.println(t.getName()+": "+t.ranking());
        }
    }
}
