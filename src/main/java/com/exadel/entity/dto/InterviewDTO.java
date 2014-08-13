package com.exadel.entity.dto;


import java.util.HashMap;
import java.util.Map;

public class InterviewDTO {

    private Map<Integer, String> marks = new HashMap<Integer, String>();
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Map<Integer, String> getMarks(){
        return marks;
    }

    public void setMarks(Map<Integer, String> marks){
        this.marks = marks;
    }

}
