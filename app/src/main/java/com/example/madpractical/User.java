package com.example.madpractical;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    User(String n ,String d,int eyed,boolean f){
        this.name =n;
        this.description =d;
        this.id =eyed;
        this.followed =f;
    }
}
