package com.example.Small_Social_Media.view;

import org.springframework.stereotype.Service;

@Service
public class UserView{
    public void printUser(String name, String pwd){
        System.out.println("Username: "+ name);
        System.out.println("Pwd: "+ pwd);
    }
}