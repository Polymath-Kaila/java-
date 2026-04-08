
import java.time.LocalTime;

class BillSystem{

    //Object Fields
    String name;
    int duration;
    boolean isSameNetwork;

    // GLOBAL VARIABLES
    double ChargePerMin6pmTo6am = 3.00;
    double ChargePerMin6amTo6pm = 4.00;
    double TotalBillAmount = 0.00;
    double VAT = 0.16;
    double NormalCharge;
    double AllNetAndIrrespectiveOfTimeCharge = 0.00;
    double VATCharge=0.00;


    // BILLING TIMEFRAMES
    LocalTime now = LocalTime.now();
    LocalTime start = LocalTime.of(6,0); // 6AM
    LocalTime end = LocalTime.of(18,0); // 6PM

    //OBJECT CONSTUCTOR
    BillSystem(String name,int duration,boolean isSameNetwork){
        this.name = name;
        this.duration = duration;
        this.isSameNetwork = isSameNetwork;
    }
    // CHARGING METHOD
    Void ChargeCustomer(){

        if(!isSameNetwork){
            AllNetAndIrrespectiveOfTimeCharge +=5.00;
        }
        if(now.isAfter(start) && now.isBefore(end)){
            // Normal charge
            NormalCharge = duration * ChargePerMin6amTo6pm;

            // VAT charge
            if(duration >= 2){
                VATCharge = VAT * NormalCharge;
            }

            // Total Bill Amount
            TotalBillAmount = AllNetAndIrrespectiveOfTimeCharge + NormalCharge + VATCharge;


        }
        else{

            // Normal charge
            NormalCharge = duration * ChargePerMin6pmTo6am;

            // VAT charge
            if(duration >= 2){
                VATCharge = VAT * NormalCharge;
            }

            // Total Bill Amount
            TotalBillAmount = AllNetAndIrrespectiveOfTimeCharge + NormalCharge + VATCharge;
        }
        System.out.println("THANK YOU "+name+" FOR USING KAITEL");
        System.out.println("YOUR TOTAL BILL AMOUNT IS KSH: " +TotalBillAmount);

        return null;
    }
}

public class BillingSystemOop {
    public static void main(String[] args){
        System.out.println("WELCOME TO KAITEL CALL CENTER");
        LocalTime now = LocalTime.now();
        System.out.println("CURRENT TIME IS: "+now);

        BillSystem customer1 = new BillSystem("FIDEL",30,false);
        BillSystem customer2 = new BillSystem("ENOCK",45,false);
        BillSystem customer3 = new BillSystem("KAILA",67,false);
        customer1.ChargeCustomer();
        customer2.ChargeCustomer();
        customer3.ChargeCustomer();

    }






}