package com.nargi.javalearning2;

public class Statements {
    public static void main(String[] args)
    {
        int x =5;
        System.out.println(x);
        x= x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        int y=4;
        System.out.println(x>y);
        y=30;
        System.out.println(x>=y);

        //and && or ||
        x=3;
        y=4;
        int z=5;
        System.out.println( x<y && y<z);

        // if statesment

        if(x<y){
            System.out.println( "y is bigger");
        }else if (y<x){
            System.out.println("x is bigger");
        }else if(x==y){
            System.out.println("x=y");
        }

        //switch degistirebilir if else ile ayni islemi gorur
        int day=2;
        String dayString =" ";
        if(day == 1){
            dayString ="Monday";
        }else if (day==2){
            dayString ="Tuesday";
        }else if (day==3){
            dayString ="Wednwsday";
        }else {
            dayString ="Sunday";
        }

        switch (day){
            case 1:
                dayString ="Monday";
                break;
            case 2:
                break;
            case 3:
                dayString ="Wednesday";
                break;
            default:
                dayString ="Sunday";
                break;
        }
        System.out.println(dayString);
    }
}
