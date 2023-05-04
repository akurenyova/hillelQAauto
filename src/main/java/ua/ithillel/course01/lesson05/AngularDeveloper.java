package ua.ithillel.course01.lesson05;

public class AngularDeveloper extends Employee {

    private final String POSITION = "Angular Developer";
    private final String SENIORITY = "Middle";
    public AngularDeveloper(String name) {
        super(name);
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
        return super.getInfo() + " is a " + getSeniority() + " " + getPosition();
    }

}
