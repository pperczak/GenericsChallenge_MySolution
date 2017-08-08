package com.company;

/**
 * Created by PLPK on 08.08.2017.
 */
public class FootballTeam extends Team {

    public FootballTeam(String name) {
        super(name);
    }

    public FootballTeam(String name, int played, int won, int lost, int tied) {
        super(name, played, won, lost, tied);
    }
}
