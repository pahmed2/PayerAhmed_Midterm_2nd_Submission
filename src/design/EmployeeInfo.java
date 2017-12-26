package design;

import java.util.Scanner;

public class EmployeeInfo implements Employee{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	private String name;

	private int employeeId, employeeAge;
	private double salary;
	private int performance;
	private String departmentName;
	static String address;
	static String companyName;
	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.employeeId = employeeId;
	}
    public EmployeeInfo(String name, int employeeId){
		this.name = name;
		this.employeeId = employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployeeBonus(double salary, int performance){
		double total = 0;
		if(performance == 5){
			total = salary + (salary * .10);
		}else if(performance == 4){
			total = salary + (salary * .08);
		}else if(performance == 3){
			total = salary + (salary * .06);
		}else if(performance == 2){
			total = salary + (salary * .04);
		}else if(performance == 1){
			total = salary + (salary * .02);
		}else{
			total = total;
		}
		return total;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //get substring of the start and todays date
		String startYear = convertedJoiningDate.substring(convertedJoiningDate.length()-4, convertedJoiningDate.length());
		int start = Integer.parseInt(startYear);

        //implement numbers of year from above two dates
		//Calculate pension

		return total;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void assignDepartment(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	@Override
	public int employeeId() {
		return 0;
	}

	@Override
	public String employeeName() {
		return null;
	}

	@Override
	public void assignDepartment() {

	}

	@Override
	public double calculateSalary(double salary) {
		double yearlySalary = salary * 12;
		return yearlySalary;
	}

	@Override
	public void benefitLayout() {

	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
