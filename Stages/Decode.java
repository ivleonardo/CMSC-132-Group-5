package Stages;

import java.util.*;


public class Decode{
	boolean stall;
	ArrayList<String> fHold;
	public Decode(){
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