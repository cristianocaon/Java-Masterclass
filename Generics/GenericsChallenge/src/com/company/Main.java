package com.company;

public class Main {

    public static void main(String[] args) {
	    // ArrayList<Team> teams;
        // Collections.sort(teams);
        SoccerPlayer neymar = new SoccerPlayer("Neymar");
        SoccerPlayer mbappe = new SoccerPlayer("Mbappe");
        Team<SoccerPlayer> psg = new Team<>("PSG");
        psg.addMember(neymar);
        psg.addMember(mbappe);

        SoccerPlayer messi = new SoccerPlayer("Messi");
        SoccerPlayer iniesta = new SoccerPlayer("Iniesta");
        Team<SoccerPlayer> barcelona = new Team<>("Barcelona");
        barcelona.addMember(messi);
        barcelona.addMember(iniesta);

        LeagueTable<Team<SoccerPlayer>> uefa = new LeagueTable<>("UEFA");
        uefa.addTeam(barcelona);
        uefa.addTeam(psg);

        psg.matchResult(barcelona, 2, 2);
        psg.matchResult(barcelona, 4, 0);

        System.out.println(psg.ranking());
        System.out.println(barcelona.ranking());

//        uefa.printLeague();

        BasketballPlayer lebron = new BasketballPlayer("LeBron James");
        Team<BasketballPlayer> lakers = new Team<>("Lakers");
//        uefa.addTeam(lakers);

        Team<SoccerPlayer> chelsea = new Team<>("Chelsea");
        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        Team<SoccerPlayer> real_madrid = new Team<>("Real Madrid");

        uefa.addTeam(chelsea);
        uefa.addTeam(liverpool);
        uefa.addTeam(real_madrid);

        chelsea.matchResult(psg, 2, 2);
        chelsea.matchResult(barcelona, 0, 2);
        chelsea.matchResult(real_madrid, 5, 0);

        real_madrid.matchResult(psg, 0, 0);
        real_madrid.matchResult(liverpool, 3, 1);
        real_madrid.matchResult(barcelona, 2, 2);

        liverpool.matchResult(psg, 5, 4);
        liverpool.matchResult(barcelona, 2, 4);
        liverpool.matchResult(chelsea, 0, 4);

        uefa.printLeague();

    }
}
