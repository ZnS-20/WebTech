class Student{
	Student(){
		System.out.println("Unknown");
	}
	Student(String s){
		System.out.println(s);
	}
}

class thirteen
{
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student("xyz");
	}
}
