package snippits;

public class launch2 {

	public static void main(String[] args) {
		int [][][] arr=new int[3][][];
		
		arr[0]=new int[3][];
		arr[1]=new int[4][];
		arr[2]=new int [3][];
		arr[0][0]=new int [2];
		arr[0][1]=new int [2];
		arr[0][2]=new int[2];
		arr[1][0]=new int [2];
		arr[1][1]=new int[2];
		arr[1][2]=new int[2];
		arr[1][3]=new int[2];
		arr[2][0]=new int [2];
		arr[2][1]=new int[2];
		arr[2][2]=new int[2];
		System.out.println(arr[0][1][1]);
}
	}


