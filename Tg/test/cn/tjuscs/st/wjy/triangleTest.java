package cn.tjuscs.st.wjy;
import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class triangleTest {

private Triangle tr;
private int a,b,c,expected;

public triangleTest(int a,int b,int c,int expected){
	this.a=a;
	this.b=b;
	this.c=c;
	this.expected=expected;
}
 @Before
public void setUp(){
	tr=new Triangle();
}
 
 @Parameters
 public static Collection<Object[]> getData(){
	 return Arrays.asList(new Object[][]{
			 {1,2,3,1},
			 {2,2,2,0},
			 {2,2,3,2},
			 {2,3,4,1}
	 });
 }
@Test
public void testTrian(){
	assertEquals(this.expected,tr.trian(a,b,c));
}
 
}
