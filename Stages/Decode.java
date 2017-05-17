package Stages;

import java.util.*;


public class Decode{	
	this.active = false;
	ArrayList<String> fHold;
	public Decode(){
		this.fHold = new ArrayList<String>();
		
	}	
	public boolean getActive(){
		return this.active;
	}
	public ArrayList<String> getInst(){
		return fHold;
	}
	public void setInst(ArrayList<String> inst){
		this.fHold = inst;
	}
}