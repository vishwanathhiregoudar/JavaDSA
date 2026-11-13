// public class SumOfNatural{
//     public static int sum(int n){
//         if(n == 1){
//             return 1;
//         }
//         int snm1 = sum(n-1);
//         int sn = n + snm1;
//         return sn;
//     }
//     public static void main(String args[]){
//         int n = 5;
//         System.out.println(sum(n));
//     }
// }

// public class SumOfNatural{
//     public static void print(int n){
//         if(n==5){
//             System.out.println(5);
//             return;
//         }
//         System.out.println(n);
//         print(n+1);

//     }

//     public static void main(String args[]){
//         print(1);
//     }
// }

public class SumOfNatural{
    public void printDown(int n){
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        printDown(n-1);
    }

    public void printUp(int n){
        if(n<1) return;
        printUp(n-1);
        System.out.println(n+ " ");
    }

    public static void main(String args[]) {
    SumOfNatural obj = new SumOfNatural();
    obj.printDown(5);
 
}
}