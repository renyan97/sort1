package sort;
/*
 * Õ∞≈≈–Ú
 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

 

public class Tong {

	public void sort(int [] a)
	{
		 System.out.println(Arrays.toString(a));
		 
		 int d=5;
		 ArrayList<ArrayList<Integer>> l=new ArrayList();
		 
		 for(int i=1;i<=d;i++)
			 l.add(new ArrayList<Integer>());
		 
		 int max=a[1];
		 int min=a[1];
		 for(int i=1;i<a.length;i++)
		 {
			 if(a[i]>max)
				 max=a[i];
			 if(a[i]<min)
				 min=a[i];
		 }
		 int q=(max+min)/(d-1);//Õ∞«¯º‰
		 
		 for(int i=1;i<a.length;i++)
		 {
			  int k=(a[i]-min)/q;
			  l.get(k).add(a[i]);
		 }
		 int m=1;
		 for(int i=0;i<d;i++)
		 {
			 Collections.sort(l.get(i));
			 for(int j=0;j<l.get(i).size();j++)
				 a[m++]=l.get(i).get(j);
		 }
		 
		 System.out.println(Arrays.toString(a));
	}
}
