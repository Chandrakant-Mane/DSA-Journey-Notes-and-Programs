package arrays;
// import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static ArrayList<Integer>allIndices(int a[],int n,int target,int idx)
	{  if(idx>=n)
		{
			return new ArrayList<Integer>();
		}
		ArrayList<Integer>ans=new ArrayList<>();
		if(a[idx]==target)
		{
			ans.add(idx);
		}
		ArrayList<Integer>smallAns=allIndices(a,n,target,idx+1);
		ans.addAll(smallAns);
		return ans;
	}
	public static void main(String args[])
	{
		int a[]= {1,2,4,4,5,4};
		int target=4;
		int n=a.length;
		ArrayList<Integer>ans=allIndices(a,n,target,0);
		for(Integer i:ans)
		{
			System.out.print(i+"  ");
		}
		
	}

}