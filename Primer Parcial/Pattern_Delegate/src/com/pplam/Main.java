package com.pplam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        for(Description description : Arrays.asList(
                new Teacher("CC", 5000),
                new Student("Unan", "Software"),
                new Administrator("Leader", 9500),
                new Project("PPLAM", "7 months"))
        )
            System.out.println(description.description());

    }
}
