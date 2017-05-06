package IO_Parsing;

import java.util.*;

public class Parser {
	ArrayList<String> library = new ArrayList<String>();
	boolean valid = true;
	
	public Parser(ArrayList<ArrayList> instructions, Registers r) {
		this.library.add("LOAD");
		this.library.add("ADD");
		this.library.add("SUB");
		this.library.add("CMP");
		
		for (int i=0; i<instructions.size(); i+=1) {
			for(int j=0; j<instructions.get(i).size(); j+=1) {
					System.out.println(instructions.get(i).get(j)+" ");
			}
			System.out.println();
			/*ArrayList<String> values = instructions.get(key);
			if(!this.library.contains(key)) {
				valid = false;
				System.out.println("Syntax Error! Instruction does not exist.");
				break;
			}
			if(!r.containsKey(values.get(0))) {
				valid = false;
				System.out.println("Syntax Error! Register does not exist.");
			}
			if(key.matches("LOAD")) {
				if(!values.get(1).matches("^-?[0-9]|[1-9][0-9]")) {
					valid = false;
					System.out.println("Syntax Error!");
				}
				else {
					r.put(values.get(0),Integer.parseInt(values.get(1)));
				}
			}*/
			/*else if(key.matches("ADD")) {
				if(r.containsKey(values.get(0)) && r.containsKey(values.get(1))) {
					r.put(values.get(0),r.get(values.get(0))+r.get(values.get(1)));
				}
				else {
					System.out.println("Syntax Error!");
				}
			}
			else if(key.matches("SUB")) {
				if(r.containsKey(values.get(0)) && r.containsKey(values.get(1))) {
					r.put(values.get(0),r.get(values.get(0))-r.get(values.get(1)));
				}
				else {
					System.out.println("Syntax Error!");
				}
			}
			else if(key.matches("CMP")) {
				
			}*/
		}
	}
}