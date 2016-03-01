package dataaccess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileSerialization {
	public static final String DATA = "src/resource/data.ser";
	
	public static void serializeData(DataAccess dataAccess){
		try{
			FileOutputStream fileOutput = new FileOutputStream(DATA);
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
			objectOutput.writeObject(dataAccess);
			objectOutput.close();
			fileOutput.close();
		}catch (FileNotFoundException ex){
			System.out.println("File not found");
			ex.printStackTrace();
			return;
		}
		catch(IOException ioEx){
			ioEx.printStackTrace();
			return;
		}
	}

	public static DataAccess deSerializeData(){
		DataAccess dataAccess = new DataAccessFacade();
		try{
			
			FileInputStream fileInput = new FileInputStream(DATA);
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			dataAccess = (DataAccess) objectInput.readObject();
			objectInput.close();
			fileInput.close();
		}catch (ClassNotFoundException ex){
			System.out.println("Class DataAccessFacade not found");
			ex.printStackTrace();
		}
		catch(IOException ioEx){
			ioEx.printStackTrace();
		}
		return dataAccess;
	}
}
