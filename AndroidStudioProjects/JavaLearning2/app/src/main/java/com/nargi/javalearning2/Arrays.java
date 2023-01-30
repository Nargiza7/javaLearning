package com.nargi.javalearning2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args)
    {
        //Diziler
       String[] myStringArray = new String[3];

       myStringArray[0]="james";
       myStringArray[1]="Nargiza";
       myStringArray[2]="Almaz";

        System.out.println(myStringArray[1]);

        int[] myIntegerArray = new int[3];
        myIntegerArray[0]=20;
        myIntegerArray[1]=25;
        myIntegerArray[2]=30;

        System.out.println(myIntegerArray[2]);

        int[] myNumberArray = {1,2,3,4,5,6,7,8,9};
        System.out.println(myNumberArray[2]);

        //Listeler diziye gore daha esnek

        ArrayList<String> myMusicians = new ArrayList<String>();
        myMusicians.add("james");
        myMusicians.add("Lars");
        myMusicians.add(1, "kirk");
        myMusicians.add("Rob");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));

        System.out.println(myMusicians.size());//(size -> kac tane eleman var onu gosterir (4)

        // set
        HashSet<String> mySet = new HashSet <String>();
        mySet.add("James");
        mySet.add("James");
        System.out.println(mySet.size());

        //HashMap

        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("name", "James");
        myHashMap.put("instrument", "guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        HashMap<String, Integer> mySecondMap = new HashMap<>();
        mySecondMap.put("run", 100);
        mySecondMap.put("basketball", 200);
        System.out.println(mySecondMap.get("run"));

    }

}
