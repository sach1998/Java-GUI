import java.lang.String;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.Hashtable;
import java.io.*;

class compDetails implements Serializable{
	private int ID;
	private String Date;
	private String Time;
	private Object Type;
	private String Name;
	private String Mob;
	private String Email;
	private String Address;
	
	compDetails(int id,String date,String time,Object type,String name,String mob,String email,String address)
	{
		this.ID = id;
		this.Date = date;
		this.Time = time;
		this.Type = type;
		this.Name = name;
		this.Mob = mob;
		this.Email = email;
		this.Address = address;
	}

	public String getDate()
	{
		return Date;
	}
	
	public String getTime()
	{
		return Time;
	}
	
	public Object getType()
	{
		return Type;
	}
	
	public String getName()
	{
		return Name;
	}
	public String getMob()
	{
		return Mob;
	}
	public String getEmail()
	{
		return Email;
	}
	public String getAddress()
	{
		return Address;
	}

	public String showAll() {
		// TODO Auto-generated method stub
		String show = ID+" | "+Date+" | "+Time+" | "+Type+" | "+Name+" | "+Mob+" | "+Email+" | "+Address+"\n";
		System.out.println(show);
		return show;
	}
	
	
}


	
public class action implements Serializable {
	
	String Buffer,Buffer2,date,time,name,mobile,email,address;
	String[] Buffer3 = new String[100];
	Object type;
	int id;
	regForm rf = new regForm();
	WriteFile wff = new WriteFile();
	 static Hashtable<Integer,compDetails> complaint;
	 
	 action(){
		 
	 }
	
	 action(int id,String date,String time,Object type,String name,String mob,String email,String address)
		{
			this.id = id;
			this.date = date;
			this.time = time;
			this.type = type;
			this.name = name;
			this.mobile = mob;
			this.email = email;
			this.address = address;
		}
	 
	 public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public Object getType() {
		return type;
	}

//	public String showAll()
//	 {
//		 String show = id+" | "+date+" | "+time+" | "+type+" | "+name+" | "+mobile+" | "+email+" | "+address;
//		 System.out.println(show);
//		 String s = getDate();
//		return show;
//	 }
	 
	 
	
    public void takeComp() {
    	
    	if(complaint==null) complaint = new Hashtable<Integer,compDetails>();
    	try {
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		int i = id;
    		String d = date;
    		String t = time;
    		Object ty = type;
    		String n =  name;
    		String m =  mobile;
    		String e =  email;
    		String a =  address;
    		
    		compDetails cd = new compDetails(i,d,t,ty,n,m,e,a);
    		complaint.put(id,cd);
    		FileComplaint(complaint);
    		writeFile();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    	
    	public static void FileComplaint(Hashtable<Integer,compDetails> complaint2){
    	    try{
    	    FileOutputStream fos=new FileOutputStream("complaint.txt");
    	    ObjectOutputStream oos=new ObjectOutputStream(fos);
    	    oos.writeObject(complaint);
    	    oos.flush();
    	    oos.close();
    	    }catch(IOException ie){}
    	    
    	   }
    	
    	
    	public void writeFile()
    	{
    		
    		try {
    			
    			Buffer = date+" | "+time+" | "+type+" | "+name+" | "+mobile+" | "+email+" | "+address+"\n";
    			BufferedWriter bw = new BufferedWriter(new FileWriter("AllComplaints.txt",true));
    			bw.newLine();
    			bw.write(Buffer);
    	            try{
    	             bw.close();
    	            } catch(Exception ex){
    	                 
    	            }
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		
    		
    	}
    	
    	
		public static Hashtable<Integer, compDetails> readList(){
    		Hashtable<Integer, compDetails> comp = null;
    		try{
    		    FileInputStream fis=new FileInputStream("complaint.txt");
    		    ObjectInputStream ois=new ObjectInputStream(fis);
    		    comp=(Hashtable<Integer, compDetails>)ois.readObject();
    		    ois.close();
    		   
    		    }catch(Exception ie){}
    		    
			return comp;
    		
    	}
		
		public String viewComplaints()
		{
			complaint = readList();
			if(complaint == null)
			{
				String message = "No Records";
				return message;
			}
			else if(complaint!=null) {
				for(Enumeration<Integer> e=complaint.keys(); e.hasMoreElements();){
				      compDetails entry = complaint.get(e.nextElement());
				      Buffer2 = entry.showAll();
				      return Buffer2;
				      }
				
		}
//			return Buffer2;
			return null;
		
		}
		
		public static void main(String args[])
		{
			complaint = readList();
			action a = new action();
			a.viewComplaints();
		}
}

