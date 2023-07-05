package esercizio2;

public class MultiTread extends Thread {

	private int sum;
	private int[] range;
	private int end;
	private int start;

	public MultiTread(int[] _range, int end, int start) {
		this.sum = 0;
		this.range = _range;
		this.end = end;
		this.start = start;
	}

	public int getSum() {
		return sum;
	}

	@Override
	public void run() {
		for (int i = start; i < end; i++) {
			sum += range[i];
		}
	}

}
