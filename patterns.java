//APNA COLLEGE JAVA DSA LEC 5

//Q1 SOLID RECTANGLE PROBLEM
import java.util.*;

public class patterns {
    public static void main(String[] args) {
    //     int n=4;
    //     int m=5;
    //     //Outer loop
    //     for(int i=1;i<=n;i++){
    //         //Inner loop
    //         for(int j=1;j<=5;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();  //For printing next row
    //     }



    //Q2. Hollow Reectangle
    // int n=4;
    // int m=5;
    // //Outer loop
    // for(int i=1;i<=n;i++){
    //     // Inner loop
    //     for(int j=1;j<=m;j++){
    //         //cell-->(i,j)
    //         if(i==1 || j==1 || i==n || j==m){  // || --> Or
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");  //Used for giving space in non reqd coordinates
    //         }

    //     }
    //     System.out.println();  //For printing next row
    // }



    //Q3 Half Pyramid
    // int n=4;
    // for(int i=1;i<=4;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
   

    //Q4 Inverted half pyramid
    // int n=4;
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }



    //Q5 Inverted Half Pyramid(Rotated by 180 degree)
    //     int n=4;
    // //outer loop-> for rows
    // for(int i=1;i<=n;i++){
    //     //inner loop-> space print
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     //inner loop-> star print
    //     for(int j=1;j<=i;j++){        //Again j used as prev j's value got over as for loop ended
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
  

    //Q6. HALF PYRAMID WITH NOS

    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }


    //Q7. Inverted half pyramid with nos

    // int n=5;
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }



    //Q8 Floyd's triangle
    // int n=5;
    // int no=1;
    // for(int i=1;i<=n;i++){  
    //     for(int j=1;j<=i;j++){
    //         System.out.print(no+ " ");  //logic desc in notes
    //         no++;
    //     }
    //     System.out.println();
    // }

//    Q9 Print
    //   1
    //   0 1
  //     1 0 1
//       0 1 0 1
//       1 0 1 0 1

         int n=5;
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1" + " ");
                }
                else{
                    System.out.print("0"+ " ");
                }
            }
            System.out.println();
         }
}

}