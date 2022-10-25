import java.util.Random;

public class Consumer extends Thread {
	private int id;
	private CubbyHole ch;
	
	public Consumer(int id, CubbyHole ch) {
		this.id = id;
		this.ch = ch;
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized (ch) {
				if(!ch.getAlgoParaComsumir()) {
					try {
						ch.wait();
					} catch (InterruptedException e) {}	
			}
			ch.get(id);
			try {
				Thread.sleep(new Random().nextInt(100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ch.notify();
			}
		}
	}
}
