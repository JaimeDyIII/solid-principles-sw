package Exercise3;

public class Iphone implements Callable, Messagable, WebBrowseable, PictureTakeable{
    @Override
    public void makeCall(String number){
        System.out.println("The Iphone is calling: " + number);
    }

    @Override
    public void sendSMS(String number, String message){
        System.out.println("The Iphone is sending \"" + message + "\" to the number: " + number);
    }

    @Override
    public void browseWeb(String url){
        System.out.println("The Iphone is browsing web, current url: " + url);
    }

    @Override
    public void takePicture(){
        System.out.println("Picture taken from Iphone!");
    }
}
