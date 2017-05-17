package Stages;

import java.util.*;


public class Memory{
	this.active = false;
	ArrayList<String> fHold;
	int temp;
	String tempReg;
	public Memory(){
		this.fHold = new ArrayList<String>();
		
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
		return tempReg;
		this.active = false;
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
				tempReg = "ZF"
			}
			else if(this.temp <0){
				tempReg = "NF"
			}					
		}		
		this.active = true;	
	}
}