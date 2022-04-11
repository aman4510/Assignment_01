import java.util.*;

class Employee
{
    int id;
     
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
     
    public int getId() 
    {
        return id;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getAge() 
    {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
    }
     
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
        return salary;
    }
     
    @Override
    public String toString() 
    {
        return "Id :" + id 
				+" , " + "Name : "+ name 
				+" , " + "Age : "+ age 
				+" , " + "Gender : "+ gender
                +" , " + "Department : " + department
                +" , " + "Year Of Joining : " + yearOfJoining
                +" , " + "Salary : " + salary;
    }
}

public class Q33
{
	public static void main(String args[])
	{
		Employee emp1 = new Employee(101,"Aman",21,"M","Hr",2020,140.80);
		Employee emp2 = new Employee(103,"Rahul",22,"F","Sales",2021,132.50);
		Employee emp3 = new Employee(102,"Sumit",20,"M","Purchase",2022,139.90);
		Employee emp4 = new Employee(104,"Vaishnavi",19,"F","Operations",2020,100.05);
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		float m_sum = 0.0f, f_sum = 0.0f;
		int cmale = 0, cfemale = 0;
		
		for(int i=0; i<list.size(); i++)
		{
			Employee et = list.get(i);
			
			if(et.getGender().equals("M"))
			{
				m_sum += et.getAge();
				cmale++;
			}
			else
			{
				f_sum += et.getAge();
				cfemale++;
			}
		}
		
		System.out.println("Average male age is : " + m_sum/cmale);
		System.out.println("Average female age is : " + f_sum/cfemale);
	}
}