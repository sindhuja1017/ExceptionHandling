package strings;

public class DuplicateTwoStrings {

	public static void main(String[] args) {
		//41 w3resource
		 String str1 = "the quick brown fox";
		  String str2 = "queen";
		
		  char[] c=str1.toCharArray();
		  for(int i=0;i<c.length;i++)
		  {
			  char ch=c[i];
			 
			  for(int j=0;j<str2.length();j++)
			  {
				char ch2=str2.charAt(j);
				if(ch==ch2)
			  	{
				  str1=str1.replace(ch, '_');
			  	}
				
			  }
		  }
		  System.out.println(str1);
	}

}
