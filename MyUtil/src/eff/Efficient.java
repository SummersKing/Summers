package eff;

import java.util.ArrayList;

public class Efficient {
	private long start;
	protected Double interval;
	protected Integer frquency;
	private static final double NANO = Math.pow(10, 9);
	protected ArrayList<Double> data=new  ArrayList<>();

	/**  
	* <p>Title: </p>  
	* <p>Description:执行一次run的时间 </p>  
	*/ 
	public Efficient(Integer source) {
		if(source==1) {
			
			System.out.println("方法A");
			this.start = start();
			runA();
			this.interval = interval();
			System.out.println(interval);
		}else if(source==2){
			System.out.println("方法B");
			this.start = start();
			runB();
			this.interval = interval();
			System.out.println(interval);
		}else if(source==3){
			System.out.println("方法C");
			this.start = start();
			runC();
			this.interval = interval();
			System.out.println(interval);
	}
	}
	/**  
	
	* <p>Title: </p>  
	
	* <p>Description:执行frequency的时间 </p>  
	
	* @param frequency  
	
	*/ 
	public Efficient(Integer frequency,Integer source) {
		this.frquency=frequency;
		
		if(source==1) {
			System.out.println("方法一");
			this.start = start();
//			System.out.println(start);
			for(int i=0;i<frequency;i++) {
				runA();
				this.interval = interval();
				data.add(this.interval());
			}
		}else {
			System.out.println("方法二");
			this.start = start();
//			System.out.println(start);
			for(int i=0;i<frequency;i++) {
				runB();
				this.interval = interval();
				data.add(this.interval());
			}
	

		}

		}

	public long start() {
		return this.start = System.nanoTime();
	}
	public void runA() {

	}
	public void runB() {

	}
	public void runC() {

	}

	public Double interval() {
		long end = System.nanoTime();
		return this.interval = (end - this.start) / NANO;
	}

}
