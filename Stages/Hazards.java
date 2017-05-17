package Stages;

import java.util.*;

public class Hazards extends LinkedHashMap<String, Integer> {
	// 1 is write hazard
	// 2 is read hazard
	public Hazards() {
		String R = "R";
		for(int i=1; i<=32; i+=1) {
			this.put(R+Integer.toString(i),0);
		}
	}
	
	public void setHazard(ArrayList<String> instruction) {
		String param1 = instruction.get(1);
		String param2 = instruction.get(2);
		
		if(this.containsKey(param1)) {
			this.put(param1, 1);
		}
		else if(this.containsKey(param2)) {
			this.put(param2, 2);
		}
	}
	
	public boolean checkHazard(ArrayList<String> instruction) {
		boolean hazard = true; 
		String param2 = instruction.get(2);
		
		if(this.containsKey(param2)) {		// condition if there is no hazard or read after read
			if(this.get(param2) == 2) {
				hazard = false;
				return hazard;
			}
		}
		
		return hazard;
	}
	
	public void removeHazard(ArrayList<String> instruction) {
		String param1 = instruction.get(1);
		String param2 = instruction.get(2);
		
		if(this.containsKey(param1)) {
			this.put(param1, 0);
		}
		if(this.containsKey(param2)) {
			this.put(param2, 0);
		}
	}
	
}