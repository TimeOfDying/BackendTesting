package ru.csu.iit.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountModel {
    @JsonProperty(value = "Id")
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
