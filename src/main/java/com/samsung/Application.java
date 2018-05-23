package com.samsung;


import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.json.JsonParser;

import java.util.ArrayList;

@SpringBootApplication
public class Application {
public static String jsonString;
public static ArrayList<Contact> a;
    public static void main(String[] args) {
        a = new ArrayList<Contact>();
        a.add(new Contact("Георгий","Садовский","+79826231623"));
        a.add(new Contact("Вася","Артамонов","+79222222222"));
        a.add(new Contact("Саша","Новиков","+79333333333"));
        a.add(new Contact("Петя","Иванов","+79444444444"));
        a.add(new Contact("Степан","Простак","+79555555555"));
        Msg msg = new Msg(a);
        Gson g = new Gson();
        jsonString = g.toJson(msg);
        SpringApplication.run(Application.class,args);
    }
}
