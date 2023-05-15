package ua.ithillel.course02.lesson05;

public class Main {
    public static void main(String[] args) {
        User firstUser = new User();
        User secondUser = new User("secondUser");
        User thirdUser = new User("thirdUser", "qwertyui");

        System.out.println("\n*** Lesson 5 *** Task 1 ***\n");

        System.out.println("* Purchases of " + firstUser.userName);
        firstUser.makePurchase(10);
        firstUser.makePurchase(20);
        firstUser.makePurchase(30);

        System.out.println("\n* Purchases of " + secondUser.userName);
        secondUser.makePurchase(5.5);
        secondUser.makePurchase(15.5);
        secondUser.makePurchase(25.5);
        secondUser.addDiscount(10);

        System.out.println("\n* Purchases of " + thirdUser.userName);
        thirdUser.makePurchase(100.25);
        thirdUser.makePurchase(200.25);
        thirdUser.makePurchase(300.25);
        thirdUser.addDiscount(20);

        System.out.println();

        getUserAmountSpentMoney(firstUser);
        getUserAmountSpentMoney(secondUser);
        getUserAmountSpentMoney(thirdUser);
    }

    public static void getUserAmountSpentMoney(User user) {
        System.out.println(user.userName + " spent ["
                + user.amountSpentMoney + "] amount of money");
    }
}
