package Exercise3;

public class Samsung implements Callable, Messagable, WebBrowseable, PictureTakeable{
    @Override
    public void makeCall(String number){
        System.out.println("The Samsung is calling: " + number);
    }

    @Override
    public void sendSMS(String number, String message){
        System.out.println("The Samsung is sending \"" + message + "\" to the number: " + number);
    }

    @Override
    public void browseWeb(String url){
        System.out.println("The Samsung is browsing web, current url: " + url);
    }

    @Override
    public void takePicture(){
        System.out.println("Picture taken from Samsung!");
    }
}
