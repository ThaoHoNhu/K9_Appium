package lab_06;

public class Lab_6_4 {

    public static void main(String[] args) {
        String url = "https://google.com";
        if (url.indexOf("https") >= 0) {
            System.out.println("url contain https");
        } else {
            System.out.println("url contain http");
        }

        if (url.indexOf(".com") >= 0) {
            System.out.println("domain of url is .com");
        } else {
            System.out.println("domain of url is .net");
        }
    }
}
