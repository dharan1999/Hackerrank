//Assignment 1 (Part-2 B)
//Copyright:-  Dharan Thaker
//Written by:- Dharan Thaker (40194790)
package Hackerrank;

import java.util.Scanner;

//import Assignments.Vaccine.Brand;

public class Driver1 {

public static void main(String[] args) {
		

	//Created the Vaccine_data class array of objects
	Vaccine_data1[] inventory = new Vaccine_data1[15];
	
	//count variable for keeping the recursion calls intact
	int count = 0;
	
	//keeps track of number of objects created in inventory
	int checkInventory = 0;
	//calls the switchCase funtion with count, inventory and checkInventory as parameters
	switchCase(count,inventory,checkInventory);

}
public static void switchCase(int count,Vaccine_data1[] inventory,int checkInventory) {
	
	Scanner sc = new Scanner(System.in);
	//Stored the value obtained from front_display function in n variable, which is later passed to 
	// the switch statement as a parameter that shows which option the user has chosen.
	int n = front_display();
	
	switch (n) {
	case 1: 
		
		//Loop for asking the password 3 times if found incorrect
		// if the password is found correct, it will execute code inside the if statement and break
		for(int i=0;i<3;i++) {
			
			// Checking for password,
			//if found correct, goes into if statement (password is set to "password" as was advised to us) 
			System.out.println("Enter password please:");
			String check = sc.next();
			String password = "password";
			if(check.equals(password)) {
				// This asks for Vaccine data from the users 
				System.out.println("Enter ID of the vaccine");
				int id = sc.nextInt();
				System.out.println("Enter brand of vaccine");
				String s = sc.next();
				Vaccine_data1.Brand2 br = Vaccine_data1.Brand2.valueOf(s);
				System.out.println("Enter Dose");
				int dose = sc.nextInt();
				System.out.println("Enter Expiry date");
				sc.nextLine();
				String expiry_date = sc.nextLine();
				System.out.println("Enter price");
				double price = sc.nextDouble();
				//Creates the object and store it in the inventory
				inventory[checkInventory] = new Vaccine_data1(id,br,dose,expiry_date,price);
				checkInventory++;
				System.out.println("------------");
				System.out.println("------------");
			
				break;
				
			}else {
				
				System.out.println("Incorrect password please enter again");
				count++;
				System.out.println("count value"+count);
			}
		}
		//count = 12 will terminate the program with message written
		//else it will make a recursive call to the same function along with latest values of count and checkInventory
		if(count == 12) {
			System.out.println("Program detected suspicious activities and will terminate immediately!");
			System.exit(0);
		}else {
			switchCase(count,inventory,checkInventory);
		}
		
	case 2 :
		int count1=0;
		//Loop for asking the password 3 times if found incorrect
		// if the password is found correct, it will execute code inside the if statement and break
		for(int i=0;i<3;i++) {
			// Checking for password,
			//if found correct, goes into if statement (password is set to "password" as was advised to us) 
			
			System.out.println("Enter password please:");
			String check = sc.next();
			String password = "password";
			if(check.equals(password)) {
				//calls the updateInfo function, which will return if the idnum entered is a valid one
				int idnum = updateInfo(inventory,checkInventory);
				//This will display the information for the id number entered
				inventory[idnum].display(idnum);
				System.out.println("-----------");
				// switchCase2 function will display the options for user to change the information of vaccine associated with the id number
				switchCase2(inventory,idnum,sc);
				
			}else {
				System.out.println("Incorrect password please enter again");
				count1++;
			}
		}
		//different behaviour from case 1 and it calls the main switchCase function
		if(count1 == 3) {
			int count11 = 0;
			switchCase(count11,inventory,checkInventory);
		}
		break;
		
	case 3: 
		//this below function will fetch all the vaccines by the brand name entered by the user
		
		findVaccinesBy(inventory,sc,checkInventory);
		int count3 = 0;
		switchCase(count3,inventory,checkInventory);
		break;
	case 4:
		//This function will fetch all the vaccines that are cheaper than the price specified by the user
		findCheaperThan(inventory,sc,checkInventory);
		int count4 = 0;
		switchCase(count4,inventory,checkInventory);
		break;
		
	case 5:
		System.out.println("Thanks for visiting Concordia Pharmacy.Please visit again");
		System.out.println("Program ended");
		System.exit(0);
	}
	
}
public static void findCheaperThan(Vaccine_data1[] inventory,Scanner sc,int checkInventory) {
	
	
	System.out.println("Enter the price of the vaccine");
	double price = sc.nextDouble();
	int i=0;
	int check1=-1;
	//Checks until the number of vaccines present inside the inventory
	while(inventory[i] != null) {
		//Displays the information of all the vaccines which are cheaper than the price specified
		if(inventory[i].getPrice() < price) {
			inventory[i].display(i);
		
		
		}else if(inventory[i].getPrice() >= price){
			check1++;
		}
		
		i++;
	}
	
	if(check1 == i) {
		System.out.println("No Vaccines are under the price that you entered");
		System.out.println("Please enter a valid brand name");
		findCheaperThan(inventory,sc,checkInventory);
	}
	
}
public static void findVaccinesBy(Vaccine_data1[] inventory,Scanner sc,int checkInventory) {
	System.out.println("Enter the vaccine brand name");
	String s123 = sc.next();
	Vaccine_data1.Brand2 br = Vaccine_data1.Brand2.valueOf(s123);
	int i=0;int check1=-1;
	//Checks until the number of vaccines present inside the inventory
	while(inventory[i] != null) {
		//checks for all the vaccines that have same vaccine brand name as entered by user
		if(inventory[i].getBr1() == br) {
			inventory[i].display(i);
		}else if(inventory[i].getBr1() != br){ 
			check1++;
			}
		System.out.println(check1+" "+i);
	
		i++;
	}
	if(check1 == i) {
		System.out.println("No Vaccines under the vaccine brand name were found");
		System.out.println("Please enter a valid brand name");
		findVaccinesBy(inventory,sc,checkInventory);
	}
	
}
public static void switchCase2(Vaccine_data1[] inventory,int idnum,Scanner sc) {
	//This function displays the information would want to change in the vaccine
	System.out.println("-----------------------");
	System.out.println("-----------------------");
	System.out.println("What information would you like to change?");
	System.out.println("1. Brand");
	System.out.println("2. Dose");
	System.out.println("3. Expiry");
	System.out.println("4. Price");
	System.out.println("5. Quit");
	System.out.println("-----------------------");
	System.out.println("-----------------------");
	//selection of which thing the user wants to change of the vaccine data
	System.out.println("Enter your choice >");
	int n2 = sc.nextInt();
	switch (n2) {
	case 1 : 
		
		String br = sc.next();
		//changes the brand name
		inventory[idnum].setBr1(br);
		inventory[idnum].display(idnum);
		switchCase2(inventory,idnum,sc);
	
	case 2 :
		//changes the dose
		int dose = sc.nextInt();
		inventory[idnum].setDose(dose);
		inventory[idnum].display(idnum);
		switchCase2(inventory,idnum,sc);
	
	case 3 : 
		//changes the expiry date
		String Expiry = sc.next();
		inventory[idnum].setExpiry_date(Expiry);
		inventory[idnum].display(idnum);
		switchCase2(inventory,idnum,sc);
	
	case 4 : 
		//changes the price
		double price = sc.nextDouble();
		inventory[idnum].setPrice(price);
		inventory[idnum].display(idnum);
		switchCase2(inventory,idnum,sc);
	
	case 5 : 
		//exits the program
		System.out.println("Thanks for visiting Concordia Pharmacy.Please visit again");
		System.out.println("Program ended");
		System.exit(0);
	
	default : 
		System.out.println("Invalid choice. Enter a valid number between 1 - 5");
		switchCase2(inventory,idnum,sc);
	
	}
	
	
	
}
public static int updateInfo(Vaccine_data1[] inventory,int checkInventory) {
	//This function will ask the user of which vaccine number the user wants to update 
	System.out.println("Which vaccine number you wish to update?");
	Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
	int counter = 0;
		//If the number entered is not valid and/or is not inside the inventory, it will 
		// ask for entering the number again or return to the main menu
		if(inventory[id] == null || id >= inventory.length) {
			System.out.println("Sorry the id you entered is incorrect. Do you wish to re-enter the ID or would like to quit? (Press 1 for reenterring ID and 2 for quit)");
			int id1 = sc.nextInt();
			if(id1 == 1) {
				updateInfo(inventory,checkInventory);
			}else if(id1 == 2) {
				int count2 = 0;
				switchCase(count2,inventory,checkInventory);
			}
		}
	
	//if the number entered is correct, it will return the id
	return id;
}

//This the main menu display 
public static int front_display() {
	Scanner sc = new Scanner(System.in);
	System.out.println("-----------------------");
	System.out.println("-----------------------");
	System.out.println("Hello and Welcome to Concordia Pharmacy!");
	System.out.println("What do you what to do?");
	System.out.println("1. Enter new Vaccines (password required)");
	System.out.println("2. Change information of a vaccine (password required)");
	System.out.println("3. Display all vaccines by a specific brand");
	System.out.println("4. Display all vaccines under a certain price");
	System.out.println("5. Quit");
	System.out.println("-----------------------");
	System.out.println("-----------------------");
	System.out.println("Please enter your choice >");
	int n = sc.nextInt();
	return n;
	
}

}
//Vaccine_data class which contains data regarding the vaccine
class Vaccine_data1 {

//Declaring the class variables
public enum Brand2 {
	Astrazeneca, Moderna, Pfizer}
double price;
int id;
String expiry_date;
int dose;
private Brand2 br1;
//initialized the parameterized constructor
public Vaccine_data1(int id,Brand2 br,int dose,String expiry_date, double price) {
	this.br1 = br;
	this.price = price;
	this.id = id;
	this.expiry_date = expiry_date;
	this.dose = dose;
}
//Getters and setters for the class variables
public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getExpiry_date() {
	return expiry_date;
}

public void setExpiry_date(String expiry_date) {
	this.expiry_date = expiry_date;
}

public int getDose() {
	return dose;
}

public void setDose(int dose) {
	this.dose = dose;
}

public Brand2 getBr1() {
	return br1;
}

public void setBr1(String s) {
	Brand2 br12 = Brand2.valueOf(s);
	this.br1 = br12;
}

//The below mentioned display method shows the relevant vaccine data according to the index specified
public void display(int x) {
	System.out.println("-----------------------");
	System.out.println("-----------------------");
	System.out.println("Vaccine: "+x);
	System.out.println("ID: " + id);
	System.out.println("Brand: " + br1);
	System.out.println("Dose: "+ dose);
	System.out.println("Expiry: "+expiry_date);
	System.out.println("Price: " + price);
	System.out.println("-----------------------");
	System.out.println("-----------------------");
	}
	
}