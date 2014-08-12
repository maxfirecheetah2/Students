package com.exadel.service.serviceImpl;

import com.exadel.dao.GeneralInfoDao;
import com.exadel.entity.Statistics;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Вадим on 04.08.2014.
 */
public class StatisticsService {

     @Autowired
     @Qualifier("generalInfoDao")
     private GeneralInfoDao generalInfoDao;


    public void addStatisticsFaculty(Statistics statistics){


        statistics.addHeader("faculty");
        List<Object> data=generalInfoDao.getFaculties();

        for(int i=0;i<data.size();i++){
            if(data.get(i)==null)
                data.remove(i);
        }

        generateStatistics(data,statistics);


    }

    public void addStatisticsUniversity(Statistics statistics){


        statistics.addHeader("university");
        List<Object> data=generalInfoDao.getUniversities();

        for(int i=0;i<data.size();i++){
            if(data.get(i)==null)
                data.remove(i);
        }

        generateStatistics(data,statistics);



    }

    public void addStatisticsCourse(Statistics statistics){


        statistics.addHeader("course");
        List<Object> data=generalInfoDao.getCourses();

        for(int i=0;i<data.size();i++){
            if(data.get(i)==null)
                data.remove(i);
        }

        generateStatistics(data,statistics);



    }

    public void addStatisticsBillable(Statistics statistics){


        statistics.addHeader("billable");
        List<Object> data=generalInfoDao.getBillable();

        for(int i=0;i<data.size();i++){
            if(data.get(i)==null)
                data.remove(i);
        }

        String temp=data.get(0).toString();
        int count=1;
        for(int i=1;i<data.size();i++) {
            String temp2=data.get(i).toString();
            if(temp.equalsIgnoreCase(temp2))
            {
                count++;
            }
            else{
                if(temp.equals("0")) {
                    statistics.addField("No billable");
                }
                else{
                    statistics.addField("Billable");
                }
                statistics.addValue(new Integer(count).toString());
                statistics.addPercent(new Double(count*100/data.size()).toString()+"%");

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

                if(temp.equals("0")) {
                    statistics.addField("No billable");
                }
                else{
                    statistics.addField("Billable");
                }
                statistics.addValue(new Integer(c).toString());
                statistics.addPercent(new Double(c*100/data.size()).toString()+"%");
                break;

            }
        }
        if(c==data.size()){
            if(temp.equals("0")) {
                statistics.addField("No billable");
            }
            else{
                statistics.addField("Billable");
            }
            statistics.addValue(new Integer(data.size()).toString());
            statistics.addPercent(new Double(100)+"%");
        }

        statistics.addField("Total ");
        statistics.addValue(new Integer(data.size()).toString());
        statistics.addPercent(new Double(100).toString()+"%");



    }

    public void addStatisticsEnglishLevel(Statistics statistics){


        statistics.addHeader("english level");
        List<Object> data=generalInfoDao.getEnglishLevels();

        for(int i=0;i<data.size();i++){
            if(data.get(i)==null)
                data.remove(i);
        }

        generateStatistics(data,statistics);



    }

    public void addStatisticsBillableSpec(Statistics statistics){



        statistics.addHeader("period of time when not billable");
        List<Date> acceptionDates=generalInfoDao.getAcceptionDates();
        List<Date> billableDates=generalInfoDao.getBillableDates();

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


        String temp=data.get(0).toString();
        int count=1;
        for(int i=1;i<data.size();i++) {
            String temp2=data.get(i).toString();
            if(temp.equalsIgnoreCase(temp2))
            {
                count++;
            }
            else{
                statistics.addField(temp);
                statistics.addValue(new Integer(count).toString());
                statistics.addPercent(new Double(count*100/data.size()).toString()+"%");

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

                statistics.addField(temp);
                statistics.addValue(new Integer(c).toString());
                statistics.addPercent(new Double(c*100/data.size()).toString()+"%");
                break;

            }
        }
        if(c==data.size()){
            statistics.addField(temp);
            statistics.addValue(new Integer(data.size()).toString());
            statistics.addPercent(new Double(100)+"%");
        }

        statistics.addField("Total ");
        statistics.addValue(new Integer(data.size()).toString());
        statistics.addPercent(new Double(100).toString()+"%");




    }

    private void generateStatistics(List<Object> data,Statistics statistics){
        String temp=data.get(0).toString();
        int count=1;
        for(int i=1;i<data.size();i++) {
            String temp2=data.get(i).toString();
            if(temp.equalsIgnoreCase(temp2))
            {
                count++;
            }
            else{
                statistics.addField(temp);
                statistics.addValue(new Integer(count).toString());
                statistics.addPercent(new Double(count*100/data.size()).toString()+"%");

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

                statistics.addField(temp);
                statistics.addValue(new Integer(c).toString());
                statistics.addPercent(new Double(c*100/data.size()).toString()+"%");
                break;

            }
        }
        if(c==data.size()){
            statistics.addField(temp);
            statistics.addValue(new Integer(data.size()).toString());
            statistics.addPercent(new Double(100)+"%");
        }

        statistics.addField("Total ");
        statistics.addValue(new Integer(data.size()).toString());
        statistics.addPercent(new Double(100).toString()+"%");
    }



}
