package com.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringMutableExamples {
	int a = 5;
	public void getData() {
		int a =10;
		System.out.println(a + this.a);
	}

	public static void main(String[] args) {
		StringMutableExamples st = new StringMutableExamples();
		st.getData();
		
		//StringBuffer sb = new StringBuffer("hello");
//		StringBuilder sb = new StringBuilder("hello");
//		sb.append("world");
//		System.out.println(sb);
//		System.out.println(sb.insert(2, "she"));
//		System.out.println(sb.replace(5, 7, "aa"));
//		System.out.println(sb.deleteCharAt(12));
//		System.out.println(sb.reverse());
		
		
		// Date class
		/*Date date = new Date();		
		System.out.println(date.toString());
		SimpleDateFormat sdf= new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(date));  */
		
		// Calendar Class
		/*Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));*/

		// for checking access modifiers
		HashMapToSetExample hsm= new HashMapToSetExample();
		hsm.getData();
		//hsm.i;

	}

}
