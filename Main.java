import Problems.CountIPAddress;

public class Main {
    public static void main(String[] args) {
        System.out.println(CountIPAddress.solve("20.0.0.0", "20.0.0.50"));
        System.out.println(CountIPAddress.solve("20.0.0.10", "20.0.1.0"));
        System.out.println(CountIPAddress.solve("150.0.0.0", "150.0.0.1"));
        System.out.println(CountIPAddress.solve("0.0.0.0", "255.255.255.255"));
    }
}