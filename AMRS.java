import java.util.*;
import IO_Parsing.*;

class AMRS {
	public static void main(String args[]) {
		IO io = new IO("instructions.txt");
		Registers r = new Registers();
		Parser p = new Parser(io.instructions,r);
		Set keys = r.keySet();
		ArrayList<Instruction> ins = new ArrayList<Instruction>();

		int clock_cycle=0;
		boolean notDone=true;

		for (Iterator i = keys.iterator(); i.hasNext(); ) {
			String key = (String)i.next();
			int value = r.get(key);
			System.out.println(key+" "+value+"\n");
		}

		for(int i=0; i<io.instructions.size(); i++){
			
		}

		while(notDone){
			clock_cycle++;



		}
	}
}