package ua.ithillel.course01.lesson05;

public class JavaDeveloper extends Employee {

    private final String POSITION = "Java Developer";
    private final String SENIORITY = "Senior";
    public JavaDeveloper(String name) {
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
