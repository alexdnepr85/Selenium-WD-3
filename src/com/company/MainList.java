package com.company;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 01.04.2015.
 */
public class MainList { //Spiski
    public static void main(String[] args){
        String[] s ={"Hello ", "Class", "."};

        List<String> f = new ArrayList<String>();

        f.add("Privet"); //Spisok
        f.add("Klass");
        f.add("...");

        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);

        System.out.println(f.size());



    }

}
