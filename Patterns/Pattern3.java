public class Pattern3 {
    public static void hollow_rectangle(int totRows, int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void inverted_rotated_half_pyramid(int n){
        for(int i=1;i<=n;i++){  //outer
            for(int j=1; j<=n-i; j++){   //spaces
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){     //stars
                System.out.print("*");
            }
            System.out.println();
            
        }
    }



    public static void inverted_half_pyramid_with_num(int n){
        for(int i=1;i<=n;i++){  //outer
            for(int j=1; j<=n-i+1; j++){     // inverted numbers
                System.out.print(j+" ");
            }
            // for(int j=1; j<=n-i; j++){   //spaces
            //     System.out.print(" ");
            // }
            
            System.out.println();
            
        }
    }



    public static void floyds_trianlge(int n){
        int count = 1;
        for(int i=1;i<=n;i++){  //outer
            for(int j=1; j<=i; j++){     //stars
                System.out.print(count+" ");
                count++;
            }
            // for(int j=1; j<=n-i; j++){   //spaces
            //     System.out.print(" ");
            // }
            
            System.out.println();
        }
    }

    

    public static void zero_one_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    public static void butterfly(int n){
        //1st half
        for(int i=0;i<=n;i++){
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){  //spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){       //then again stars
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
       
    }

    public static void solid_rhombus(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //hollow rectangle stars
            for(int j=1;j<=n;j++){
                if(i==1 || i== n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       

        for(int i=n;i>=1;i--){

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void main(String args[]){
        // hollow_rectangle(4,5);
        // inverted_rotated_half_pyramid(4);
        // inverted_half_pyramid_with_num(5);
        // floyds_trianlge(4);
        // zero_one_triangle(5);
        // butterfly(10);
        //solid_rhombus(5);
        //hollow_rhombus(5);
        diamond(4);
    }   

    
}
