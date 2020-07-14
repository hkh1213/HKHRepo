package Algorithm;

import java.util.Arrays;

public class Algorithm12 {
	static void MergeSort(int data[],int p,int r) {
		if(p<r) {
			int q=(p+r)/2;
			MergeSort(data,p,q);
			MergeSort(data,q+1,r);
			Merge(data,p,q,r);
		}
	}
	static void Merge(int data[], int p, int q, int r) {
		q = (p + r) / 2;

		int i = p;
		int j = q + 1;
		int k = p;
		int tmp[] = new int[data.length];
		while (i <= q && j <= r) {
			if (data[i] <= data[j])
				tmp[k++] = data[i++];
			else
				tmp[k++] = data[j++];
		}
		while (i <= q)
			tmp[k++] = data[i++];
		while (j <= r)
			tmp[k++] = data[j++];
		for (int a = p; a <= r; a++)
			data[a] = tmp[a];
		
		System.out.println(Arrays.toString(data));
	}
	public static void main(String[] args) {
		int array[]= {10,9,5,3,1,6};
		MergeSort(array,0,5);
	}

}
