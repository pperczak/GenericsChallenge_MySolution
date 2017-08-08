package com.company;

import java.util.ArrayList;

/**
 * Created by PLPK on 08.08.2017.
 */
public class LeagueTable<T extends Team> {

    private String name;
    private ArrayList<T> tabela;

    public LeagueTable(String name) {
        this.name = name;
        tabela = new ArrayList<>();
    }


    public  boolean addTeamToLeague(T team ) {
        if (tabela.contains(team)) {
            System.out.println("Niestety jest tu już taki team: "+team.getName());
            return false;
        }else {
            tabela.add(team);
            return true;
        }
    }

    public void listTeamsInLeague() {
        if (tabela.isEmpty()) {
            System.out.println("Tabela ligowa pusta :(");
        }else {
            for (int i = 0;i<tabela.size();i++) {
                String result = String.format("%10s W: %2$d L: %3$d D: %4$d, P: %5$d Rank: %6$d",tabela.get(i).getName(),tabela.get(i).getWon(),tabela.get(i).getLost(),tabela.get(i).getTied(),tabela.get(i).getPlayed(),tabela.get(i).ranking());
                System.out.println(result);
            }
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getTabela() {
        return tabela;
    }
}
