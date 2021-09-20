package com.company;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

 public String setModel (String model) {
     String validModel = model.toLowerCase();
     if (validModel=="porsche") {
         return this.model = model;
     }
      return "Invalid Car";

 }

 public String getModel () {
     return this.model;
 }

}
