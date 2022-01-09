import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        System.out.println("****\nThis program gives you the area of a triangle with base and height picked by the user\n****");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter base: ");
        double b = keyboard.nextDouble();
        System.out.print("Enter height: ");
        double h = keyboard.nextDouble();

        double area = AreaOfTriangle(b,h); // Call the other function
        System.out.println("The area of the triangle is: " + area);
        DrawsRectangle();

        System.out.println("Enter an amount of seconds: ");
        int sec = keyboard.nextInt();
        int[] hms = Seconds(sec);
        System.out.println("Those seconds in [hours, minutes, seconds] is: " + Arrays.toString(hms));
    }
    public static double AreaOfTriangle(double base, double height){
        // body of my method //
        return (base*height)/2;
    }
    public static void DrawsRectangle(){
        System.out.println("-----------------------------");
        System.out.println("|                            |");
        System.out.println("|                            |");
        System.out.println("-----------------------------");

    }

    public static int[] Seconds(int sec){
        int hour =  sec / 3600;
        sec = sec % 3600;
        int min = sec / 60;
        sec = sec%60;

        int[] hms =new int[3];
        hms[0] = hour;
        hms[1] = min;
        hms[2] = sec;
        return hms;
    }
}

