import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> // 1. implements comparable interface with generics
{
	int eid,salary;
	String name;

	public Employee(int eid, String name, int salary)  //2. inbulit constructor with fields
	{
		super();
		this.eid = eid;
		this.salary = salary;
		this.name = name;
	}

	@Override    // 3. inbuilt method to override sysout
	public String toString() {
		return "Employee [eid=" + eid +  ", name=" + name + ", salary=" + salary +"]" ;
	}
	
	public int compareTo(Employee e)  // 4. override comparabe interface method
	{
		return this.salary > e.salary ? 1 : -1;
	}
	
	
}
public class Scomparable {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(001,"Sarath",38000));
		emp.add(new Employee(002,"Shamili",40000));
		emp.add(new Employee(003,"Sam",35000));

		Collections.sort(emp);
		
		System.out.println("sorting with salary");
		for (Employee e : emp)
		{
			System.out.println(e);
		}
		
		Collections.sort(emp, (i,j) -> i.eid > j.eid ? 1 : -1 ); // 5. override in lambda expression
		
		System.out.println("after sorting eid");
		for (Employee e : emp)
		{
			System.out.println(e);
		}
		

	}

}
