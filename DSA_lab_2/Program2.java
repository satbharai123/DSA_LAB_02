package DSA_lab_2;
class Traingle{
    Traingle(int a,int b,int c){
        int perimeter = a+b+c;
        System.out.println("perimeter = "+perimeter);
        double s = perimeter/2;
        double x= s*(s-a)*(s-b)*(s-c);
        double area = Math.sqrt(x);
        System.out.println("Area = "+x);
    }
}
public class Program2 {
    public static void main(String[] args) {
        Traingle t = new Traingle(3,4,5);
    }
}
