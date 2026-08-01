public class OOPS2 {
    public static void main(String[] args) {
        Student s1 = new Student("aryan");
        // Student s2 = new Student();
        s1.name = "Aryan";
        s1.roll = "123";
        s1.marks[0] = 20;
        s1.marks[1] = 40;
        s1.marks[2] = 60;
         
        Student s2 = new Student(s1);
        // for(int i=0; i<3; i++) {
        //     System.out.println(s3.marks[i]);
        // }
        s1.marks[1] = 80;
         for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }





        // System.out.println(s1.name);
    }
}

class Student  {
    String name ;
    String roll ;
    String pass;
    int marks[];

    //shallow copy contructor

    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;

    // }

    // deep copy contrutor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }


    Student(){  // non paramitrised constructor
        marks = new int[3];
        System.out.println("construtor is called");
    }    
    Student(String name) { // paramitrised constructor
        marks = new int[3];
        this.name = name;
    }
}