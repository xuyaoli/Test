//package Chapter18;
import net.mindview.util.*;
import java.util.*;
import java.io.*;

public class EX20 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    List<File> ll=Directory.walk("aaa.class",".class").files;
    System.out.println(ll);
    for(File f:ll){
    	byte[] data=BinaryFile.read(f);
    	if(data[0]=='C'&&data[1]=='A'&&data[2]=='F'&&data[3]=='E'&&data[4]=='B'&&data[5]=='A'&&data[6]=='B'&&data[7]=='E'){
    		System.out.println(f.getAbsolutePath());
    	}
    	else
    		System.out.println(f.getAbsolutePath());
    } 
	}

}
