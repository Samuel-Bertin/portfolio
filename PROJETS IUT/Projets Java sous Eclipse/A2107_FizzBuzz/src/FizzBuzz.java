
public class FizzBuzz {
	
	private String [] tab;
	
	public FizzBuzz() {
		this.tab = new String[100];
		this.initialiser(tab);
	}
	
	public String [] getTab() {
		return this.tab;
	}
	
	public void initialiser(String [] tab) {
		for (int i=0; i<100; i++) {
			
			tab[i] = ""+i;

			if ((i+1)%3 == 0) {
				tab[i] = "Fizz";
			}
			if ((i+1)%5 == 0) {
				tab[i] = "Buzz";
			}
			
			if ((i+1)%3 == 0 && (i+1)%5 == 0) {
				tab[i] = "FizzBuzz";
			} 

		}
	}
	
}
