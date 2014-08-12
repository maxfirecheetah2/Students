package com.exadel.service.serviceImpl;




import com.exadel.dao.GeneralInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Вадим on 04.08.2014.
 */
@Service
public class StatisticsService {

    @Autowired
    @Qualifier("generalInfoDao")
    private GeneralInfoDao generalInfoDao;

   private ArrayList<String> fields=new ArrayList<String>();
   private ArrayList<String> values=new ArrayList<String>();
   private ArrayList<String> percents=new ArrayList<String>();


    public StatisticsService() {
    }

    @Transactional
    @Secured({"ROLE_ADMIN"})
    public void startStatisticsService( String nameColumn){


        List<Object> data=generalInfoDao.getDataColumn(nameColumn);


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


    }

    @Transactional
    @Secured({"ROLE_ADMIN"})
    public void startStatisticsServiceBillable(){

        List<Date> acceptionDates=generalInfoDao.getAcceptionDate();
        List<Date> billableDates=generalInfoDao.getBillableDate();

        ArrayList<String> data=new ArrayList<String>();


        for(int i=0;i<acceptionDates.size();i++) {
            int temp=( billableDates.get(i).getYear() - acceptionDates.get(i).getYear()) * 12 + ( billableDates.get(i).getMonth() - acceptionDates.get(i).getMonth());
            if(temp<=6 ){
                data.add("0.5 year and less");
            }
            if(temp>6 && temp<=12){
                data.add("From 0.5 year to 1 year");
            }
            if(temp>12 && temp<=18){
                data.add("From 1 year to 1.5 year");
            }
            if(temp>18 && temp<=24){
                data.add("From 1.5 year to 2 years");
            }
            if(temp>24){
                data.add("More than 2 years");
            }


        }
        Collections.sort(data);


        String temp=data.get(0);
        int count=1;
        for(int i=1;i<data.size();i++) {
            String temp2=data.get(i);
            if(temp.equalsIgnoreCase(temp2))
            {
                count++;
            }
            else{
                fields.add(temp);
                values.add(new Integer(count).toString());
                percents.add(new Double(count*100/data.size()).toString()+"%");

                count=1;
                temp=data.get(i);
            }

        }

        int c = 1;
        for (int i = data.size() - 2;i>=0 ; i--) {
            String t2 = data.get(i);
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
