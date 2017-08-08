package com.company;

/**
 * Created by PLPK on 08.08.2017.
 */
public class VolleyballTeam extends Team {

    public VolleyballTeam(String name) {
        super(name);
    }

    public VolleyballTeam(String name, int played, int won, int lost, int tied) {
        super(name, played, won, lost, tied);
    }
}
