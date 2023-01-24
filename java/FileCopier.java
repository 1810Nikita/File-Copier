import java.util.*;
import java.io.*;

public class FileCopier {
	
	public static void main(String[] args) throws IOException{
	
		Scanner str = new Scanner(System.in);
		try{
                System.out.println("source");
		String inputPath=str.nextLine();
                System.out.println("Destination");
		String outputPath=str.nextLine();
                System.out.println("Enter File Name");
		String fileName=str.nextLine();
                fileCopy(inputPath, outputPath, fileName);
		}
		finally{
			str.close();
		}
		
		
	}
        static void fileCopy(String inputPath,String outputPath,String fileName)  throws FileNotFoundException, IOException
        {
            
                    File inputstream=new File(inputPath+"\\"+fileName);
                    File outputstream=new File(outputPath+"\\"+fileName);
                    File temp=null;
                    FileReader r=null;
                    FileWriter w=null;
			
			r = new FileReader(inputPath+"\\"+fileName);
					
			if(inputstream.exists()){
				if(outputstream.exists()){
			
					temp = new File(outputPath+"\\"+fileName.substring(0,fileName.indexOf("."))+"-Copy"+fileName.substring(fileName.indexOf("."),fileName.length()));
					
					if(temp.exists()){
						int i=2;
						int s;
						while(true){
							temp = new File(outputPath+"\\"+fileName.substring(0,fileName.indexOf("."))+"-Copy ("+i+")"+fileName.substring(fileName.indexOf("."),fileName.length()));
							if(!temp.exists()){
								break;
							}
							i++;
						}
						w = new FileWriter(outputPath+"\\"+fileName.substring(0,fileName.indexOf("."))+"-Copy ("+i+")"+fileName.substring(fileName.indexOf("."),fileName.length()));
						while((s=r.read())!=-1){
							w.write(s);
						}
						
					}else{
						int s;
						w = new FileWriter(outputPath+"\\"+fileName.substring(0,fileName.indexOf("."))+"-Copy"+fileName.substring(fileName.indexOf("."),fileName.length()));
						while((s=r.read())!=-1){
							w.write(s);
						}
						
					}
				}else{
					int s;
					w = new FileWriter(outputPath+"\\"+fileName);
					while((s=r.read())!=-1){
						w.write(s);
					}
					
				}
			}else{
				System.out.println(" file dosen't exists.");
			}
			
			r.close();
			w.close();
		
        }
}