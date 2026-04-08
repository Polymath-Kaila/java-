// A college grades its students as follows
// 80 - 100 - A
// 70 - 79 - B
// 60 - 69 - c
// 50 - 59 - D
// < 50 - E
import java.util.Scanner;
public class GradingSystem{

    public static void main (String[] args){
        // read input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Mark: ");
        int mark = input.nextInt();

        if (mark >= 80 && mark <= 100 ){
            System.out.println("Your grade is: A");
        }
        else if(mark >=70 && mark <= 79){
            System.out.println("Your Grade is: B");
        }
        else if (mark >= 60 && mark <= 69){
            System.out.println("Your Grade is: C");
        }
        else if (mark >= 50 && mark <= 59){
            System.out.println("Your Grade is: D");
        }
        else if (mark >=0 && mark <=50){
            System.out.println("Your Grade is: E");
        }
        else{
            System.out.println("Invalid mark");
        }
    }
}
