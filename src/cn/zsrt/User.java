package cn.zsrt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class User {
   
	public static void findName(int index){
		
		String[] user={"����ı","������","����","����","л����","��־��","��־��","����","�¸�"};
	    if(index>=user.length){
	    	System.out.println("����������ݳ�����Χ������������......");
	    	return;
	    }
	    if(index<0){
	    	System.out.println("������������");
	    	return;
	    }
	     System.out.println(user[index]);
	}
	
	public static void demo(){
		BufferedReader buffer = null;
		Scanner sc = null;
		 int a=0;
		  System.out.println("������һ������...");
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
		
		System.out.println("***********һ����ȫ�����*****************");
		String[] user={"����ı","������","����","����","л����","��־��","��־��","����","�¸�"};
	    for(String u:user){
	    	System.out.println(u);
	    }
	System.out.println();
	    System.out.println("**********ͨ����ѯ���********************");
		demo();
		  
		 
	     
		
	}

}
