package IO_Parsing;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.*;

public class IO {
	public ArrayList<ArrayList<String>> instructions = new ArrayList<ArrayList<String>>();
	public ArrayList<String> temp;
	public ArrayList<String> library = new ArrayList<String>();
	public boolean valid = true;
	public IO(String filename, Registers r) {
		try {														
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			String key = new String();
			while((line = reader.readLine()) != null) {
				String[] token;
				token = line.split(" ");
				temp = new ArrayList<String>();
				for(int i=0; i<token.length; i+=1) {
					token[i] = token[i].replaceAll("[^a-zA-Z0-9]","");
					this.temp.add(token[i]);
				}
				this.instructions.add(temp);
			}
		} catch(IOException e) {}
		
		this.library.add("LOAD");
		this.library.add("ADD");
		this.library.add("SUB");
		this.library.add("CMP");
		
		for (int i=0; i<instructions.size(); i+=1) {
			for(int j=0; j<instructions.get(i).size(); j+=1) {
			}	
			String inst = instructions.get(i).get(0);
			String reg = instructions.get(i).get(1);
			if(!this.library.contains(instructions.get(i).get(0))) {// reads the first element in the arraylist of the current instruction
				valid = false;
				System.out.println("Syntax Error! Instruction does not exist.");
				break;
			}
			if(!r.containsKey(instructions.get(i).get(1))) {
				valid = false;
				System.out.println("Syntax Error! Register does not exist.");
				break;
			}
			if(inst.matches("LOAD")) {
				if(!instructions.get(i).get(2).matches("^-?[0-9]|[1-9][0-9]")) {
					valid = false;
					System.out.println("Syntax Error!");
					break;
				}
			}
			else if(inst.matches("ADD")) {
				if(r.containsKey(reg) && r.containsKey(instructions.get(i).get(2))) {
				}
				else {
					System.out.println("Syntax Error!");
					break;
				}
			}
			else if(inst.matches("SUB")) {
				if(r.containsKey(reg) && r.containsKey(instructions.get(i).get(2))) {
				}
				else {
					System.out.println ("Syntax Error!");
					break;
				}
			}
			else if(inst.matches("CMP")) {
				if(r.containsKey(reg) && r.containsKey(instructions.get(i).get(2))) {
				}
				else {
					System.out.println("Syntax Error!");
					break;
				}			
			}
		}
	}
}