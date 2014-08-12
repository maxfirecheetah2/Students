package com.exadel.entity;

import java.util.ArrayList;

/**
 * Created by Вадим on 12.08.2014.
 */
public class Statistics {

    private ArrayList<String> fields;
    private ArrayList<String> values;
    private ArrayList<String> percents;
    private ArrayList<String> headers;

    public Statistics() {
        fields=new ArrayList<String>();
        values=new ArrayList<String>();
        percents=new ArrayList<String>();
        headers=new ArrayList<String>();
    }

    public void addField(String field){
        fields.add(field);
    }
    public void addValue(String value){
        values.add(value);
    }
    public void addPercent(String percent){
        percents.add(percent);

    }
    public void addHeader(String header){
        headers.add(header);

    }



    public ArrayList<String> getValues() {
        return values;
    }

    public void setValues(ArrayList<String> values) {
        this.values = values;
    }

    public ArrayList<String> getPercents() {
        return percents;
    }

    public void setPercents(ArrayList<String> percents) {
        this.percents = percents;
    }

    public ArrayList<String> getHeaders() {
        return headers;
    }

    public void setHeaders(ArrayList<String> headers) {
        this.headers = headers;
    }

    public ArrayList<String> getFields() {

        return fields;
    }

    public void setFields(ArrayList<String> fields) {
        this.fields = fields;
    }
}
