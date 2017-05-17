package Stages;

import java.util.*;


public class Execute{
	this.active = false;
	ArrayList<String> fHold;
	int temp;
	public Execute(){
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
		this.active = false;
	}
	public void setInst(ArrayList<String> inst){
		this.fHold = inst;
		this.active = true;
		if(fHold.get(0).matches("LOAD")) {
			
				this.temp = fHold.get(2);
				//r.put(instructions.get(i).get(1),Integer.parseInt(instructions.get(i).get(2)));
			
		}
		else if(fHold.get(0).matches("ADD")) {
			this.temp = fHold.get(1) + fHold.get(2);
			//r.put(reg,r.get(reg)+r.get(instructions.get(i).get(2)));			
		}
		else if(fHold.get(0).matches("SUB")) {
			this.temp = fHold.get(1) - fHold.get(2);
			//	r.put(reg, r.get(reg)-r.get(instructions.get(i).get(2)));
			
		}
		else if(fHold.get(0).matches("CMP")) {			
			this.temp = fHold.get(1) - fHold.get(2);
					
		}			
	}
}