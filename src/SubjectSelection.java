import java.util.Scanner;

public class SubjectSelection{
    public static void main(String[] args){
        System.out.println("\nWELCOME TO KAILA SCHOOL");
        System.out.print("Choose your Major: ");
        System.out.println("\n1. SCIENCE");
        System.out.println("2. ARTS");
        Scanner MajorInput = new Scanner(System.in);
        String Major = MajorInput.nextLine();
        if(Major.equals("SCIENCE")){
            System.out.print("Choose your science subject: ");
            System.out.println("\n1. Physics");
            System.out.println("2. Chemistry");
            Scanner SubjectInput = new Scanner(System.in);
            String subject = SubjectInput.nextLine();
            if(subject.equals("Physics")){
                System.out.println("BOY! Your science subject is PHYSICS!");

            }
            else if (subject.equals("Chemistry")){
                System.out.println("BOY! Your science subject is CHEMISTRY!");
            }

        }
        else if (Major.equals("ARTS")) {
            System.out.print("Choose your Arts subject: ");
            System.out.println("\n1. History");
            System.out.println("2. CRE");
            Scanner SubjectInput = new Scanner(System.in);
            String subject = SubjectInput.nextLine();
            if (subject.equals("History")) {
                System.out.println("BOY! Your Arts subject is History!");

            } else if (subject.equals("CRE")) {
                System.out.println("BOY! Your Arts subject is CRE!");
            }
        }
        else {
            System.out.println("INVALID MAJOR");

        }
    }
}