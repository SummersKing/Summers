package Tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Efficient {
	private Double interval;
	private static final double NANO = Math.pow(10, 9);
	private ArrayList<Double> timelist = new ArrayList<>();

	public static void main(String[] args) {
		
bijiao(1000000);
		
	}
public static void bijiao(Integer fr) {
	System.gc();
	try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Efficient eff = test(fr);
	double f = avg(eff.timelist);
	System.out.println("快速版"+f);
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Efficient ell=test1(fr);
	double s = avg(ell.timelist);
	System.out.println("慢速版"+s);
	System.out.println(s-f);
}
	public Double interval(long start) {
		long end = System.nanoTime();
		interval = (end - start) / NANO;
		return interval;
	}

	/**
	 * 
	 * <p>
	 * Title: iterator
	 * </p>
	 * 
	 * <p>
	 * Description:这是一个double arraylist迭代器
	 * </p>
	 * 
	 * @param      <T>
	 * 
	 * @param list
	 *             <p>
	 * 			@date 2018年10月27日
	 *             </p>
	 */
	public static <T> void iterator(ArrayList<T> list) {
		Iterator<T> iterator = list.iterator();
		while (iterator.hasNext()) {
			T next = iterator.next();
			System.out.println(next);
		}
	}

	public static Efficient test(Integer frequency) {

		ArrayList<Double> list = new ArrayList<>();
		Random random = null;
		Double e = null;
		for (int i = 10000; i > 0; i--) {
			random = new Random();
			e = random.nextDouble();
			list.add(e);
		}
		Efficient eff = new Efficient();
		long start = System.nanoTime();
		for (int i = 0; i < frequency; i++) {
			avg(list);
			Double interval = eff.interval(start);
			eff.timelist.add(interval);
		}
		return eff;

	}
	public static Efficient test1(Integer frequency) {

		ArrayList<Double> list = new ArrayList<>();
		Random random = null;
		Double e = null;
		for (int i = 10000; i > 0; i--) {
			random = new Random();
			e = random.nextDouble();
			list.add(e);
		}
		Efficient eff = new Efficient();
		long start = System.nanoTime();
		for (int i = 0; i < frequency; i++) {
			avg1(list);
			Double interval = eff.interval(start);
			eff.timelist.add(interval);
		}
		return eff;

	}

	/**
	 * 
	 * <p>
	 * Title: avgTime
	 * </p>
	 * 
	 * <p>
	 * Description: 计算doble list 里面的平均数
	 * </p>
	 * 
	 * @param list
	 * @return
	 *         <p>
	 * 		@date 2018年10月27日
	 *         </p>
	 */
	public static double avg(ArrayList<Double> list) {

		double total = 0;
		for (int i = 0, length = list.size(); i < length; i++) {
			total += list.get(i);
		}
		double avg = total / list.size();
//		System.out.println("平均用时"+avg);
		return avg;

	}
	public static double avg1(ArrayList<Double> list) {

		double total = 0;
		for (int i = 0; i <list.size(); i++) {
			total += list.get(i);
		}
		double avg = total / list.size();
//		System.out.println("平均用时"+avg);
		return avg;

	}

}
