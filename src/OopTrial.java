
class Phone{
    String brand;
    int battery;


    Phone(String brand, int battery){
        this.brand = brand;
        this.battery = battery;

    }

    void call(){
        System.out.println("Your: "+brand+" Is Ringing");
    }

    void charge(){
        if(battery >= 0 && battery <= 40){
            System.out.println("Your battery is: "+battery+"% Please plug it!");
        }
        else {
            System.out.println("Your battery is: "+battery+"% Enjoy browsing");

        }
    }
}
public class OopTrial{
    public static void main(String[] args){
        Phone phone1 = new Phone("OPPO A3X",41);
        phone1.call();
        phone1.charge();
    }
}