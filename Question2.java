import java.util.ArrayList;
import java.util.Date;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();

        list.add(new loan(500));
        list.add(new Date());
        list.add("ABC");
        list.add(new circle(15));

        for (Object i : list) {
            System.out.println(i);
        }

    }
}

class loan {
    private double loan;

    public loan() {

    }

    public loan(double amount) {
        loan = amount;
    }
    
    public String toString() {
        return ("Loan amount " + loan);
    }
}

class circle {
    private double radius;

    public circle() {

    }

    public circle(double radiusF) {
        radius = radiusF;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return ("The area of the circle is " + getArea());
    }
}

