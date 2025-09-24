import java.util.*;
/*class Emp{
	int empno;
	String name;
	float salary;
	Emp(int empno,String name,float salary){
		this.empno=empno;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return empno+"\t"+name+"\t"+salary;
	}
}
public class Demo {
	public static void main(String[] args) {
		Emp e1=new Emp(101,"syed",500.0f);
		Emp e2=new Emp(102,"shanoor",600.0f);
		Emp e3=new Emp(103,"kareem",700.0f);
		ArrayList<Emp> list=new ArrayList<>();
		list.add(e1); //here implicity toString method called (e1.toString())
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		Collections.sort(list); //ERROR===>here empno,name,salary is their then how it will understand which one should be sorted
		System.out.println(list);
	}
}*/

class Emp{
	int empNo;
	String name;
	float salary;
	Emp(int empNo,String name,float salary){
		this.empNo=empNo;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return empNo+"\t"+name+"\t"+salary;
	}
}
class EmpNoComparator implements Comparator<Emp>
{
	public int compare(Emp e1,Emp e2) {
		if(e1.empNo>e2.empNo) {
			return 1;
		}else if(e1.empNo<e2.empNo) {
			return -1;
		}else {
			return 0;
		}
	}
}
class nameComparator implements Comparator<Emp>
{
	public int compare(Emp e1,Emp e2) {
		return e1.name.compareTo(e2.name);
	}
}
public class Demo {
	public static void main(String[] args) {
		Emp e1=new Emp(103,"Asyed",500.0f);
		Emp e2=new Emp(101,"shanoor",600.0f);
		Emp e3=new Emp(102,"kareem",700.0f);
		ArrayList<Emp> list=new ArrayList<>();
		list.add(e1); //here implicity toString method called (e1.toString())
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		Collections.sort(list,new EmpNoComparator());
		System.out.println(list);
		Collections.sort(list,new nameComparator());
		System.out.println(list);
	}
}
