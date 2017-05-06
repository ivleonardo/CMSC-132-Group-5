package IO_Parsing;

import java.util.*;

public class Parser {
	ArrayList<String> library = new ArrayList<String>();
	boolean valid = true;
	
	public Parser(ArrayList<ArrayList<String>> instructions, Registers r) {
		this.library.add("LOAD");
		this.library.add("ADD");
		this.library.add("SUB");
		this.library.add("CMP");
		
		for (int i=0; i<instructions.size(); i+=1) {
			for(int j=0; j<instructions.get(i).size(); j+=1) {// traverses the whole instruction
					System.out.println(instructions.get(i).get(j)+" ");
			}	
			String inst = instructions.get(i).get(0);
			String reg = instructions.get(i).get(1);
			System.out.println();
			System.out.println(instructions.get(i).get(0));
			System.out.println(instructions.get(i).get(1));
			System.out.println(instructions.get(i).get(2));
			if(!this.library.contains(instructions.get(i).get(0))) {// reads the first element in the arraylist of the current instruction
				valid = false;
				System.out.println("Syntax Error! Instruction does not exist.");
				break;
			}
			if(!r.containsKey(instructions.get(i).get(1))) {
				valid = false;
				System.out.println("Syntax Error! Register does not exist.");
			}
			if(inst.matches("LOAD")) {
				if(!instructions.get(i).get(2).matches("^-?[0-9]|[1-9][0-9]")) {
					valid = false;
					System.out.println("Syntax Error!");
				}
				else {
					r.put(instructions.get(i).get(1),Integer.parseInt(instructions.get(i).get(2)));
				}
			}
			else if(inst.matches("ADD")) {
				if(r.containsKey(reg) && r.containsKey(instructions.get(i).get(2))) {
					r.put(reg,r.get(reg)+r.get(instructions.get(i).get(2)));
				}
				else {
					System.out.println("Syntax Error!");
				}
			}
			else if(inst.matches("SUB")) {
				if(r.containsKey(reg) && r.containsKey(instructions.get(i).get(2))) {
					r.put(reg, r.get(reg)-r.get(instructions.get(i).get(2)));
				}
				else {
					System.out.println ("Syntax Error!");
				}
			}
			else if(inst.matches("CMP")) {
				if(r.containsKey(reg) && r.containsKey(instructions.get(i).get(2))) {
					int compare =  r.get(reg)-r.get(instructions.get(i).get(2));
					if(compare == 0){
						r.put("ZF", 1);
					}
					else if(compare <0){
						r.put("NF", 1);
					}

					
				}
				else {
					System.out.println("Syntax Error!");
				}			
			}
			
		}
	}
}