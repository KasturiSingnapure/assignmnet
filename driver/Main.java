package com.greatlearning.driver;

import com.greatlearning.department.subclass.AdminDepartment;
import com.greatlearning.department.subclass.HrDepartment;
import com.greatlearning.department.subclass.TechDepartment;

//Driver class
public class Main {
	public static void main(String[] args) {
		
        // Create an instance of AdminDepartment
		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());

		System.out.println();
		
        // Create an instance of HRDepartment
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());

		System.out.println();
		
        // Create an instance of TechDepartment
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}

}
