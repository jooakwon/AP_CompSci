package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog{
	String name;
	int age;
	String breed;
	public Dog() {
		name = new String("Clifford");
		age = 3;
		breed = new String("big red dog");
	}
	public Dog(String name1){
		name = name1;
		age = 1;
		breed = new String("dog dog");
	}
	public Dog(String name2, String breed2){
		name = name2;
		age = 1;
		breed = breed2;
	}
	public Dog(String name3, int age3){
		name = name3;
		age = age3;
		breed = new String("dog dog");
	}
	public void setName(String n){
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
	public void setBreed(String b){
		breed = b;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		boolean random = Math.random()>0.5;
		if(random){
			return true;
		}
		else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name + " barks!");
	}

}
