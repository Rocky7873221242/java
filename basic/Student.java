class Student1 {

	int rollno;
	String name;
	float fee;

	Student1(int roll, String na, float fe) {
		rollno = roll;
		name = na;
		fee = fe;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class Student {
	public static void main(String args[]) {
		Student1 s1 = new Student1(111, "ankit", 5000f);
		Student1 s2 = new Student1(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
