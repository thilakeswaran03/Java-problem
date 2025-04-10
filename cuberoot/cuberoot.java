// program to find the cube root of a number without using in-build function....

import java.util.Scanner;

public class cuberoot {
    public static void cuberoot(int n){
        double cube;
        cube = Math.pow(n, (double)1/3);
        System.out.println("the cube root of "+n+" is "+ cube);
    }

    public static void cube(int n){
        double s = 0.0;
        double e = n;
        while(s<=e){
            double mid = (s+e)/2;
            if(mid *mid * mid > n){
                e=mid;
            }
            else if(mid * mid * mid < n){
                s=mid;
            }
            else{
                System.out.println("The cube root of "+n+" is "+mid);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        // cuberoot(num);
        cube(num);
    }
}
