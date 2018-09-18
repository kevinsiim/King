package com.example.opilane.king;

import java.util.ArrayList;
import java.util.List;

//Second part of the data resource, the Class Kings makes King objects available
public class Kings {
    //creating list
    private List<King> list = new ArrayList<>();

    // adding multidimensional  array values into the list
    public Kings() {
        for (String[] arr : data)
            list.add(new King([0], Integer.parseInt(arr[1], Integer.parseInt(arr[2])));
    }
    public List<King> getKings(){
        return list;
    }

    //Our multidimensional array
    private static final String[][] data={
        {"Henry VIII", "1509", "1547"},
        {"Edward VI", "1547", "1553"},
        {"Mary I", "1553", "1558"},
        {"Elizabeth 1", "1558", "1603"}
    };
}