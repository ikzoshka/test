package com.epam;

public class Example {


  public static void main(String[] args) {

    String t = "lol";
    String k = "newLol";

    System.out.println(asb(t,k));
  }

  private static Boolean asb(String i, String o) {

    if (!i.equals(o)) {
      return i.equals(o);
    }
    return null;
  }
}
