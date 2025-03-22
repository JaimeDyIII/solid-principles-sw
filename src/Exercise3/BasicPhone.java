package Exercise3;

public class BasicPhone implements Callable, Messagable{
    @Override
    public void makeCall(String number){
        System.out.println("The Basic Phone is calling: " + number);
    }

    @Override
    public void sendSMS(String number, String message){
        System.out.println("The Basic Phone is sending \"" + message + "\" to the number: " + number);
    }
}
