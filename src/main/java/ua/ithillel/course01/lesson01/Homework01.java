package ua.ithillel.course01.lesson01;

import java.time.Year;

public class Homework01 {
    public static void main(String[] args) {

        String separator = "* * * * * * *";
        String name = "Anastasiia";
        String surname = "Kurenyova";
        String manualQA = "Manual QA";
        String automationQA = "Automation QA";

        char space = ' ';
        char tab = '\t';
        int age = 34;
        double experienceManual = 3.5;
        double experienceAutomation = 0.5;

        boolean isAutomation = experienceAutomation > experienceManual;
        String mainSkill = isAutomation ? automationQA : manualQA;

        System.out.println(separator + "USER INFO" + separator);
        System.out.println(space);
        System.out.println("Person: " + name + space + surname);
        System.out.println("Age: " + tab + age);
        System.out.println("Experience as Manual QA: " + tab + tab + experienceManual);
        System.out.println("Experience as Automation QA: " + tab + experienceAutomation);
        System.out.println(space);
        System.out.println("Main skill in " + Year.now().getValue() + space + mainSkill);
        System.out.println(space);
        System.out.println(separator + "THE END" + separator);

        int t = 12;

        if (t > 12) {
            System.out.println(t);
        } else if (t == 12) {
            System.out.println(t - 1);
        }

    }
}