package eff;

import java.util.ArrayList;

import Tools.TimekKts;

/**  

* <p>Title: test</p>  

* <p>Description: </p>  

* @author Summer·King  

* <p> @date 2018年10月29日</p>   

*/ 
public class test extends Efficient  {
	public ArrayList<Double>data=super.data;
	public test(Integer source) {
		super(source);
	}

	public test(Integer frequency ,Integer source)  {
		super(frequency,source);
	}

	@Override
	public void runA() {
			TimekKts.getTimeA();
	}
	@Override
		public void runB() {
			TimekKts.getTimeB();
	}
	@Override
		public void runC() {
			TimekKts.getTimeC();
		}
	

	
}