package ua.lviv.lgs.task6_1;

public class Main {
	
	public static void main(String[] args) {
	
		FixedSalaryWorker id1235 = new FixedSalaryWorker("Петя", 7500); 
		HourlyWageWorker id7149 = new HourlyWageWorker("Вася", 160, 39.35);
		
		id1235.salary();
		id7149.salary();
	}
}
