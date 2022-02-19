
import java.util.Arrays;
import java.util.HashMap;

public class Duplicate {


		  public static void main(String[] args)  {
			  String a ="AaAaSsCc";
			 String b= a.toLowerCase();
			  char[] arr=b.toCharArray();
			  HashMap<Character, Integer> mp=new HashMap<>();
			  int counter=0;
			  Arrays.sort(arr);
			  System.out.println(arr);
			  for(int i=0;i<arr.length-1;i++){
				  if(arr[i]==arr[i+1]) {
					  counter+=1;
					  mp.put(arr[i],counter);
				  }else if(arr[i]!=arr[i+1]) {
					  counter=1;
					  mp.put(arr[i+1],counter);
				  
				  }
			  }
			  System.out.println(mp);

		  }
	}

