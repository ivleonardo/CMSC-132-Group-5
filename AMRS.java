import java.util.*;

class AMRS {
	public static void main(String args[]) {
		IO io = new IO("instructions.txt");
		Set keys = io.instructions.keySet();
		for (Iterator i = keys.iterator(); i.hasNext(); ) {
			String key = (String)i.next();
			ArrayList<String> value = io.instructions.get(key);
			System.out.println(key+" "+value+"\n");
		}
	}
}