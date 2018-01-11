package charactor;
import java.text.ParseException;
import java.lang.NumberFormatException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

public class mySwitch {
//	public static void main(String[] args) {
//		int yearStart = 1970,yearEnd = 2000;	
//		Date[] ds = new Date[9];
//		for(int i=0;i<9;i++) {
//			ds[i] = getRandomDate(yearStart, yearEnd);
//		}
//		for(int i=0;i<9;i++) {
//			System.out.print(toString(ds[i])+"\t");
//			if(i%3==2)
//				System.out.println();
//		}
//		System.out.println();
//		for(int i=0;i<ds.length-1;i++)
//			for(int j=1+i;j<ds.length;j++) {
//				String a = toString(ds[i],"HHmmss");
//				String b = toString(ds[j],"HHmmss");
//				int timei = Integer.parseInt(a);
//				int timej = Integer.parseInt(b);
//				if(timej<timei) {
//					Date p = ds[j];
//					ds[j] = ds[i];
//					ds[i] = p;
//				}
//			}
//		for(int i=0;i<9;i++) {
//			System.out.print(toString(ds[i])+"\t");
//			if(i%3==2)
//				System.out.println();
//		}
//		System.out.println();
//	}
	
	public static String toString(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String a = sdf.format(d);
		return a;
	}
	public static String toString(Date d,String f) {
		SimpleDateFormat sdf = new SimpleDateFormat(f);
		return sdf.format(d);
	}
	
	private static Date getRandomDate (int yearStart , int yearEnd){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		try {
			Date dStart = sdf.parse(String.valueOf(yearStart)); // 1970
			Date dEnd = sdf.parse(String.valueOf(yearEnd + 1)); // 2001 不是 2000，要在2001的基础上减少以毫秒，才表示2000最后一刻
			long timeStart = dStart.getTime();
			long timeEnd = dEnd.getTime();
			long timeRandom = (long) (timeStart + Math.random() * (timeEnd - timeStart));
			Date a = new Date(timeRandom);
			return a;
		} catch (ParseException e) {
        // TODO Auto-generated catch block
			e.printStackTrace();
			}
		return null;
	}
		
	
}
