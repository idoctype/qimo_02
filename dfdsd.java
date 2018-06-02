package qimo_02;

import java.util.*;

public class dfdsd {

	public static void main(String[] args) {
		System.out.println("请输入一个身份证号码：");
		Scanner sc=new Scanner(System.in);
		String idcard=sc.next();
		if(!(idcard.length()==18)){
			System.out.println("输入不正确，请重新输入：");
			idcard=sc.next();
		}
		String idcard17=idcard.substring(0, 17);
		String idcard18=idcard.substring(17,18);
		System.out.println(idcard18);
		char a[]=null;
			a=idcard17.toCharArray();
		int sum=0;
			int[] b=new int[idcard17.length()];
			b=converCharToInt(a);
			int c[]={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
			for(int i=0;i<b.length;i++){
				for(int k=0;k<c.length;k++){
					if(i==k){
				sum=sum+b[i]*c[k];	
					}
			}	
			}
			System.out.println(sum);
			int k[]={0,1,2,3,4,5,6,7,8,9,10};
			int remainder=0;
			remainder=sum%11;
			String later;
					switch(remainder){
					case 0: later="1";break;
					case 1: later="0";break;
					case 2: later="X";break;
					case 3: later="9";break;
					case 4: later="8";break;
					case 5: later="7";break;
					case 6: later="6";break;
					case 7: later="5";break;
					case 8: later="4";break;
					case 9: later="3";break;
					case 10: later="2";break;
					default:
						later="无";break;
						
					}
					if(idcard18.equalsIgnoreCase(later))
						System.out.println("身份证号码合法");
					else
						System.out.println("身份证号码不合法");
				
			}
		public static int[] converCharToInt(char[] c) {
		int[] a=new int[c.length];
		int k=0;
		for(char temp:c){
			a[k++]=Integer.parseInt(String.valueOf(temp));
		}
		return a;
	}


}
