# PATTERNS_PROBLEMS
import java. util.*;

public class patterns {
    public static void main(String[] args) {
    //Q. Hollow Rectangle
     int n=4;
     int m=5;
     //Outer loop
     for(int i=1;i<=n;i++){
    // Inner loop
         for(int j=1;j<=m;j++){
             //cell-->(i,j)
            if(i==1 || j==1 || i==n || j==m){  // || --> Or
                 System.out.print("*");
             }
             else{
                 System.out.print(" ");  //Used for giving space in non reqd coordinates
             }

         }
         System.out.println();  //For printing next row
     }
}
}

    
