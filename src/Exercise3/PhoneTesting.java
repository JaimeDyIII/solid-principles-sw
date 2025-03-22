package Exercise3;

public class PhoneTesting {
    public static void main(String[] args){
        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();
        BasicPhone nokia = new BasicPhone();

        iphone.makeCall("09123456789");
        iphone.sendSMS("09123456789", "Hello");
        iphone.browseWeb("https://google.com");
        iphone.takePicture();

        System.out.println();

        samsung.makeCall("09123456789");
        samsung.sendSMS("09123456789", "Hello");
        samsung.browseWeb("https://google.com");
        samsung.takePicture();

        System.out.println();

        nokia.makeCall("09123456789");
        nokia.sendSMS("09123456789", "Hello");
    }
}
