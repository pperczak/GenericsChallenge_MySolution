package com.company;

/**
 * Created by PLPK on 08.08.2017.
 */
public class Team implements Comparable<Team>{
    private String name;

    private int played=0;
    private int won=0;
    private int lost=0;
    private int tied=0;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, int played, int won, int lost, int tied) {

        this.name = name;
        this.played = played;
        this.won = won;
        this.lost = lost;
        this.tied = tied;
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public void matchResult(Team opponent , int ourScore, int theirScore) {

        String message;
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        }else if (ourScore == theirScore) {
            tied++;
            message = " drew with";
        }else {
            lost++;
            message = " lost to ";
        }
        played++;

        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking() {
        return (this.won*2 + this.tied);
    }

    @Override
    public int compareTo(Team t) {
        if (this.ranking() > t.ranking()) {
            return -1;
        } else if (this.ranking() < t.ranking()) {
            return 1;
        }else {
            return 0;
        }
    }
}

