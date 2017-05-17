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
		return fHold;
		this.active = false;
	}
	public void setInst(ArrayList<String> inst){
		this.fHold = inst;
		this.active = true;

	}
}