package IO_Parsing;

import java.util.*;


public class Registers extends LinkedHashMap<String,Integer> {
	public Registers() {
		String R = "R";
		for(int i=1; i<=32; i+=1) {
			this.put(R+Integer.toString(i),0);
		}
	}
}