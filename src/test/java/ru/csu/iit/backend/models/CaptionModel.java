package ru.csu.iit.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CaptionModel {

    @JsonProperty(value = "Caption")
    private String caption;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String toString() {
        return "DatasetModel{" +
                ", caption='" + caption + '\'' +
                '}';
    }
}
