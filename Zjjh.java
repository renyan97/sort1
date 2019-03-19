package sort;
/**
 * 直接交换排序
 * */
import java.util.Arrays;

public class Zjjh {

	 public void sort(int a[])
	 {
		 System.out.println("排序前"+Arrays.toString(a));
		 for(int i=1;i<a.length-1;i++)
		 {
			 a[0]=a[i];
			 int j=0;
			 int k=i;
			 for(j=i;j<a.length;j++)
			 {
				 if(a[j]<a[k])
					 k=j;
			 }
			 
			 a[i]=a[k];
			 a[k]=a[0];
		 }
		 System.out.println("排序后"+Arrays.toString(a));
	 }
}
