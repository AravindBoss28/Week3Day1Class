import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week3Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Testleaf is located in Teynampet and above taccobell";
		String data = "Education";
		
		/**
		 * (?i) ignore case
		 * Negative lookbehind: (?<!Y)X, matches X, but only if there’s no Y before it.
		 * if string starts with "T or t" but it should not contain character before it
		 * incase of the above string "located" also will match. if we don't use this condition.
		 * 
		 * t[a-z]+: it will check letter start with "t or T"any thing comes after that
		 * "+" is used for more than one character matches condition [a-z]
		 *  
		 *  X(?=Y)	Positive lookahead	X if followed by Y 
                 *  X(?!Y)	Negative lookahead	X if not followed by Y
                 *  (?<=Y)X	Positive lookbehind	X if after Y
                 *  (?<!Y)X	Negative lookbehind	X if not after Y  
                 *  (?!\\S) Negative lookbehind
                 *  matches string without white space
                 *  
		 * */

		Pattern pattern = Pattern.compile("(?i)(?<!\\\\S)t[a-z]+(?!\\\\S)");
		String[] result = st.split(" ");
		for (int i = 0; i < result.length; i++) {
			Matcher matcher = pattern.matcher(result[i]);
			if (matcher.matches()) {
				System.out.println(result[i]);
			}
		}
                
		/**
		* (?i) ignore case
		* [aeiou] character matches a,e,i,o,u
		*/
		Pattern pat1 = Pattern.compile("(?i)[aeiou]");
		char[] ed = data.toCharArray();
		int count = 0;
		for (int i = 0; i < ed.length; i++) {
			String s = ed[i] + "";
			Matcher matcher = pat1.matcher(s);
			if (matcher.matches()) {
				count++;
			}
		}
        
		System.out.println("total char matched is  "+count);
	}

}
