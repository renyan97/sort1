package sort;

import java.util.Arrays;

public class Zheban {
               
	public void sort(int [] a)
	{
		System.out.println("≈≈–Ú«∞"+Arrays.toString(a));
		int len=a.length;
		for(int i=2;i<len;i++)
		{
			a[0]=a[i];
			int j=0;
			int l=1;
			int r=i-1;
			
			while(l<=r)
			{
				int mid=(l+r)/2;
				if(a[0]>a[mid])
					l=mid+1;
				else
					r=mid-1;
			}
			for(j=i-1;j>=l;j--)
				a[j+1]=a[j];
			a[j+1]=a[0];
			
			
		}
			
			
	    System.out.println("Ω”≈≈–Ú∫Û"+Arrays.toString(a));
	}
}
