package com.company;
import java.util.Comparator;

public class CustomizeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.age == s2.age)
            return s1.name.compareTo(s2.name);
        if (s1.age < s2.age)
            return 1;
        else
            return -1;
    }
}


