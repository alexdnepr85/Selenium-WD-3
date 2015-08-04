package com.company;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 04.08.2015.
 */
public class Lesson_collection {
    @Test
    public void lesson5() {
        List<String>testersList = new ArrayList<String>();
        testersList.add("Dima");
        testersList.add("Nikita");
        testersList.add("Dima2");
        testersList.add("Lesha");
        testersList.add("Sasha");
        System.out.println(testersList.get(1));
        for(String tester : testersList) {
            System.out.println(tester);

            if(testersList.isEmpty()){
                System.out.println(testersList.size());

            }
        }
    }
}
