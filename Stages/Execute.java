package Stages;

import java.util.*;


public class Execute{
	boolean active;
	ArrayList<String> fHold;
	int temp;
	public Execute(){
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
		this.active = false;
		return temp;
	}
	public void setInst(ArrayList<String> inst){
		this.fHold = inst;
		this.active = true;
		if(fHold.get(0).matches("LOAD")) {
			
				this.temp = Integer.parseInt(fHold.get(2));
				//r.put(instructions.get(i).get(1),Integer.parseInt(instructions.get(i).get(2)));
			
		}
		else if(fHold.get(0).matches("ADD")) {
			this.temp = Integer.parseInt(fHold.get(1) + fHold.get(2));
			//r.put(reg,r.get(reg)+r.get(instructions.get(i).get(2)));			
		}
		else if(fHold.get(0).matches("SUB")) {
			this.temp = Integer.parseInt(fHold.get(1)) - Integer.parseInt(fHold.get(2));
			//	r.put(reg, r.get(reg)-r.get(instructions.get(i).get(2)));
			
		}
		else if(fHold.get(0).matches("CMP")) {			
			this.temp = Integer.parseInt(fHold.get(1)) - Integer.parseInt(fHold.get(2));
					
		}			
	}
}