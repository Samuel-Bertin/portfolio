import java.util.ArrayList;
import java.util.List;

public class DecompositionEnFacteursPremiers {
	List<Integer> factors;

	public List<Integer> compute(int n) {
		
		this.factors = new ArrayList<Integer>();
		
		for (int p = 2; p <= n; p++) {
			while (n%p == 0 && n != 0) {
				this.factors.add(p);
				n = n/p;
			}
		}

		if (n > 1) {
			this.factors.add(n);
		} 
		return factors;
	}
}