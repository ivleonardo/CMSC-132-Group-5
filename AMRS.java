import java.util.*;
import IO_Parsing.*;
import Stages.*;
class AMRS {
	public static void main(String args[]) {
		Registers r = new Registers();
		IO io = new IO("instructions.txt", r);
		ArrayList<Instruction> ins = new ArrayList<Instruction>();
		int clock_cycle=0;
		boolean notDone=true;
		Fetch f = new Fetch();
		Decode d = new Decode();
		Execute e = new Execute();
		Memory m = new Memory();
		Write w = new Write();
		Hazards h = new Hazards();
		Stall s = new Stall();
		for(int i=0; i<io.instructions.size(); i++){
			ins.add(new Instruction(i+1));
		}

		while(true){//master loop
			if(clock_cycle == 0){// if first clock cycle
				//get first inst
				//put to fetch
				f.setInst(io.instructions.remove(clock_cycle));
				h.setHazard(io.instructions.get(clock_cycle));
				//then update clock cycle

				//repeat
			}
			else{
				if(io.instructions.size()==0 && !f.getActive() && !d.getActive() && !e.getActive() ){
					break;
				}
				//Update Stages:
				//Check if writeback is active, if active, deactive, update registers, remove hazards
				if(w.getActive()){
					//set registers
					h.removeHazard(w.getInst());
				}
				if(m.getActive()){
					w.setInst(m.getInst(), m.getTemp(), m.getReg(), r);
				}
				if(e.getActive()){
					m.setInst(e.getInst(), e.getTemp());
				}
				// check if memory is active, deactivate, 
				if(d.getActive()) {
					e.setInst(d.getInst());
				}
				if(h.checkHazard(f.getInst())){
					s.addInst(f.getInst());
				}
				else{
					h.setHazard(f.getInst());
					d.setInst(f.getInst());
				}
				if(!io.instructions.isEmpty()){
					f.setInst(io.instructions.remove(clock_cycle));
				}
				
			}
			clock_cycle++;
		}

		
		/*Set keys = r.keySet();
 		for (Iterator i = keys.iterator(); i.hasNext(); ) {
 			String key = (String)i.next();
 			int value = r.get(key);
 			System.out.println(key+" "+value+"\n");
 		}*/

	}
}