package com.company;

/**
 * Created by PLPK on 08.08.2017.
 */
public class BasketballTeam extends Team {
    public BasketballTeam(String name) {
        super(name);
    }

    public BasketballTeam(String name, int played, int won, int lost, int tied) {
        super(name, played, won, lost, tied);
    }
}
