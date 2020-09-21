package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueTable<T extends Team> {
    public String name;
    List<T> teams = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if(teams.contains(team)) {
            System.out.println(team.getName() + " already on the table.");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to the table!");
            return true;
        }
    }

    public void printLeague() {
        Collections.sort(teams);
        for(T t: teams) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
