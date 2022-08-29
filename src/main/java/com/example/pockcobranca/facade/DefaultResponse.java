package com.example.pockcobranca.facade;

import java.util.ArrayList;
import java.util.List;

public class DefaultResponse<T> {
    private List<T> data;
    

   public List<T> getData() {
    return data;
   }
    public void setData(T data) {
        List<T> dataObjects = new ArrayList<T>();
        dataObjects.add(data);
        this.data = dataObjects;
    }
    public static<T> DefaultResponse of(T data){
        DefaultResponse<T> response = new DefaultResponse<>();
        response.setData(data);
        return response;
    }
    
}
