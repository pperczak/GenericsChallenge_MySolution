package com.company;

/**
 * Created by PLPK on 08.08.2017.
 */
public class BaseballTeam extends Team{
    public BaseballTeam(String name) {
        super(name);
    }

    public BaseballTeam(String name, int played, int won, int lost, int tied) {
        super(name, played, won, lost, tied);
    }
}
