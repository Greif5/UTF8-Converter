import java.io.*;

public class Converter {

	public static void main(String[] args) throws IOException { 
		try{
			File fFileIn = new FileChooser().getFile();
		
			String strNewName = fFileIn.getParent() + "/UTF8_" +fFileIn.getName();
			
			String charsetOrg = "ISO-8859-1";
			String charsetNew = "UTF-8";
			String strLine = "";
			
			BufferedReader brIn		= new BufferedReader( new InputStreamReader (new FileInputStream(fFileIn), charsetOrg));
			PrintWriter pwPrinter	= new PrintWriter(strNewName,charsetNew);
			
			while( (strLine = brIn.readLine()) != null) { 
				pwPrinter.println(strLine);
			}
			
			brIn.close();
			pwPrinter.close();
		}
		catch(Exception e){	e.printStackTrace();	}
	}

}
