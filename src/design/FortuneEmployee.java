package design;

import databases.ConnectDB;

import java.util.*;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {


		EmployeeInfo employee1 = new EmployeeInfo
				("Payer", 1010);
		EmployeeInfo employee2 = new EmployeeInfo
				("Zillur", 2020);
		EmployeeInfo employee3 = new EmployeeInfo
				("Mohammed", 3030);
		EmployeeInfo employee4 = new EmployeeInfo
				("Fahim", 4040);
		EmployeeInfo employee5 = new EmployeeInfo
				("Zanna", 5050);

		employee1.assignDepartment("QA");
		employee2.assignDepartment("DEV");
		employee3.assignDepartment("Finance");
		employee4.assignDepartment("Marketing");
		employee5.assignDepartment("LAW");

		employee1.setSalary(12000);
		employee1.calculateSalary(employee1.getSalary());
		employee2.setSalary(13000);
		employee2.calculateSalary(employee2.getSalary());
		employee3.setSalary(8000);
		employee3.calculateSalary(employee3.getSalary());
		employee4.setSalary(8500);
		employee4.calculateSalary(employee4.getSalary());
		employee5.setSalary(5400);
		employee5.calculateSalary(employee5.getSalary());


		Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
		List<Object> employeeRecord101 = new ArrayList<Object>();
		employeeRecord101.add(employee1.employeeName());
		employeeRecord101.add(employee1.calculateSalary(employee1.getSalary()));

		List<Object> employeeRecord102 = new ArrayList<Object>();
		employeeRecord102.add(employee2.employeeName());
		employeeRecord102.add(employee2.calculateSalary(employee2.getSalary()));


		employeeInfo.put(101, employeeRecord101);
		employeeInfo.put(102, employeeRecord102);

		ConnectDB connectDB = new ConnectDB();

		connectDB.createTableFromStringToMySql("employee_record", "employee_id", "employee_info");

		for (Integer obj : employeeInfo.keySet()) {
			for (Object obj1 : employeeInfo.get(obj)) {
				System.out.println(obj1);
				List<String> list1 = new ArrayList<>();
				list1.add(obj.toString());
				list1.add(obj1.toString());
				//connectDB.InsertDataFromArrayListToMySql(list1, "employee_record", "employee_id", "employee_info");
			}

		}

	}

}
