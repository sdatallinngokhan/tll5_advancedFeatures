package week6.oop.association.aggregation;

import java.util.List;

public class Team {

    private Manager manager; // here is aggregation. because Team has-a Manager
    private String name;
    private List<String> teamMembers;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<String> teamMembers) {
        this.teamMembers = teamMembers;
    }
}
