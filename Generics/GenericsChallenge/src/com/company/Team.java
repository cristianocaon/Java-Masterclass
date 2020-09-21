package com.company;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int tied = 0;
    int lost = 0;

    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public boolean addMember(T player) {
        if(members.contains(player)) {
            System.out.println(player.getName() + " already on the roster.");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " added to the roster! (" + this.name + ")");
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " tied with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(team.ranking(), this.ranking());
    }

    public int ranking() {
        return (won * 2) + tied;
    }


    public String getName() {
        return name;
    }
}
