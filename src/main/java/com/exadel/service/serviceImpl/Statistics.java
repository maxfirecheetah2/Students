package com.exadel.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.exadel.dao.GenericDao;
import com.exadel.dao.daoImpl.GenericDaoImpl;

/**
     * Created by Вадим on 04.08.2014.
     */
 public class Statistics {

        private ArrayList<String> fields=new ArrayList<String>();
        private ArrayList<Integer> values=new ArrayList<Integer>();


        public Statistics() {
        }

        public Statistics(String nameEntity,String nameColumn){

            GenericDaoImpl<Object,Integer> G=new GenericDaoImpl<Object, Integer>(Object.class);
            List<Object> data=G.getDataColumn(nameEntity,nameColumn);

            String temp=data.get(0).toString();
            int count=1;
            for(int i=1;i<data.size();i++) {
                String temp2=data.get(i).toString();
                if(temp.equalsIgnoreCase(temp2))
                {
                    count++;
                }
                else{
                    fields.add(temp);
                    values.add(new Integer(count));

                    count=1;
                    temp=data.get(i).toString();
                }

            }

            int c = 1;
            for (int i = data.size() - 2;i>=0 ; i--) {
                String t2 = data.get(i).toString();
                if (temp.equalsIgnoreCase(t2)) {
                    c++;
                } else {

                    fields.add(temp);
                    values.add(new Integer(c));
                    break;

                }
            }
            if(c==data.size()){
                fields.add(temp);
                values.add(new Integer(data.size()));
            }

            fields.add("Total ");
            values.add(new Integer(data.size()));



        }



    public ArrayList<Integer> getValues() {
            return values;
        }

        public ArrayList<String> getFields() {

            return fields;
        }
    }