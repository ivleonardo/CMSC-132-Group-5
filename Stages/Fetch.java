package Stages;

import java.util.*;


public class Fetch{
	boolean stall;
	ArrayList<String> fHold;
	public Fetch(){
		this.stall=false;
		this.fHold = new ArrayList<String>();
		
	}
	public boolean getStall(){
 		return stall;
	}
	public ArrayList<String> getInst(){
		return fHold;
	}
	public void setInst(ArrayList<String> inst){
		this.fHold = inst;
	}
}