package com.nagarro.demo.Demo;
import javax.persistence.*;
//@Entity
//@Table(name = "student")
public class Student 
{
	static int c=0;
	public void fun()
	{
		c++;
		System.out.println(c);
	}
	/*@Id
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "Name")
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	
}
