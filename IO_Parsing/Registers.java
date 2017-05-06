package IO_Parsing;

import java.util.*;


public class Registers extends LinkedHashMap<String,Integer> {
	public Registers() {
		String R = "R";
		for(int i=1; i<=32; i+=1) {
			this.put(R+Integer.toString(i),0);
		}
		this.put("PC", 0);		//PROGRAM COUNTER
		this.put("MAR", 0);		//ADDRESS TO BE FETCHED
		this.put("MBR", 0);		//VALUE OF FETCHED ADDRESS
		this.put("OF", 0);		//TRIGGERS WHEN THERE IS OVERFLOW
		this.put("NF", 0);		//TRIGGERS FOR NEGATIVE INTEGERS
		this.put("ZF", 0);		//FOR COMPARING TO INTEGERS
	}
}