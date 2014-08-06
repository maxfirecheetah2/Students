package com.exadel.service.serviceImpl;

import com.devcolibri.persistence.*;
import org.hibernate.Session;

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

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();


        List<Object> data=(List<Object>)session.createQuery("select "+nameColumn+" from "+ nameEntity +" order by "+nameColumn).list();

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
                values.add(new Integer(count).toString());
                percents.add(new Double(count*100/data.size()).toString()+"%");

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
                 values.add(new Integer(c).toString());
                 percents.add(new Double(c*100/data.size()).toString()+"%");
                 break;

             }
         }
        if(c==data.size()){
            fields.add(temp);
            values.add(new Integer(data.size()).toString());
            percents.add(new Double(100)+"%");
        }

        fields.add("Total ");
        values.add(new Integer(data.size()).toString());
        percents.add(new Double(100).toString()+"%");



        session.getTransaction().commit();

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
