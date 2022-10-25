public class CubbyHole {
	private int content;
	private boolean algoParaComsumir = false;
	
	public void set(int producer, int value) {
		content = value;
		System.out.printf("Produtor: %d produzido %d\n", producer, value);
		algoParaComsumir = true;
	}
	
	public int get(int consumer) {
		System.err.printf("Consumidor: %d consumiu %d\n", consumer, content);
		algoParaComsumir = false;
		return content;
	}
	public boolean getAlgoParaComsumir() {
		return algoParaComsumir;
	}
}