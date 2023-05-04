package ua.ithillel.course01.lesson05;

import java.util.Arrays;

public class Manager extends Employee {

    private final String POSITION = "Manager";
    private final String SENIORITY = "Senior";
    private final String lastName;
    private Employee[] team;

    public Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public void setTeamMembers(Employee... team) {
        this.team = new Employee[team.length];
        System.arraycopy(team, 0, this.team, 0, team.length);
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
        return super.getInfo() + " " + lastName + " is a " + getSeniority() + " " + getPosition()
                + " and has a team of " + team.length + " members: " + Arrays.toString(team);
    }

}
