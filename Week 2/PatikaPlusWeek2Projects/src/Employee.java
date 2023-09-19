
public class Employee {

	private String name;
	private int salary;
	private int workHours;
	private int hireYear;
	
	public Employee(String name,int salary,int workHours,int hireYear) {
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;		
	}
	int tax() {
		int tax=0;
		if(salary>1000) {
			tax = salary + (int)(salary*0.03);
		}
		return tax;
	}
	int bonus() {
		int bonus=0;
		if(workHours>40) {
			bonus = salary + (workHours-40)*30;
		}
		return bonus;
	}
	int raiseSalary() {
		int raisedSalary=0;
		int years = 2021 - hireYear;
		if(years<10) {
			raisedSalary = salary + (int)(salary*0.05);
		}
		if(years>9 && years<20) {
			raisedSalary = salary + (int)(salary*0.10);
		}
		if(years>19) {
			raisedSalary = salary + (int)(salary*0.15);
		}
		return raisedSalary;
	}
	void getInfo() {
		System.out.println("Adı : "+name);
		System.out.println("Maaşı : "+salary);
		System.out.println("Çalışma Saati : "+workHours);
		System.out.println("Başlangıç yılı : "+hireYear);
		System.out.println("Vergi : "+tax());
		System.out.println("Bonus : "+bonus());
		System.out.println("Maaş Artışı : "+raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+(salary+bonus()-tax()));
		System.out.println("Toplam Maaş : "+(salary+raiseSalary()+bonus()-tax()));
	}

}
