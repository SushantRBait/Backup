
public class DuplicateEle {

	public static void main(String[] args) {
		int [] arr= {1,1,2,3,4,5,4,3,};
		System.out.print("Duplicates in given Array:");
	for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
               System.out.print(arr[j] + " " );
               break;
            }
         }
      }

			      String str = "beautiful beach";
			      char[] carray = str.toCharArray();
			      System.out.println("The string is:" + str);
			      System.out.print("Duplicate Characters in above string are: ");
			      for (int i = 0; i < str.length(); i++) {
			         for (int j = i + 1; j < str.length(); j++) {
			            if (carray[i] == carray[j]) {
			               System.out.print(carray[j] + " " );
			               break;
			            }
			         }
			      }
		
	}
}
