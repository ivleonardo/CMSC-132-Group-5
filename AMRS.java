import java.util.*;
import IO_Parsing.*;
import Stages.*;
class AMRS {
	public static void main(String args[]) {
		IO io = new IO("instructions.txt");
		Registers r = new Registers();
		//Parser p = new Parser(io.instructions,r);
		ArrayList<Instruction> ins = new ArrayList<Instruction>();
		int clock_cycle=0;
		boolean notDone=true;
		Fetch f = new Fetch();
		Decode d = new Decode();
		Execute e = new Execute();
		Memory m = new Memory();
		Write w = new Write();
		Hazard h = new Hazard();
		for(int i=0; i<io.instructions.size(); i++){
			ins.add(new Instruction(i+1));
		}

		while(1){//master loop
			if(clock_cycle == 0){// if first clock cycle
				//get first inst
				//put to fetch
				f.setInst(io.instructions.get(clock_cycle));
				h.setHazard(io.instructions.get(clock_cycle));
				//then update clock cycle

				//repeat
			}
			else{
				//Update Stages:
				//Check if writeback is active, if active, deactive, update registers, remove hazards
				if(w.getActive()){
					//set registers
					h.removeHazard(w.getInst());
				}
				if(m.getActive()){
					w.setInst(m.getInst());
				}
				
				// check if memory is active, deactivate, 
			}
			clock_cycle++;
		}

		
		Set keys = r.keySet();
 		for (Iterator i = keys.iterator(); i.hasNext(); ) {
 			String key = (String)i.next();
 			int value = r.get(key);
 			System.out.println(key+" "+value+"\n");
 		}

	}
}