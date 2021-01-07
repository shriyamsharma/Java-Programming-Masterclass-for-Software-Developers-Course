package shri.sharma;

public class Main {

    public static void main(String[] args) {
	    //ArrayList<Team> teams;
        //Collections.sort(teams);

        League<Team<FootballPlayer>> footballLeague = new League<>("IFL");

        Team<FootballPlayer> india = new Team<>("India");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");
//        Team<BaseBallPlayer> baseBallTeam = new Team<>("IndianBase");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(india, 3, 8);
        india.matchResult(fremantle, 2, 1);

        footballLeague.add(india);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();

        //        footballLeague.add(baseBallTeam);
    }
}
