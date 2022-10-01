package javalang;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Given 2 sorted arrays A and B, merge them into a array C, such that C is sorted after merge is complete
		A = {4,18,29,67,100}
		B = {1, 6, 23, 88}
		Result - C = {1,4,6,18,23,29,67,100}

		Note - Don't use any sorting algorithm
		*/		
		System.out.println("Program started");
		int[] arrayA = {4,18,29,67,100};
		int[] arrayB = {1, 6, 23, 88};
		
		int[] arrayRes = new int[10];
		int k = 0;
		int j = 0;
		int i = 0;
		boolean complete = false;
		
		while( !complete) {		
			if ( arrayA[i] < arrayB[j] ) {
				arrayRes[k] = arrayA[i];	
				if ( i< arrayA.length)i++;
				k++;
			}else {
				arrayRes[k] = arrayB[j];
				if ( j< arrayB.length)j++;
				k++;
			}			
			if ( i == ( arrayA.length - 1  ) && j == ( arrayB.length - 1  )){
				break;			
			}			
		}
		for(int x : arrayRes){
			System.out.println( x  );
		}
		
	}

}
