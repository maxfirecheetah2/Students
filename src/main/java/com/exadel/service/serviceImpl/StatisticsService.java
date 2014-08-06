package com.exadel.service.serviceImpl;

import com.exadel.dao.daoImpl.GenericDaoImpl;
import com.exadel.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Вадим on 04.08.2014.
 */

public class StatisticsService {



   private ArrayList<String> fields=new ArrayList<String>();
   private ArrayList<String> values=new ArrayList<String>();
   private ArrayList<String> percents=new ArrayList<String>();


    public StatisticsService() {
    }

    public StatisticsService(String nameEntity, String nameColumn){

        List<Object> data=new GenericDaoImpl<User,Integer>(User.class).getDataColumn(nameEntity,nameColumn);

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
                values.add(Integer.toString(count));
                percents.add(Double.toString(count * 100 / data.size())+"%");

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
                 values.add(Integer.toString(c));
                 percents.add(Double.toString(c * 100 / data.size())+"%");
                 break;

             }
         }
        if(c==data.size()){
            fields.add(temp);
            values.add(Integer.toString(data.size()));
            percents.add(Double.toString(100)+"%");
        }

        fields.add("Total ");
        values.add(Integer.toString(data.size()));
        percents.add(Double.toString(100)+"%");





    }


    public ArrayList<String> getValues() {
        return values;
    }

    public ArrayList<String> getFields() {

        return fields;
    }

    public ArrayList<String> getPercents() {
        return percents;
    }
}
