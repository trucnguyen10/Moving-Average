import java.util.ArrayList;

public class MovingAverage {
	long sum, size, windowsize;
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
	public MovingAverage() { // culmulative
		this.sum = 0;
		this.size = 0;
	}
	
	ArrayList<Long> list= new ArrayList<Long>() ;	
	
	public MovingAverage(long N) { // simple
		this.windowsize = N;
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
		size++;
		list.add(N);
		if(list.size() >= size)
		list.remove(0);
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
	
	public double avg()
	{
		if(size == 0) return 0.0;
		if(windowsize == 0) return ((double) sum) / size ;
	        if(windowsize >= size) 
		{
	    	 if(size == 0) return 0.0;
			 return ((double) sum) / size;
		}
	        else
		{
	    long count = list.size();
		if(list.size()==0) return 0.0;
		else if(count > windowsize) return ((double) total(windowsize)) / windowsize;
		else return ((double) total(count) / count);
		}
	}
}
	
	
	
	
	
