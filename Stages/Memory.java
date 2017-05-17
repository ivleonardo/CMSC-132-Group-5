package Stages;

import java.util.*;


public class Memory{
	boolean stall;
	ArrayList<String> fHold;
	public Memory(){
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