package com.example.knowledgeninja;

import android.widget.ImageView;

public class Fact {

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSubTopic() {
        return subTopic;
    }

    public void setSubTopic(String subTopic) {
        this.subTopic = subTopic;
    }

    public String getFactName() {
        return factName;
    }

    public void setFactName(String factName) {
        this.factName = factName;
    }

    public int getFactImage() {
        return factImage;
    }

    public void setFactImage(int factImage) {
        this.factImage = factImage;
    }

    private String topic;
    private String subTopic;
    private String factName;
    private int factImage;

    public Fact(String topic, String subTopic, String factName, int factImage) {
        this.topic = topic;
        this.subTopic = subTopic;
        this.factName = factName;
        this.factImage = factImage;
    }
}
