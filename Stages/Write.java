package Stages;
import IO_Parsing.*;
import java.util.*;


public class Write{
	boolean active = false;
	ArrayList<String> fHold;
	int temp;
	String reg;
	public Write(){
		this.active=false;
		this.fHold = new ArrayList<String>();
		
	}
	public boolean getActive(){
		return this.active;
	}//	insert setRegiesters from functionality fo Parser.java
	public ArrayList<String> getInst(){		
		this.active = false;
		return fHold;
	}
	public void setInst(ArrayList<String> inst, int temp, String reg, Registers r){
		this.fHold = inst;
		this.temp = temp;
		this.reg = reg;
		r.put(reg,temp);
		this.active = true;

	}
}