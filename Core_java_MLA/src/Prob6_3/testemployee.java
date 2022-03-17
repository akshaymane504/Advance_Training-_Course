package Prob6_3;

import java.util.Vector;

public class testemployee {
	public static void main(String[]args) {
		Vector<employee> v=addInput();
		display(v);
	}
	public static Vector<employee> addInput(){
		employee e1=new employee(11,"Bheem","dholakpur");
		employee e2=new employee(12,"Chutki","lalgang");
		employee e3=new employee(13,"Raju","patyala");
		employee e4=new employee(14,"Gajju","pehelwanpur");
		Vector<employee>v = new Vector<employee>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		v.add(e4);
		return v;



	}
	public static void display(Vector<employee>v)
	{
		for(employee e:v)
		{
			System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
		}
	}
}