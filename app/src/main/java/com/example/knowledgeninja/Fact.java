package com.example.knowledgeninja;

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

    private int factFact;
    private int factImage;


    public int getFactFact() {
        return factFact;
    }

    public void setFactFact(int factFact) {
        this.factFact = factFact;
    }

    public Fact(String topic, String subTopic, String factName, int factImage, int factFact) {
        this.topic = topic;
        this.subTopic = subTopic;
        this.factName = factName;
        this.factImage = factImage;
        this.factFact = factFact;
    }
}
