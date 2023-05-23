package ua.ithillel.course02.lesson08.task00;

import ua.ithillel.course02.lesson08.task00.mobile.Mobile;
import ua.ithillel.course02.lesson08.task00.mobile.MobilePhoneUtils;
import ua.ithillel.course02.lesson08.task00.mobile.Model;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n*** Lesson 8 *** Task 1.1 ***\n");

        Model samsungPhone = new Model("Samsung", "A24", "Android",
                "MediaTek", "+380986416363");
        Model iPhone = new Model("Apple iPhone", "13", "iOS",
                "A15 Bionic", "+380959595123");
        Model xiaomiPhone = new Model("Xiaomi", "Readme Note 12", "Android",
                "Qualcomm", "+380959555123");

        Model[] phoneModelsArray = {samsungPhone, iPhone, xiaomiPhone};
        Mobile[] mobilesArray = {samsungPhone, iPhone, xiaomiPhone};

        MobilePhoneUtils.printPhoneSpecifications(phoneModelsArray);
        MobilePhoneUtils.printMobileSpecifications(mobilesArray);
    }
}
