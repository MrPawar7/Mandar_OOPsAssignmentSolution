package com.Great_Learning_GA1.SuperDepartment;

import com.Great_Learning_GA1.Department.AdminDepartment;
import com.Great_Learning_GA1.Department.HRDepartment;
import com.Great_Learning_GA1.Department.TechDepartment;

public class Main {

	public static void main(String[] args) {

		AdminDepartment adminDepartment = new AdminDepartment();
		HRDepartment hrDepartment = new HRDepartment();
		TechDepartment techDepartment = new TechDepartment();

		
		System.out.println("Welcome to" + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork().trim());
		System.out.println(adminDepartment.getWorkDeadline().trim());
		System.out.println(adminDepartment.isTodayAHoliday().trim() + "\n");

		
		System.out.println("Welcome to" + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity().trim());
		System.out.println(hrDepartment.getTodaysWork().trim());
		System.out.println(hrDepartment.getWorkDeadline().trim());
		System.out.println(hrDepartment.isTodayAHoliday().trim() + "\n\n");

		
		System.out.println("Welcome to" + techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork().trim());
		System.out.println(techDepartment.getWorkDeadline().trim());
		System.out.println(techDepartment.getTechStackInformation().trim());
		System.out.println(techDepartment.isTodayAHoliday().trim());
	}

}