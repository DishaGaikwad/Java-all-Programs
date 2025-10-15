package com.day9.comparator;

import java.util.Comparator;

import com.day9.beans.Employee;

public class MyNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("in nameComparator compare method");
		System.out.println("Name:"+o1.getEname()+"---"+o2.getEname());
		return o1.getEname().compareTo(o2.getEname());
	}
}
