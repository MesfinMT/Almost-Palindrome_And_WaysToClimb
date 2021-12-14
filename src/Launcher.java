
public class Launcher {

	 public static void main(String[] args) {
		 String[] sarray={"abcdcbg","abccia","abcdaaa","1234312"};
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Almost - Palindrome");
			System.out.println("-------------------------------------------------------------------------");
		 for (String s:sarray) {
			 System.out.println(almostPalindrome(s));
		 }
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Ways to climb");
			System.out.println("-------------------------------------------------------------------------");
		 for (int i=1;i<7;i++) {
			 System.out.println(waysToClimb(i));
		 }
	}
	 static int waysToClimb(int x) {
		 int result=0;
		 if(x==1)result=1;
		 else if(x==2)result=2;
		 else result=waysToClimb(x-1)+waysToClimb(x-2);
		 return result;
	 }
	 static String almostPalindrome(String s){
		 int cnt=0;
		 for(int i=0;i<=s.length()/2;i++) {
			 if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				 cnt++;
			 }
		 }
			 if(cnt==1) {
				 return "True";
			 }else {
				 return "False";
			 }
	 }	
}
