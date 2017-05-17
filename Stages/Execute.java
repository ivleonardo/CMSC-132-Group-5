package Stages;

import java.util.*;


public class Execute{
	this.active = false;
	ArrayList<String> fHold;
	public Execute(){
		this.fHold = new ArrayList<String>();
		
	}
	public boolean getActive(){
		return this.active;
	}
	public ArrayList<String> getInst(){
		return fHold;
		this.active = false;
	}
	public void setInst(ArrayList<String> inst){
		this.fHold = inst;
		this.active = true;

	}
}