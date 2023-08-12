package day.one;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import day.one.BankApp;
import day.one.Login_s;
import day.one.User;


import java.io.*;

class Batsman {
    private int id, noavailable;
    private String organname;
   
    public Batsman() {
    }

    public Batsman(int id, String organname, int noavailable) {
        this.id = id;
        this.organname = organname;
        this.noavailable = noavailable;
    }

    @Override
    public String toString() {
        return id +","+ organname +","+ noavailable  ;
    }

	public String[] split(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public int substring(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

class Res implements Runnable {
	private int organWanted ;
	
	public Res(){
		
	}
	public void setorganWanted(int organWanted) {
		this.organWanted = organWanted;
	}
	public int substring(int i) {
		return i;
		// TODO Auto-generated method stub
		
	}
	
	public synchronized void run(int available) {
		System.out.println("The no of your required organs available : " + available);
		
		if(available >= organWanted) {
			String name = Thread.currentThread().getName();
	        System.out.println("The required organ is reserved for"+  name);
	        try {
	        	Thread.sleep(1000);
	        	available = available - organWanted;
	        }
	        catch(InterruptedException e){
	        	e.printStackTrace();
	        }
		}
		else {
			System.out.println("Sorry, not available!! We will reach you as soon as possible as we receive a donar.");
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

public class Organ_Require {
	public static void main(String[] args) throws IOException{
	Scanner scanner = new Scanner(System.in);
	int choice;
	int organWanted;
    FileWriter fw =  null;
    BufferedWriter bw = null;
        FileReader fr = null;
        BufferedReader br = null;
        String str;
        try {
        fw = new FileWriter("organs.txt");
        bw = new BufferedWriter(fw);
        bw.write("1,heart,23" + "\n");
        bw.write("2,Kidney,45" + "\n");
        bw.write("3,lungs,22" + "\n");
        bw.write("4,Eyes,31" + "\n");
        bw.write("5,Intestines,8" + "\n");
        bw.write("6,Pancreas,0" + "\n");
        bw.close();
        fw.close();
            fr = new FileReader("organs.txt");
            br = new BufferedReader(fr);
            List<Batsman> ls = new ArrayList<Batsman>();
            str=br.readLine();
            while(str!=null){
            	String parts[] = str.split(",");
                Batsman b = new Batsman(con_str(parts[0]),parts[1],con_str(parts[2])); 
                ls.add(b);
                str = br.readLine();
          }
            System.out.println("Which organ do you require");
            System.out.println("1.Heart");
    		System.out.println("2.Kidney");
    		System.out.println("3.Lungs");
    		System.out.println("4.Eyes");
    		System.out.println("5.Intestines");
    		System.out.println("6.Pancreas");
    		System.out.println("Enter your choice:");
    		choice = scanner.nextInt();		
    		System.out.println("Enter the number of the selected organ you require:");
    		organWanted = scanner.nextInt();
    		Res obj = new Res();
    		Res obj1 = new Res();
    		switch(choice) {
			case 1 : 
				obj.setorganWanted(organWanted);
				Thread t1 = new Thread(obj);
                obj1.run( ls.get(0).substring(8));  
                t1.start();
				break;
			case 2:
				obj.setorganWanted(organWanted);
				Thread t2 = new Thread(obj);
                obj1.run(ls.get(1).substring(9));  
                t2.start();
				break;
			case 3:
				obj.setorganWanted(organWanted);
				Thread t3 = new Thread(obj);
                obj1.run(ls.get(2).substring(9));  
                t3.start();
				
				break;
			case 4:
				obj.setorganWanted(organWanted);
				Thread t4 = new Thread(obj);
                obj1.run(ls.get(1).substring(7));  
                t4.start();
				
				break;
			case 5:
				obj.setorganWanted(organWanted);
				Thread t5 = new Thread(obj);
                obj1.run(ls.get(1).substring(9));  
                t5.start();
				break;
			case 6:
				obj.setorganWanted(organWanted);
				Thread t6 = new Thread(obj);
                obj1.run(ls.get(1).substring(11));  
                t6.start();
			case 7:
				return;
			
			}
	        }
            catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
       
        finally {
            try {
                br.close();
                fr.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
 public static int con_str(String s) {
     return Integer.parseInt(s);
}

}



