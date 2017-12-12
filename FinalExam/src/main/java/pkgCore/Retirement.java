package pkgCore;

import java.util.Scanner;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	//TODO: Build the constructor, getters and setters for the attributes above.
	public int getiYearsToWork() {
		return this.iYearsToWork;
	}
	public void setiYearsToWork(int num) {
		this.iYearsToWork= num;
	}
	public double dAnnualReturnWorking() {
		return this.dAnnualReturnWorking;
	}
	public void dAnnualReturnWorking(int num) {
		this.dAnnualReturnWorking= num;
	}
	public int iYearsRetired() {
		return this.iYearsRetired;
	}
	public void iYearsRetired(int num) {
		this.iYearsRetired= num;
	}
	public double dAnnualReturnRetired() {
		return this.dAnnualReturnRetired;
	}
	public void dAnnualReturnRetired(int num) {
		this.dAnnualReturnRetired= num;
	}
	public double dRequiredIncome() {
		return this.dRequiredIncome;
	}
	public void dRequiredIncome(int num) {
		this.dRequiredIncome= num;
	}
	public double dMonthlySSI() {
		return this.dMonthlySSI;
	}
	public void dMonthlySSI(int num) {
		this.dMonthlySSI= num;
	}
	
	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		Scanner user_input= new Scanner(System.in);
		String iYearsToWork;
		System.out.println("How many years do you plan to work? ");
		iYearsToWork= user_input.next();
		
		String ExpectedAverageReturn;
		System.out.print("What is your expected average return on investment? ");
		ExpectedAverageReturn= user_input.next();
		
		String HowLongDraw;
		System.out.print("How long do you plan to draw on your retirement funds? ");
		HowLongDraw= user_input.next();
		
		String RequiredIncome;
		System.out.print("What is your required income? ");
		RequiredIncome= user_input.next();
		
		String SSIncome;
		System.out.print("What is your social security income? ");
		SSIncome=user_input.next();
		
		
		return 0;
	}
	
	public double TotalAmountSaved()
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		
		return 0;
	}
}
