// public class Practice {
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name = "Vishwa";
//         s1.roll = 314;
//         s1.password = "India";
//         s1.marks[0] = 100;
//         s1.marks[1] = 99;
//         s1.marks[2] = 98;

//         Student s2 = new Student(s1);
//         s2.password = "Karnataka";
//         //s1.marks[2] = 100;

//         for(int i=0;i<3;i++){
//             System.out.println(s2.marks[i]);
//         }
//         System.out.println(s1.name + " " +s1.roll + " " +s2.password);
//     }
    
// }

// class Student{
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     //shallow copy constructor
//     Student(Student s1){
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.marks = s1.marks;
//     }

    // //deep copy constructor
    //     Student(Student s1){
    //         marks = new int[3];
    //         this.name = s1.name;
    //         this.roll = s1.roll;
    //         for(int i=0;i<marks.length;i++){
    //             this.marks[i] = s1.marks[i];
    //         }
    //     }

//     Student(){
//         marks = new int[3];
//         System.out.println("Constructor is called...");
//     }
//     Student(String name){
//         marks = new int[3];
//         this.name = name;
//     }
//     Student(int roll){
//         marks = new int[3];
//         this.roll = roll;
//     }
// }



public class Practice {
    public static void main(String args[]) {

        Book b1 = new Book(150);
        Book b2 = new Book(250);

        System.out.println(Book.count);
    }

    static class Book {
        int price;
        static int count;

        public Book(int price) {
            this.price = price;
            count++;
        }
    }
}