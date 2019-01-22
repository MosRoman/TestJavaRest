package com.gmail.morovo1988.testRest.external;

import com.gmail.morovo1988.testRest.domain.Document;

import java.util.List;

public class Data {

    private List<Document> data;

    public List<Document> getData() {
        return data;
    }

    public void setData(List<Document> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }
}
