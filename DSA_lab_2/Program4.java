package DSA_lab_2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real part of complex number 1 :");
        int r1=sc.nextInt();
        System.out.print("Enter the real real of complex number 1 :");
        int i1=sc.nextInt();
        System.out.print("Enter the imaginary part of complex number 2 :");
        int r2=sc.nextInt();
        System.out.print("Enter the imaginary real of complex number 2 :");
        int i2=sc.nextInt();
        int sum1=r1+i1;
        int sum2 = r2+i2;
        System.out.println("sum = ("+sum1+" , "+sum2+"i)");
        int dif1=r1-i1;
        int dif2 = r2-i2;
        System.out.println("difference = ("+dif1+" , "+dif2+"i)");
        int pro1=r1*i1;
        int pro2 = (r2*i2)-1;
        System.out.println("product = ("+pro1+" , "+pro2+")");


    }
}
