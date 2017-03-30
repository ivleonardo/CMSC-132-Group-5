import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.*;

public class IO {
	LinkedHashMap<String,ArrayList<String>> instructions = new LinkedHashMap<String,ArrayList<String>>();
	ArrayList<String> temp = new ArrayList<String>();
	public IO(String filename) {
		try {														
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			String key = new String();
			while((line = reader.readLine()) != null) {
				String[] token;
				token = line.split(" ");
				for(int i=0; i<token.length; i+=1) {
					token[i] = token[i].replaceAll("[^a-zA-Z0-9]","");
					if(i==0) {
						key = token[0];
					}
					else {
						this.temp.add(token[i]);
					}
				}
				this.instructions.put(key, temp);
				this.temp.clear();
			}
		} catch(IOException e) {}
	}
}