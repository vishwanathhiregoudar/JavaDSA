public class GetBit {
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n,int i,int newBit){
        n = clearIthBit(n,i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }

    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    public static int fastExpo(int a ,int n){
        int ans = 1;

        while(n>0){
            if((n&1) != 0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    


    public static void main(String args[]){
        System.out.println(getIthBit(10,1));
        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10,1));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(isPowerOfTwo(8));
        System.out.println(fastExpo(3,5));
    }
}
