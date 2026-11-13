public class Copyconstr {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Vishwa";
        s1.roll = 314;
        s1.passward = "India";
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 98;

        Student s2 = new Student(s1);
        s2.passward = "Karnataka";
        //s1.marks[2] = 100;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        System.out.println(s1.name + " " +s1.roll + " " +s1.passward +" " +s2.passward);
    }
    
}

class Student{
    String name;
    int roll;
    String passward;
    int marks[];

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.passward = s1.passward;
        this.marks = s1.marks;
    }

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called...");
    }
    
    
}
