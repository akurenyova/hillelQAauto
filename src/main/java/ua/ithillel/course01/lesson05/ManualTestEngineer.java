package ua.ithillel.course01.lesson05;

public class ManualTestEngineer extends Employee{

    private final String POSITION = "Manual Test Engineer";
    private final String SENIORITY = "Junior";
    private final String lastName;

    public ManualTestEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
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
