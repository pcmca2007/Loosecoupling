package com.chennai.kilpauk.pamca2007;

public class Students {
	
	private int sid=0;
	private String sname;
	private String course;
	
	public Students(int sid, String sname, String course) {
	
		this.sid = sid;
		this.sname = sname;
		this.course = course;
		
	}
	
	
	public Students(int sid) {
		
		this.sid = sid;
	}



	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public String getCourse() {
		return course;
	}


	public String toString(){
		
		
		return "studentId="+this.getSid()+"Student Name="+this.getSname()+"Course="+this.getCourse();
	}
	
	public boolean equals(Object obj){
		
		if(obj !=null){
			
			if(this.getClass()==obj.getClass()){
				
				Students std=(Students)obj;
				
				if(this.sid==std.sid && this.sname.equals(std.sname) && this.course.equals(std.course)){
					
					return true;
				}
			}
		}
		
		return false;
	}

	public int hashCode(){
		
		return sid * sname.hashCode() * course.hashCode();
	}
	
	
	
	
}
