package Stages;

import java.util.*;


public class Stall{
	ArrayList<ArrayList<String>> fStall;
	public Stall(){
		this.fStall = new Array<ArrayList<String>>();
		
	}
	public ArrayList<ArrayList<String>> getInst(){
		return fStall;
	}
	public void addInst(ArrayList<String> inst){
		this.fStall.add(inst)
	}
}