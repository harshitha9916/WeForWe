package day.one;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import day.one.BankApp;
import day.one.Login_s;
import day.one.User;


import java.io.*;

class Bats{
    private int id, noavailable;
    private String bloodname;
   
    public Bats() {
    }

    public Bats(int id, String bloodname, int noavailable) {
        this.id = id;
        this.bloodname = bloodname;
        this.noavailable = noavailable;
    }

    @Override
    public String toString() {
        return id +","+ bloodname +","+ noavailable  ;
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

class Res1 implements Runnable {
	private int bloodWanted ;
	
	public Res1(){
		
	}
	public void setorganWanted(int bloodWanted) {
		this.bloodWanted = bloodWanted;
	}
	public int substring(int i) {
		return i;
		// TODO Auto-generated method stub
		
	}
	
	public synchronized void run(int available) {
		System.out.println("The no units of blood your require available : " + available);
		
		if(available >= bloodWanted) {
			String name = Thread.currentThread().getName();
	        System.out.println("The required organ is reserved for"+  name);
	        try {
	        	Thread.sleep(1000);
	        	available = available - bloodWanted;
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

public class Blood_Require {
	public static void main(String[] args) throws IOException{
	Scanner scanner = new Scanner(System.in);
	int choice;
	int bloodWanted;
    FileWriter fw =  null;
    BufferedWriter bw = null;
        FileReader fr = null;
        BufferedReader br = null;
        String str;
        try {
        fw = new FileWriter("blood.txt");
        bw = new BufferedWriter(fw);
        bw.write("1,A+,23" + "\n");
        bw.write("2,A-,45" + "\n");
        bw.write("3,B+,22" + "\n");
        bw.write("4,B-,31" + "\n");
        bw.write("5,O+,8" + "\n");
        bw.write("6,O-,0" + "\n");
        bw.write("5,AB+,58" + "\n");
        bw.write("6,AB-,10" + "\n");
        bw.close();
        fw.close();
            fr = new FileReader("blood.txt");
            br = new BufferedReader(fr);
            List<Batsman> ls = new ArrayList<Batsman>();
            str=br.readLine();
            while(str!=null){
            	String parts[] = str.split(",");
                Batsman b = new Batsman(con_str(parts[0]),parts[1],con_str(parts[2])); 
                ls.add(b);
                str = br.readLine();
          }
            System.out.println("Which BLOOD do you require");
            System.out.println("1.A+");
    		System.out.println("2.A-");
    		System.out.println("3.B+");
    		System.out.println("4.B-");
    		System.out.println("5.O+");
    		System.out.println("6.O-");
    		System.out.println("5.AB+");
    		System.out.println("6.AB-");
    		System.out.println("Enter your choice:");
    		choice = scanner.nextInt();		
    		System.out.println("Enter the number of the number of units you require:");
    		bloodWanted = scanner.nextInt();
    		Res obj = new Res();
    		Res obj1 = new Res();
    		switch(choice) {
			case 1 : 
				obj.setorganWanted(bloodWanted);
				Thread t1 = new Thread(obj);
                obj1.run( ls.get(0).substring(5));  
                t1.start();
				break;
			case 2:
				obj.setorganWanted(bloodWanted);
				Thread t2 = new Thread(obj);
                obj1.run(ls.get(1).substring(5));  
                t2.start();
				break;
			case 3:
				obj.setorganWanted(bloodWanted);
				Thread t3 = new Thread(obj);
                obj1.run(ls.get(2).substring(5));  
                t3.start();
				
				break;
			case 4:
				obj.setorganWanted(bloodWanted);
				Thread t4 = new Thread(obj);
                obj1.run(ls.get(1).substring(5));  
                t4.start();
				
				break;
			case 5:
				obj.setorganWanted(bloodWanted);
				Thread t5 = new Thread(obj);
                obj1.run(ls.get(1).substring(5));  
                t5.start();
				break;
			case 6:
				obj.setorganWanted(bloodWanted);
				Thread t6 = new Thread(obj);
                obj1.run(ls.get(1).substring(5));  
                t6.start();
                break;
			case 7:
				obj.setorganWanted(bloodWanted);
				Thread t7 = new Thread(obj);
                obj1.run(ls.get(1).substring(5));  
                t7.start();
				break;
			case 8:
				obj.setorganWanted(bloodWanted);
				Thread t8 = new Thread(obj);
                obj1.run(ls.get(1).substring(5));  
                t8.start();
                break;
			case 9:
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
