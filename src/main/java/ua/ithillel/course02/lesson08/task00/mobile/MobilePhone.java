package ua.ithillel.course02.lesson08.task00.mobile;

public abstract class MobilePhone {

    private String name;
    private String phoneType;
    private String osType;
    private String processorType;
    private String phoneNumber;

    public MobilePhone(String name, String phoneType, String osType, String processorType, String phoneNumber) {
        this.name = name;
        this.phoneType = phoneType;
        this.osType = osType;
        this.processorType = processorType;
        this.phoneNumber = phoneNumber;
    }

    public abstract void incomingCall(String incomePhoneNumber);

    public abstract void outgoingCall(String outcomePhoneNumber);

    public abstract void useMessenger();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
