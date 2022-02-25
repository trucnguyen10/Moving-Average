
public class main {

	public static void main(String[] args) {
		  MovingAverage cma = new MovingAverage();
		  MovingAverage sma10 = new MovingAverage(10);
		  MovingAverage sma1 = new MovingAverage(1);

		  for (int i = 1; i <= 100; i++) {
		    cma.add(i);
		    sma10.add(i);
		    sma1.add(i);
		  }

		  System.out.println(cma.avg());
		  System.out.println(sma10.avg());
		  System.out.println(sma1.avg());
		  System.out.println(MovingAverage.min());
		  System.out.println(MovingAverage.max());

		  sma1.add(500);
		  System.out.println(sma1.avg());
		  System.out.println(MovingAverage.max());
		}

}
