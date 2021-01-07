package shri.sharma;

public class Main {

	public static void main(String[] args) {
//	    Player player = new Player();
//	    player.name = "shriyam";
//	    player.health = 100;
//	    player.weapon = "Hammer";
//
//	    player.health = 500;
//	    int damage = 50;
//	    player.loseHealth(damage);
//		System.out.println(player.remainingHealth());
//    }

		EnhancedPlayer player = new EnhancedPlayer("shriyam", 50, "Sword");
		System.out.println("Initial health is " + player.getHealth());
		player.loseHealth(50);
		System.out.println(player.getHealth());
	}
}
