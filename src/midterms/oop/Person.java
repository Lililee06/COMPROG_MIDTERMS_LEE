package midterms.oop;

public class Person {

//Variables 
	String name;
	int age; 
	String address;

//to Display attributes 
	void DisplayPersonAttributes() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		
	}

//Main
	public static void main(String[] args) {
		
		//PERSON 1 
		Person person1 = new Person(); 
		person1.name = "Maraiah Queen Arceta";
		person1.age = 24;
		person1.address = "1287 Magsaysay Avenue, Barangay San Antonio, Quezon City, Metro Manila";
		
		//PERSON 2 
		Person person2 = new Person(); 
		person2.name = "Nicolette Vergara";
		person2.age = 23;
		person2.address = "56 Bonifacio Street, Barangay Poblacion, Cebu City, Cebu";
		
		//PERSON 3 
		Person person3 = new Person(); 
		person3.name = "Mikhaela Lim";
		person3.age = 21;
		person3.address = "23 Rizal Avenue, Barangay Balibago, Angeles City, Pampanga";
		
		//PERSON 4 
		Person person4 = new Person(); 
		person4.name = "Jhoanna Robles";
		person4.age = 20;
		person4.address = "789 Dela Cruz Street, Barangay San Roque, Davao City, Davao del Sur";
		
		//PERSON 5 
		Person person5 = new Person(); 
		person5.name = "Mary Loi Ricalde";
		person5.age = 22;
		person5.address = "34 Lopez Jaena Street, Barangay Legazpi, Iloilo City, Iloilo";
		
		// PRINT OUTPUT 
		person1.DisplayPersonAttributes();
		person2.DisplayPersonAttributes();
		person3.DisplayPersonAttributes();
		person4.DisplayPersonAttributes();
		person5.DisplayPersonAttributes();
		
	}
}

	
