import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week3Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Testleaf is located in Teynampet and above taccobell";
		String data = "Education";
		
		Pattern pattern = Pattern.compile("(?i)(?<!\\\\S)t[a-z]+(?!\\\\S)");
		String[] result = st.split(" ");
		for (int i = 0; i < result.length; i++) {
			Matcher matcher = pattern.matcher(result[i]);
			if (matcher.matches()) {
				System.out.println(result[i]);
			}
		}

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
