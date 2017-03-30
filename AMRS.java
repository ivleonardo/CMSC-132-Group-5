import java.util.*;
import IO_Parsing.*;

class AMRS {
	public static void main(String args[]) {
		IO io = new IO("instructions.txt");
		Registers r = new Registers();
		Parser p = new Parser(io.instructions,r);
		Set keys = r.keySet();
		for (Iterator i = keys.iterator(); i.hasNext(); ) {
			String key = (String)i.next();
			int value = r.get(key);
			System.out.println(key+" "+value+"\n");
		}
	}
}