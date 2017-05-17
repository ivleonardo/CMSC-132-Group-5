import java.util.*;
import IO_Parsing.*;
import Stages.*;
class AMRS {
	public static void main(String args[]) {
		IO io = new IO("instructions.txt");
		Registers r = new Registers();
		Parser p = new Parser(io.instructions,r);
		ArrayList<Instruction> ins = new ArrayList<Instruction>();
		int clock_cycle=0;
		boolean notDone=true;

		for(int i=0; i<io.instructions.size(); i++){
			ins.add(new Instruction(i+1));
		}
	}
}