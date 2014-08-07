package com.exadel.controller;

import com.exadel.service.serviceImpl.PdfDocumentService;
import com.exadel.service.serviceImpl.StatisticsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class LoginController extends BaseController{

   // @Autowired
   // @Qualifier("mailService")
   // private MailService mailService;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginLoad() {
        System.out.println("Login form is loading");

     //   mailService.sendMail("elfavadim@mail.ru", "Test blablabla","eptaaaaaaaaaaaaa" );

       /* ArrayList<String> headers=new ArrayList<String>();
        headers.add("password");
        headers.add("name");
        headers.add("login");


        ArrayList<StatisticsService> listStatistics=new ArrayList<StatisticsService>();
        listStatistics.add(new StatisticsService("User","password"));
        listStatistics.add(new StatisticsService("User","name"));
        listStatistics.add(new StatisticsService("User","login"));


        new PdfDocumentService("c:/temp/Test1.pdf", headers,listStatistics);*/


        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        System.out.println("Login form is loading");
        return "login";
    }
}