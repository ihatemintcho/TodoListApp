package com.todo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> al=new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		
		al.add(new Student(1,"Park", 1));
		al.add(new Student(2, "Choi", 1));
		al.add(new Student(3, "Lee", 1));
		al.add(new Student(4, "Kim", 1));
		al.add(new Student(5, "Hong", 1));
		al.add(new Student(6, "Ryu", 1));
		al.add(new Student(7, "Jeong", 1));
		al.add(new Student(8, "Tak", 1));
		al.add(new Student(9, "Seo", 1));
		al.add(new Student(10, "Moon", 1));
		
		Collections.sort(al);
		for (Student s : al) {
			System.out.println(s.toString());
		}		

	}

}
