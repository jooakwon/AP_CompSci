/*
 *	Author: Jooa Kwon
 *  Date: Oct 22th
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.raiseSalary(10);
		michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.raiseSalary(10);
		dwight.employeeToString();
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.raiseSalary(10);
		jim.employeeToString();
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250); 
		pam.raiseSalary(10);
		pam.employeeToString();
		Employee jooa = new Employee(0557, "Jooa", "Kwon", 8000);
		jooa.raiseSalary(10);
		jooa.employeeToString();
		double michaelannualsalary = michael.getAnnualSalary();
		System.out.println("Michael Scott's Annual Salary: " + michaelannualsalary);
		double dwightannualsalary = dwight.getAnnualSalary();
		System.out.println("Dwight Schrute's Annual Salary: " + dwightannualsalary);
		double jimannualsalary = jim.getAnnualSalary();
		System.out.println("Jim Halpert's Annual Salary: " + jimannualsalary);
		double pamannualsalary = pam.getAnnualSalary();
		System.out.println("Pam Beesly's Annual Salary: " + pamannualsalary);
		double jooaannualsalary = jooa.getAnnualSalary();
		System.out.print("Jooa Kwon's Annual Salary: " + jooaannualsalary);
		
		
		
	}
}
