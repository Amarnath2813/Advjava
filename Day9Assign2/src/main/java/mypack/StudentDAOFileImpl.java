package mypack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentDAOFileImpl implements StudentDAO {

	@Override
	public void addStudent(Student student) {
		try {
			FileOutputStream fi = new FileOutputStream("E:\\CDAC\\amar.txt");
			ObjectOutputStream oi = new ObjectOutputStream(fi);
			oi.writeObject(student);
			System.out.println("Data written in file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
