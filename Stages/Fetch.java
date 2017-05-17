package Stages;

import java.util.*;


public class Fetch{
	boolean active;
	ArrayList<String> fHold;
	public Fetch(){
		this.active = false;
		this.fHold = new ArrayList<String>();
		
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
		this.active = true;

	}
}