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
	public IO(String filename) {
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
	}
}