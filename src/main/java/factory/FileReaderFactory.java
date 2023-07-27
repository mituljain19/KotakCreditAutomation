package factory;

import utilities.dataProviders.ConfigFileReader;

public class FileReaderFactory {
	
	private static FileReaderFactory FileReaderFactory = new FileReaderFactory();
	private static ConfigFileReader configFileReader;
	
	public FileReaderFactory() {
	}
	
	 public static FileReaderFactory getInstance( ) {
	      return FileReaderFactory;
	 }
	 
	 public ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
	 }
}
