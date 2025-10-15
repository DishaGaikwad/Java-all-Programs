package com.day9.test;

import java.time.LocalDate;
import com.day9.beans.Employee;
import java.util.*;
public class TestArrayList {
	public static void main(String[] args) {
		List<Employee> elist=new ArrayList<>();
		elist.add(new Employee(12,"Josh",798778,LocalDate.of(2025, 02, 10)));
		elist.add(new Employee(13,"Alenor",67868,LocalDate.of(2025, 02, 10)));
		elist.add(new Employee(14,"Alfanzo",7968778,LocalDate.of(2025, 02, 10)));
		elist.add(new Employee(15,"Stella",78656,LocalDate.of(2025, 02, 10)));
		elist.add(new Employee(16,"April",4654654,LocalDate.of(2025, 02, 10)));
		elist.add(new Employee(17,"Stefen",867867,LocalDate.of(2025, 02, 10)));

		for(int i=0;i<elist.size();i++) {
			System.out.println(elist.get(i));
		}
		System.out.println("'''''''''''''''''''''''''''''''''''''''''");
		for(Employee e:elist) 
		{
			System.out.println(e);
		}
		System.out.println("''''''''''''''''''''''''''''''''''''''''''");
		Iterator<Employee>it=elist.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println(e);
		}
		ListIterator<Employee> it1=elist.listIterator();
		elist.forEach(System.out::println);
		int id=13;
		Optional<Employee>op=elist.stream().filter(emp->emp.getEmpid()==id).findFirst();
		if(op.isPresent()) {
			System.out.println(op.get());
		}else {
			System.out.println("Not found");
		}
	}
}
