package shri.sharma;


import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int loss = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Team(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)){
            System.out.println((/*(Player)*/ player).getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println((/*(Player)*/ player).getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayer() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;
        if (ourScore > theirScore) {
            won++;
            message = " Beat";
        } else if (ourScore == theirScore) {
            tied++;
            message= " Tied to";
        } else {
            loss++;
            message = " lost to";
        }
        played++;
        if (opponent !=null) {
            System.out.println(this.getName() +  message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return  (won *2) +tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return  -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
