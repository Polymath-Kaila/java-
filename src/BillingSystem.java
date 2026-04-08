import java.time.LocalTime;
import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args){

        // VARIABLES
        double ChargePerMin6pmTo6am = 3.00;
        double ChargePerMin6amTo6pm = 4.00;
        double TotalBillAmount = 0.00;
        double VAT = 0.16;
        double NormalCharge;
        double AllNetAndIrrespectiveOfTimeCharge = 0.00;
        double VATCharge=0.00;


        System.out.println("WELCOME TO KAITEL CALL CENTER");
        LocalTime now = LocalTime.now();
        System.out.println("CURRENT TIME IS: "+now);

        // BILLING TIMEFRAMES
        LocalTime start = LocalTime.of(6,0); // 6AM
        LocalTime end = LocalTime.of(18,0); // 6PM

        // USER CALL DURATION
        System.out.println("Enter your desired call duration: ");
        Scanner InputDuration = new Scanner(System.in);
        int CallDuration = InputDuration.nextInt();

        // CALL NETWORK
        System.out.println("Making this call to your own network? Enter YES or NO");
        System.out.println(" 1.YES  OR  2.NO");
        Scanner InputNetwork = new Scanner(System.in);
        String Network = InputNetwork.nextLine();

        // CHARGE IRRESPECTIVE OF TIME AND NETWORK CHARGES
        if(Network.equals("NO")){
            AllNetAndIrrespectiveOfTimeCharge +=5.00;
        }

        //TIME BASED BILLS AMOUNT

        if(now.isAfter(start) && now.isBefore(end)){

            //NORMAL CHARGE
            NormalCharge = CallDuration * ChargePerMin6amTo6pm; // First case 6am to 6pm

            //VAT CHARGES
            if(CallDuration >=2){
                VATCharge = VAT * NormalCharge;
            }

            // TOTAL BILL AMOUNT
            TotalBillAmount = AllNetAndIrrespectiveOfTimeCharge + NormalCharge + VATCharge;

        }
        else {

            // NORMAL CHARGE
            NormalCharge = CallDuration * ChargePerMin6pmTo6am;

            // VAT CHARGES
            if(CallDuration >= 2){
                VATCharge = VAT * NormalCharge;

            }
            // TOTAL BILL AMOUNT
            TotalBillAmount = AllNetAndIrrespectiveOfTimeCharge + NormalCharge + VATCharge;

        }
        System.out.println("DEAR CUSTOMER THANK YOU FOR USING KAITEL");
        System.out.println("YOUR TOTAL BILL AMOUNT IS KSH: " +TotalBillAmount);

    }
}