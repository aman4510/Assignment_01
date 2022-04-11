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

public class Q39
{
	public static void main(String args[])
	{
		Employee emp1 = new Employee(101,"Aman",21,"M","Hr",2020,140.80);
		Employee emp2 = new Employee(103,"Rahul",22,"F","Sales",2021,132.50);
		Employee emp3 = new Employee(102,"Prachi",20,"F","Purchase",2022,139.90);
		Employee emp4 = new Employee(104,"Vaishnavi",19,"F","Operations",2020,110.05);
		Employee emp5 = new Employee(105,"Sumit",20,"M","Operations",2020,130.05);
		Employee emp6 = new Employee(106,"Nishant",21,"M","Operations",2021,120.05);
		Employee emp7 = new Employee(107,"Rohit",24,"M","Operations",2021,131.05);
		Employee emp8 = new Employee(108,"Virat",25,"M","Sales",2021,125.05);
		Employee emp9 = new Employee(109,"Smriti",26,"F","Hr",2021,145.05);
		Employee emp10 = new Employee(110,"Ellyse",25,"F","Hr",2021,142.05);
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		list.add(emp9);
		list.add(emp10);
					
			
		int Op_Male = 0, Op_Female = 0;
		int Hr_Male = 0, Hr_Female = 0;
			
		for(int i=0; i<list.size(); i++)
		{
			Employee ep = list.get(i);
			
			if(ep.getDepartment().equals("Operations") && ep.getGender().equals("M"))
			{
				Op_Male++;
			}
			else if(ep.getDepartment().equals("Operations") && ep.getGender().equals("F"))
			{
				Op_Female++;
			}
			else if(ep.getDepartment().equals("Hr") && ep.getGender().equals("M"))
			{
				Hr_Male++;
			}
			else if(ep.getDepartment().equals("Hr") && ep.getGender().equals("F"))
			{
				Hr_Female++;
			}
		}
		
		System.out.println("Males in Operations Department : " + Op_Male);
		System.out.println("Females in Operations Department : " + Op_Female);
		System.out.println("Males in Hr Department : " + Hr_Male);
		System.out.println("Females in Hr Department : " + Hr_Female);
	}
}