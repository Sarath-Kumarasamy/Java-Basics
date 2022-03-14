package com.sarath.java8;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		
			int swap=0;
			boolean visited[]=new boolean[arr.length];
			System.out.println(visited);

			for(int i=0;i<arr.length;i++)
			{
				int j=i,cycle=0;

				while(!visited[j]){
					visited[j]=false;
					j=arr[j]-1;
					cycle++;
				}
				 
				if(cycle!=0)
					swap+=cycle-1;
			}
			System.out.println(swap);

	}

}
