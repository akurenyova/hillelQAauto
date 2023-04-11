package org.example.lesson05;

public class AutomationEngineer extends Employee {

    private final String POSITION = "Automation Engineer";
    private final String SENIORITY = "Senior";
    private final String lastName;

    public AutomationEngineer(String name, String lastname) {
        super(name);
        this.lastName = lastname;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPosition() {
        return POSITION;
    }

    @Override
    public String getSeniority() {
        return SENIORITY;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + lastName + " is a " + getSeniority() + " " + getPosition();
    }

}
