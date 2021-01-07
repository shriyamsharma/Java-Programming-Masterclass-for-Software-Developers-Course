package shri.sharma;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer shri = new FootballPlayer("Shriyam");
	    BaseBallPlayer nit = new BaseBallPlayer("Nit");
	    SoccerPlayer sat = new SoccerPlayer("Sat");

	    Team<FootballPlayer> india = new Team<>("India");
	    india.addPlayer(shri);
//	    india.addPlayer(nit);
//	    india.addPlayer(sat);

        System.out.println(india.numPlayer());

        Team<BaseBallPlayer> baseBallTeam = new Team<>("IndianBase");
        baseBallTeam.addPlayer(nit);

        Team<SoccerPlayer> brokenTeam = new Team<>("Not working");
        brokenTeam.addPlayer(sat);

		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		FootballPlayer banks = new FootballPlayer("Gordon");
		melbourne.addPlayer(banks);

		Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
		Team<FootballPlayer> fremantle= new Team<>("Fremantle");

		hawthorn.matchResult(fremantle, 1, 0);
		hawthorn.matchResult(india, 3, 8);

		india.matchResult(fremantle, 2, 1);
//		india.matchResult(baseBallTeam, 1, 1);

		System.out.println("Ranking");
		System.out.println(india.getName() + ": " + india.ranking());
		System.out.println("Melbourne");
		System.out.println(melbourne.getName() + ": " + melbourne.ranking());
		System.out.println(fremantle.getName() + ": " + fremantle.ranking());
		System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

		System.out.println("*******************************************");
		System.out.println(india.compareTo(melbourne));
		System.out.println(fremantle.compareTo(melbourne));
    }
}
