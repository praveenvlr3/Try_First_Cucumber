package Helper;

public class FileReaderManager {
	
	//Object creation
	public static FileReaderManager frm = new FileReaderManager();

	public static FileReaderManager getIntance() {
		return frm;
	}

	public static ConfigurationManager cr;
	 
	public static ConfigurationManager getCr() throws Throwable {
		
		if(cr==null) {
			cr= new ConfigurationManager();
		}
		return cr;
	}
}

