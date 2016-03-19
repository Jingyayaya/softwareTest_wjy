package cn.tjuscs.st.wjy;

public class Triangle {
	
	public int trian(int a,int b,int c){
		if((a==b)&&(a==c)&&(b==c)){  //等边
			return 0;
		}
		else if((a != b)&&(a!=c)&&(b!=c)){  //不等边
			return 1;
		}
		else{
			return 2;      //等腰
		}
	}
	
	/*
	public boolean equi(int a,int b,int c){
		return ((a==b)&&(a==c)&&(b==c));
	}
	public boolean iso(int a,int b,int c){
		return (((a==b)||(a==c)||(b==c)) && !((a==b)&&(a==c)&&(b==c)));
	}
	public boolean sca(int a,int b,int c){
		return ((a != b)&&(a!=c)&&(b!=c));
	}   */

}
