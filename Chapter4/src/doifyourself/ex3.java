package doifyourself;
 /*
  * Write an oop program with a method to count all words in a string
  * 
  * */
public class ex3 {
	public static int countWords(String str){
        if(str == null || str.isEmpty())
            return 0;

        int count = 0;
        for(int e = 0; e < str.length(); e++){
            if(str.charAt(e) != ' '){
                count++;
                while(str.charAt(e) != ' ' && e < str.length()-1){
                    e++;
                }
            }
        }
        return count;
    }
		public static void main(String[] args) {
			String str = "Nguyen Trong Tam";
			System.out.println(countWords(str));
		}
}
