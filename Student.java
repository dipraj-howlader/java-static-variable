package StaticKeyword;

public class Student {
	
	String name;
	int id;
	static String uniName = "PSTU";
	
	Student(String n, int i){
		name = n;
		id = i;
		//no need to init UniName because uniName is a static variable
		
	}
	void displayInfo () {
		System.out.println(name);
		System.out.println(id);
		System.out.println(uniName);
	}
	
}
