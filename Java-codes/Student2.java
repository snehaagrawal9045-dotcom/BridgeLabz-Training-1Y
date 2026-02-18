class Student2 {

int id;
String name;

Student2() {
this(101, "Rishikesh"); // calls parameterized constructor
System.out.println("Default Constructor Called");
}

// Parameterized constructor
Student2(int id, String name) {
this.id = id;
this.name = name;
System.out.println("Parameterized Constructor Called");
}

void display() {
System.out.println(id + " " + name);
}

public static void main(String[] args) {
Student2 s = new Student2();
s.display();
}
}