package Stages;

import java.util.*;


public class Write{
	this.active = false;
	ArrayList<String> fHold;
	public Write(){
		this.stall=false;
		this.fHold = new ArrayList<String>();
		
	}
	public boolean getActive(){
		return this.active;
	}//	insert setRegiesters from functionality fo Parser.java
	public ArrayList<String> getInst(){		
		this.active = false;
		return fHold;
	}
	public void setInst(ArrayList<String> inst){
		this.fHold = inst;
		this.active = true;

	}
}