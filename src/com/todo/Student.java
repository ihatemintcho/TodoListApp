package com.todo;

public class Student implements Comparable<Student>{
	int no;			// number
	String name;	// name
	int age;		// age

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	
	public Student(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	
}
