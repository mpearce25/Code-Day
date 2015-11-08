import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Data {
	Scanner kb = new Scanner(System.in);
	int val = kb.nextInt();
	Scanner file;
	public String[] saveGame;
	public void save() throws FileNotFoundException{
		Scanner file = new Scanner(new File("savedata.txt"));
		String val = file.nextLine();
	}
	public void read() throws FileNotFoundException{
		Scanner file2;
		file2 = new Scanner("savedata.txt");
		while(file2.hasNextLine()){
			int i = 0;
			saveGame[i] = file2.nextLine();
			i++;
		}
			
	}
}
