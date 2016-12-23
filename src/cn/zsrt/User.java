package cn.zsrt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class User {
   
	public static void findName(int index){
		
		String[] user={"张泽谋","吴荣来","钟鹏","刘浩","谢文威","黄志杰","张志东","胡斌","陈皋"};
	    if(index>=user.length){
	    	System.out.println("您输入的数据超出范围，请重新输入......");
	    	return;
	    }
	    if(index<0){
	    	System.out.println("请输入正整数");
	    	return;
	    }
	     System.out.println(user[index]);
	}
	
	public static void demo(){
		BufferedReader buffer = null;
		Scanner sc = null;
		 int a=0;
		  System.out.println("请输入一个数字...");
		  try
		  {
			  while(true){
		    buffer = new BufferedReader(new InputStreamReader(System.in));
		    sc=new Scanner(System.in);
		   String str1 = buffer.readLine();
		   a=Integer.parseInt(str1);
		   findName(a);
		  
			  }
		  }catch(IOException e){}
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("***********一次性全部输出*****************");
		String[] user={"张泽谋","吴荣来","钟鹏","刘浩","谢文威","黄志杰","张志东","胡斌","陈皋"};
	    for(String u:user){
	    	System.out.println(u);
	    }
	System.out.println();
	    System.out.println("**********通过查询输出********************");
		demo();
		  
		 
	     
		
	}

}
