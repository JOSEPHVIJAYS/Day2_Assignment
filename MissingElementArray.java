package day2assignment;
import java.util.Arrays;
public class MissingElementArray {

	public static void main(String[] args) {
	int arr[] = {0,1,2,3,4,7,6,8};
	 Arrays.sort(arr);
	System.out.println("sorted it");

	for ( int i=0; i<arr.length;i++)
	{
		System.out.println(arr[i]);
		if(arr[i]!=i)
		{
			System.out.println("Missing" + i);
			break;
		}

}  
	}
	
}
