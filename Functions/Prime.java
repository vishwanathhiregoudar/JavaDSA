package Functions;

// public class Prime {
//     public static boolean isPrime(int n){
//         for(int i= 2;i<=n-1;i++){
//             if(n % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         System.out.println(isPrime(3));
//     }
    
// }





////Prime in Range

public class Prime{
    public static boolean isPrime(int n){
        for(int i= 2;i<=n-1;i++){
            if(n % i == 0){                
                return false;
            }
        }
        return true;
    }
    public static void primeRange(int n){
        for(int i=2;i<=n-1;i++){
            if(isPrime(i)){
                System.out.println(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primeRange(20);
    }
    
}
