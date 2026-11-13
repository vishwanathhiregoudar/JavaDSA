public class DecOrder{
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int x){
        if(x== 10){
            System.out.println(x);
            return;
        }
        System.out.print(x+" ");
        printInc(x+1);
    }

    public static void main(String args[]){
        int n = 10;
        printDec(n);
        int x = 1;
        printInc(x);
    }
}