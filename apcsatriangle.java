import java.util.Scanner;

public class apcsatriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	System.out.println("Enter a height: ");
	double triangleHeight = in.nextDouble();
	System.out.println("Enter a base length: ");
	double triangleBase = in.nextDouble();
	double triangleArea = (triangleHeight * triangleBase) / 2;
	System.out.printf("The area of a triangle with a height and base of %.1f and %.1f is %.1f." , triangleHeight, triangleBase, triangleArea); 
        in.close();
    }
}