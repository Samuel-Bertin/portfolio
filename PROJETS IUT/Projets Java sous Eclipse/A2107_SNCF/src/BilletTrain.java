
public class BilletTrain {
	
	float distance;
	
	public static final float[] DISTANCE = {2F, 25F, 50F, 100F, 150F, 300F,  Float.MAX_VALUE};
	public static final int[] BAREMEBORD = {10, 15, 25, 35, 60, 90};
	public static final int[] BAREMECONTROLE = {50, 50, 50, 50, 90, 120};
	
	public BilletTrain(float f) throws IllegalArgumentException {
		if (f <= 2F ) {
			throw new IllegalArgumentException("Distance minimale de 2 km.");
		} this.distance = f;
	}
	
	public int getTarif(boolean b) {
		if (b) {
			return getTarifAvecTable(BAREMEBORD);
		} else {
			return getTarifAvecTable(BAREMECONTROLE);
		}
	}
	
	private int getTarifAvecTable(int[] tableTarif) {
		int i = 0;
		while (this.distance < DISTANCE[i]) {
			i++;
		}
		return tableTarif[i];
	}
}
