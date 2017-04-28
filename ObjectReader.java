import java.io.BufferedReader;
import java.io.FileReader;
public class ObjectReader {
	
	
public static void main(String[] args) throws Exception
{	
	FileReader file = new FileReader("C:\\Users\\Administrator\\Desktop\\ExData.txt");
	BufferedReader reader = new BufferedReader(file);
	String text = "";
	String line = reader.readLine();
	while(line!=null){
		text = text+line    ;
		line = reader.readLine();
	}
	
System.out.println(text);
System.out.println(java.util.Arrays.toString(tokens));
	
	
}

public static String doc = "Gareth20/01/1980Cat Sitter£12000%Devdetta27/01/1994Smash Player£11000%Elliott4/4/1994Trainer£78000&JeffDog%BobCat%CosmoTortoise%Sir MeowsalotDolphin%ShellyT-Rex";
public static String delims = "[£%]+";
public static String[] tokens = doc.split(delims);





}
