import java.util.ArrayList;

public class MovingAverage {
	long sum, windowsize, sizeN;
	static boolean used = false;
	static long minVal = 0; 
	static long maxVal = 0;
	
	// min and max static methods
	public static long max() {
		return maxVal;
	}
	public static long min(){
		return minVal;
	}

	//Constructor
	public MovingAverage() {
		this.sum = 0;
		this.windowsize = 0;
	}
	
	ArrayList<Long> list;	
	
	public MovingAverage(long N) {
		this.list = new ArrayList<Long>();
		this.sizeN = N;
	}
	
	// methods 
	public void add(long N) {
		if(!used) {
			minVal = N;
			maxVal  = N;
			used = true;
		}
		else {
			if(N < minVal) minVal = N;
			if(N > maxVal) maxVal = N;
		}
		sum+=N;
		windowsize++;
	}
	public double avg()
	{
		if(windowsize == 0) return 0.0;
		else return ((double) sum) / windowsize;
	}
	
	
	// method 
	public void add(long N) {
		if(!used) {
			minVal = N;
			maxVal = N;
			used = true;
		}
		else 
		{
			if (N < minVal) minVal = N;
			if (N > maxVal) maxVal = N;
		}
		list.add(N);
	}
	public long total(long count) {
		long sum = 0;
		int i = list.size() - 1;
		while(count != 0) {
			sum+= list.get(i);
			count--;
			i--;
		}
		return sum;
	}
	public double avg() {
		long count = list.size();
		if(count==0) return 0.0;
		else if(count > size) return ((double) total(size)) / size;
		else return ((double) total(count) / count);
	}
}
	
	
	
	
	