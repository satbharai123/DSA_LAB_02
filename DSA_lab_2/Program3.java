package DSA_lab_2;
class Rectangle{
    Rectangle(int l , int w) {
        int area = l*w;
        System.out.println("Area = "+area);
    }
}
public class Program3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        Rectangle s = new Rectangle(5,8);
    }
}
