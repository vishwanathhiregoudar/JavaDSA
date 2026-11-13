public class Constructors {
    public static void main(String args[]){
        Student s1 = new Student(314);
        Student s2 = new Student("Vishwa");
        Student s3 = new Student("Kumar");
        Student s4 = new Student('F');
        System.out.println(s1.roll +" " + s2.name + " " + s3.name +" " + s4.section);
        
    }

}

    class Student{
        String name;
        int roll;
        char section;

        Student(String name){    //parameterized constructor
            this.name = name;
        }
        Student(int roll){
            this.roll = roll;
        }

        Student(char section){
            this.section = section;
        }
    }
    

