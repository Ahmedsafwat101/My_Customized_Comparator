package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1 = new Student(10,"ahmed",21);
        Student s2 = new Student(10,"mido",19);
        Student s3 = new Student(10,"fady",18);
        Student s4 = new Student(10,"ali",25);
        Student s5 = new Student(10,"ziad",23);
        Student s6 = new Student(10,"mezo",19);
        Student s7 = new Student(10,"salama",15);
        Student s8 = new Student(10,"aya",30);
        Student s9 = new Student(10,"hassan",21);


        List<Student>myList= new ArrayList<>();
        myList.add(s1);
        myList.add(s2);
        myList.add(s3);
        myList.add(s4);
        myList.add(s5);
        myList.add(s6);
        myList.add(s7);
        myList.add(s8);
        myList.add(s9);

        CustomizeComparator Comparator= new CustomizeComparator();

        Collections.sort(myList,Comparator);
        for(Student s: myList){
            System.out.print(s.age+",");System.out.println(s.name);
        }

    }
}
