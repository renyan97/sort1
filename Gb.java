package sort;

import java.util.Arrays;

/*
 * πÈ≤¢≈≈–Ú
 * */
public class Gb {
   
	     public void sort(int []a )
	     {
	 		System.out.println("≈≈–Ú«∞"+Arrays.toString(a));
	 		int [] a1=new int[a.length];
	 		gb(a,a1,1,a.length-1);
	 		
			System.out.println("≈≈–Ú∫Û"+Arrays.toString(a1));
	     }
	     public void gb(int [] a,int [] a1,int s,int t)
	     
	     {
	    	 int [] a2=new int[a.length];
	    	 if(s==t)
	    	 {
	    		 a1[s]=a[s];
	    	 }
	    	 else
	    	 {
	    		 int mid=(s+t)/2;
	    		 gb(a,a2,s,mid);
	    		 gb(a,a2,mid+1,t);
	    		 meger(a2,a1,s,mid,t);
	    	 }
	     }
	     public void meger(int [] a,int []a1,int s,int m,int t )
	     {
	    	 int i=s;  
	    	 int j=m+1;
	    	 int k=s;
	    	 while(i<=m&&j<=t)
	    	 {
	    		 if(a[i]>a[j])
	    			 a1[k++]=a[j++];
	    		 else
	    			 a1[k++]=a[i++];
	    	 }
	    	 
	    	 while(i<=m)
	    		 a1[k++]=a[i++];
	    	 while(j<=t)
	    	 { 
	    		 a1[k++]=a[j++]; 
	    	 }
	     }
	     
}
