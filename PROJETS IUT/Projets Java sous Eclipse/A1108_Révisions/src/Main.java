
public class Main {
	
	public static void main(String [] args) {
		
		Combat c = new Combat();
		
		Robot r1 = new Robot1G("Alphonse");
		c.addRobot(r1);
		
		Robot r2 = new Robot2G("Bernard", new Position(0,0));
		r2.pivoterGauche();
		c.addRobot(r2);
		
		Robot r3 = new Robot3G("Christophe", new Position(0,0));
		r3.pivoterGauche();
		((Robot3G) r3).setTurbo(true);
		c.addRobot(r3);
		
		c.setCible(new Position(50,122));
		
		c.simulerCombat();
		
	}

	
}
