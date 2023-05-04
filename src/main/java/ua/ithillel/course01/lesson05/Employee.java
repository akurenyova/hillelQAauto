package ua.ithillel.course01.lesson05;

public abstract class Employee {
    private final String name;

    protected Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName(){
        return null;
    }

    public abstract String getPosition();

    public abstract String getSeniority();

    public String getInfo(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
