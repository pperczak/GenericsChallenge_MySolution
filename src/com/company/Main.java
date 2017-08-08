package com.company;

import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BasketballTeam b1 = new BasketballTeam("Warriors",6,6,0,0);
        BasketballTeam b2 = new BasketballTeam("Hawks",6,3,2,1);
        BasketballTeam b3 = b2;
        BasketballTeam b4 = new BasketballTeam("Bulls",6,5,1,0);
        //BasketballTeam b3 = new BasketballTeam("Hawks",6,3,2,1);
        BasketballTeam b5 = new BasketballTeam("Spurs",6,2,4,0);
        BasketballTeam b6 = new BasketballTeam("Celtics",6,3,0,3);
        BasketballTeam b7 = new BasketballTeam("Bucks",6,1,1,4);

        LeagueTable<BasketballTeam> nba = new LeagueTable<>("NBA ");

        //System.out.println("Adding "+b1.getName()+ " to "+nba.getClass().getSimpleName()+" with result: "+nba.addTeam(b1));
        //System.out.println("Adding "+b2.getName()+ " to "+nba.getClass().getSimpleName()+" with result: "+nba.addTeam(b2));
        //System.out.println("Adding "+b3.getName()+ " to "+nba.getClass().getSimpleName()+" with result: "+nba.addTeam(b3));

        nba.addTeamToLeague(b1);
        nba.addTeamToLeague(b2);
        nba.addTeamToLeague(b3);
        nba.addTeamToLeague(b4);
        nba.addTeamToLeague(b5);
        nba.addTeamToLeague(b6);
        nba.addTeamToLeague(b7);

        BaseballTeam bball1 = new BaseballTeam("Miotacze",9,8,1,0);

        //to nie dziala i dobrze :)
        //nba.addTeamToLeague(bball1);
        System.out.println("Before sorting "+nba.getName());
        nba.listTeamsInLeague();
        System.out.println("===============\n");
        Collections.sort(nba.getTabela());
        System.out.println("After sorting "+nba.getName());
        nba.listTeamsInLeague();
        System.out.println("===============\n");


        BaseballTeam bball2 = new BaseballTeam("Sracze",9,4,4,1);
        BaseballTeam bball3 = new BaseballTeam("Targacze",9,1,6,3);
        BaseballTeam bball4 = new BaseballTeam("Wąsacze",9,6,0,3);
        BaseballTeam bball5 = new BaseballTeam("Mlaskacze",7,3,3,3);

        LeagueTable<BaseballTeam> nbl = new LeagueTable<>("NBL");

        nbl.addTeamToLeague(bball1);
        nbl.addTeamToLeague(bball2);
        nbl.addTeamToLeague(bball3);
        nbl.addTeamToLeague(bball4);
        nbl.addTeamToLeague(bball5);

        //to ma nie dzialac :)
        //nbl.addTeamToLeague(b1);


        System.out.println("Before sorting "+nbl.getName());
        nbl.listTeamsInLeague();
        System.out.println("===============\n");
        Collections.sort(nbl.getTabela());
        System.out.println("After sorting "+nbl.getName());
        nbl.listTeamsInLeague();
        System.out.println("===============\n");

        LeagueTable<VolleyballTeam> volleyball = new LeagueTable<>("PLS");

        VolleyballTeam t1 = new VolleyballTeam("GKS chyba",10,6,2,2);
        VolleyballTeam t2 = new VolleyballTeam("Skra",10,7,1,2);
        VolleyballTeam t3 = new VolleyballTeam("Gorzów",10,9,0,1);
        VolleyballTeam t4 = new VolleyballTeam("AZS AWF PW",10,4,0,6);
        VolleyballTeam t5 = new VolleyballTeam("Kielce",10,3,4,3);

        volleyball.addTeamToLeague(t1);
        volleyball.addTeamToLeague(t2);
        volleyball.addTeamToLeague(t3);
        volleyball.addTeamToLeague(t4);
        volleyball.addTeamToLeague(t5);

        System.out.println("Before sorting "+volleyball.getName());
        volleyball.listTeamsInLeague();
        System.out.println("===============\n");
        Collections.sort(volleyball.getTabela());
        System.out.println("After sorting "+volleyball.getName());
        volleyball.listTeamsInLeague();
        System.out.println("===============\n");



    }

}
