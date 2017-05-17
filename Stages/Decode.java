package Stages;

import java.util.*;


public class Decode{	
	boolean active;
	ArrayList<String> fHold;
	public Decode(){
		this.fHold = new ArrayList<String>();
		this.active = false;
	}	
	public boolean getActive(){
		return this.active;
	}
	public ArrayList<String> getInst(){
		this.active = false;
		return fHold;
	}
	public void setInst(ArrayList<String> inst){
		this.fHold = inst;
	}
}