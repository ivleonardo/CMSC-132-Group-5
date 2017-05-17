package Stages;
import java.util.*;


public class Memory{
	boolean active;
	ArrayList<String> fHold;
	int temp;
	String tempReg;
	public Memory(){
		this.fHold = new ArrayList<String>();
		this.active = false;
		
	}
	public boolean getActive(){
		return this.active;
	}
	public ArrayList<String> getInst(){
		return fHold;
	}
	public int getTemp(){
		return temp;
	}
	public String getReg(){
		this.active = false;
		return tempReg;
	}
	public void setInst(ArrayList<String> inst, int temp){
		this.fHold = inst;
		this.temp = temp;
		if(fHold.get(0).matches("LOAD")) {			
			this.tempReg = this.fHold.get(1);
				//r.put(instructions.get(i).get(1),Integer.parseInt(instructions.get(i).get(2)));
			
		}
		else if(fHold.get(0).matches("ADD")) {
			this.tempReg = this.fHold.get(1);
			//r.put(reg,r.get(reg)+r.get(instructions.get(i).get(2)));			
		}
		else if(fHold.get(0).matches("SUB")) {
			this.tempReg = this.fHold.get(1);
			//	r.put(reg, r.get(reg)-r.get(instructions.get(i).get(2)));
			
		}
		else if(fHold.get(0).matches("CMP")) {
			if(this.temp == 0){
				tempReg = "ZF";
			}
			else if(this.temp <0){
				tempReg = "NF";
			}					
		}		
		this.active = true;	
	}
}