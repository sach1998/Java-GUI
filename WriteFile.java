import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

public class WriteFile {
	public int ID;
	public String Date;
	public String Time;
	public Object Type;
	public String Name;
	public String Mob;
	public String Email;
	public String Address;
	
	
	
	public WriteFile(String date,String time,Object type,String name,String mob,String email,String address)
	{
		
		this.Date = date;
		this.Time = time;
		this.Type = type;
		this.Name = name;
		this.Mob = mob;
		this.Email = email;
		this.Address = address;
	}
	
	
	
	public WriteFile() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String temp = Date+" | "+Time+" | "+Type+" | "+Name+" | "+Mob+" | "+Email+" | "+Address;
		return temp;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public Object getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMob() {
		return Mob;
	}

	public void setMob(String mob) {
		Mob = mob;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	regForm rf = new regForm();
	
	static Hashtable<String,WriteFile> val;
	
	public void coml() {
		if(val==null) val = new Hashtable<String,WriteFile>();
		try
		{
			String d = rf.date;
    		String t = rf.time;
    		String ty = (String) rf.type;
    		String n = rf.name2;
    		String m = rf.mob2;
    		String e = rf.email2;
    		String a = rf.addrss;
			WriteFile wf = new WriteFile(d,t,ty,n,m,e,a);
			val.put(Name,wf);
			FileComplaint(val);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void FileComplaint(Hashtable<String,WriteFile> val2){
	    try{
	    FileOutputStream fos=new FileOutputStream("Valcomplaint.txt");
	    ObjectOutputStream oos=new ObjectOutputStream(fos);
	    oos.writeObject(val);
	    oos.flush();
	    oos.close();
	    }catch(IOException ie){}
	    
	   }
}
