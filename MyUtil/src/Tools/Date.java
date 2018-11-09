package Tools;

import java.text.DateFormatSymbols;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
public static void test() {
	Calendar c=new GregorianCalendar(2018,24,2);
	GregorianCalendar d=new GregorianCalendar(2018,10,2);
	System.out.println(c.toString());
     System.out.println(c.get(Calendar.MONTH));
     System.out.println(d.get(Calendar.YEAR));
}
/**  

 * <p>Title: printmonth</p>  

 * <p>Description: java基础章节103页案例，输入年月日打印当月的日历</p>  

 * @param y
 * @param m
 * @param d  
 * <p> @date 2018年9月9日  </p> 
 */
public static void printmonth(int y,int m, int d) {
	
	
	GregorianCalendar date=new GregorianCalendar(y,m,d);
	System.out.println("日期：   "+y+"-"+m+"-"+d);
	int today = date.get(Calendar.DAY_OF_MONTH);
	int month=date.get(Calendar.MONTH);
	date.set(Calendar.DAY_OF_MONTH, 1);
	int weekday =date.get(Calendar.DAY_OF_WEEK);
	int firstdayofweek=date.getFirstDayOfWeek();
	
	int indent=0;
	while(weekday!=firstdayofweek) {
		indent++;
		date.add(Calendar.DAY_OF_MONTH, -1);
		weekday=date.get(Calendar.DAY_OF_WEEK);
	}
	String []weekdaynames=new DateFormatSymbols().getShortWeekdays();
	do {
		System.out.printf("%4s", weekdaynames[weekday]);
		date.add(Calendar.DAY_OF_MONTH, 1);//给指定的时间加上制定的日期，日+1；
		weekday=date.get(Calendar.DAY_OF_WEEK);
	}while(weekday!=firstdayofweek);
	System.out.println();
	for(int i=1;i<=indent;i++) {
		System.out.print("    ");}
	date.set(Calendar.DAY_OF_MONTH, 1);
	do {
		int day=date.get(Calendar.DAY_OF_MONTH);

		System.out.printf("%3d",day);
		if(day==today)System.out.print("*");//打印今天
		else {System.out.print(" ");
		
		}
		date.add(Calendar.DAY_OF_MONTH,1);
        weekday=date.get(Calendar.DAY_OF_WEEK);
        if(weekday==firstdayofweek)System.out.println();
	}while(date.get(Calendar.MONTH)==month);
	if(weekday!=firstdayofweek)
		System.out.println();//换行
	}
/**  

 * <p>Title: printmonth</p>  

 * <p>Description:打印当月日历 </p>  
  
 * <p> @date 2018年11月1日  </p> 
 */
public static void printmonth() {
	
	
	GregorianCalendar date=new GregorianCalendar();
	System.out.println("日期：   "+date+"-"+date.MONTH+"-"+date.DAY_OF_MONTH);//现实当前日期？？？
	int today = date.get(Calendar.DAY_OF_MONTH);
	int month=date.get(Calendar.MONTH);
	date.set(Calendar.DAY_OF_MONTH, 1);
	int weekday =date.get(Calendar.DAY_OF_WEEK);
	int firstdayofweek=date.getFirstDayOfWeek();
	
	int indent=0;
	while(weekday!=firstdayofweek) {
		indent++;
		date.add(Calendar.DAY_OF_MONTH, -1);
		weekday=date.get(Calendar.DAY_OF_WEEK);
	}
	String []weekdaynames=new DateFormatSymbols().getShortWeekdays();
	do {
		System.out.printf("%4s", weekdaynames[weekday]);
		date.add(Calendar.DAY_OF_MONTH, 1);//给指定的时间加上制定的日期，日+1；
		weekday=date.get(Calendar.DAY_OF_WEEK);
	}while(weekday!=firstdayofweek);
	System.out.println();
	for(int i=1;i<=indent;i++) {
		System.out.print("    ");}
	date.set(Calendar.DAY_OF_MONTH, 1);
	do {
		int day=date.get(Calendar.DAY_OF_MONTH);

		System.out.printf("%3d",day);
		if(day==today)System.out.print("*");//打印今天
		else {System.out.print(" ");
		
		}
		date.add(Calendar.DAY_OF_MONTH,1);
        weekday=date.get(Calendar.DAY_OF_WEEK);
        if(weekday==firstdayofweek)System.out.println();
	}while(date.get(Calendar.MONTH)==month);
	if(weekday!=firstdayofweek)
		System.out.println();//换行
	}
/**  

 * <p>Title: printyear</p>  

 * <p>Description: 打印当年日历</p>  

 * @param y  
 * <p> @date 2018年11月1日  </p> 
 */
public static void printyear(int y) {
	int m=1;
	for(int i=0;i<12;i++) {
		if(i!=0)  m++;
	printmonth(y,m,1);
	}

	}

}

