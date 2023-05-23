package ua.ithillel.course02.lesson08.task00.mobile;

public class MobilePhoneUtils {

    public static void printPhoneSpecifications(Model[] models) {
        System.out.println("\nMobile phones specifications:\n");
        for (Model phone : models) {
            System.out.println("Name: " + phone.getName());
            System.out.println("Phone Type: " + phone.getPhoneType());
            System.out.println("Phone Number: " + phone.getPhoneNumber());
            System.out.println("OS Type: " + phone.getOsType());
            System.out.println("Processor Type: " + phone.getProcessorType());
            System.out.println();
        }
    }

    public static void printMobileSpecifications(Mobile[] mobiles) {
        System.out.println("\nMobiles specifications:\n");
        for (Mobile mobile : mobiles) {
            mobile.useProcessor();
            mobile.useOS();
            mobile.useCamera();
            mobile.useMusicPlayer();
            System.out.println();
        }
    }
}
