package com.example.demo;

public class Person {
public String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
}
public String address;
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int age;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
