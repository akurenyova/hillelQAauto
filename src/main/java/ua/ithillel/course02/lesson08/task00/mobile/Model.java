package ua.ithillel.course02.lesson08.task00.mobile;

public class Model extends MobilePhone implements Mobile {
    public Model(String name, String phoneType, String osType, String processorType, String phoneNumber) {
        super(name, phoneType, osType, processorType, phoneNumber);
    }

    @Override
    public void outgoingCall(String outcomePhoneNumber) {
        System.out.println("Make a phone call to " + outcomePhoneNumber
                + " with " + getPhoneNumber());
    }

    @Override
    public void incomingCall(String incomePhoneNumber) {
        System.out.println("An incoming call is accepted" + incomePhoneNumber
                + " with " + getPhoneNumber());
    }

    @Override
    public void useMessenger() {
        System.out.println("Read messages with " + getOsType());
    }

    @Override
    public void useProcessor() {
        System.out.println("Processor " + getProcessorType() + " is used");
    }

    @Override
    public void useOS() {
        System.out.println("OS type " + getOsType() + " is used");
    }

    @Override
    public void useCamera() {
        System.out.println("Take a photo with " + getOsType());
    }

    @Override
    public void useMusicPlayer() {
        System.out.println("Music plays on " + getOsType());
    }

}
