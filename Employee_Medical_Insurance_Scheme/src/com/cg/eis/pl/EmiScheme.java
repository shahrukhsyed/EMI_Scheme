package com.cg.eis.pl;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class EmiScheme {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		EmployeeService service = new EmployeeService();
	       while (true) {
	            System.out.println("==================================");
	            System.out.println("1. Add new Employee");
	            System.out.println("2. Delete Employee");
	            System.out.println("3. Find Employee");
	            System.out.println("4. Display All Employee");
	            System.out.println("5. EXIT");
	            System.out.println("Enter your choice\n");

	            try {
	                String choice = br.readLine();

	                switch (choice) {
	                    case "1": // add emp
	                        Employee emp = generateEmployee();
	                        service.addEmployee(emp);
	                        break;
	                    case "2": // delete emp
	                        int id = generateEid();
	                        emp = service.findEmployee(id);
	                        if (emp != null) {
	                            service.deleteEmployee(emp);
	                            System.out.println("Employee " + id + " deleted");
	                        } else {
	                            System.out.println("Not found");
	                        }
	                        break;	                  
	                    case "3": // find emp
	                        id = generateEid();
	                        emp = service.findEmployee(id);
	                        if (emp != null) {
	                            System.out.println("Employee found");
	                            System.out.println(emp);
	                        } else {
	                            System.out.println("No Employee found");
	                        }
	                        break;
	                    case "4": 
	                    	Map<Integer,Employee> accmap=service.getAllAccount();
	    					Collection<Employee> vc = accmap.values();
	    					List<Employee> acclist=new ArrayList<Employee>(vc);
	    					if(acclist.size() == 0)
	    					{
	    						System.out.println("No Employees added!");
	    					}
	    					else {
	    						for(Employee e: acclist)
	    							{
	    								service.printStatement(e);
	    							}
	    					}
	    						break;  
	                        
	                    case "5":
	                        System.exit(0);
	                        break;
	                    default:
	                        System.out.println("Invalid choice");
	                }
	            } catch (IOException e) {
	                System.out.println("Wrong input given");
	            }
	        }
	       
	       
	}

	private static Employee generateEmployee() {
		// TODO Auto-generated method stub
        int id;
        String name;
        double salary;
        String desg;

        try {
            id = generateEid();
            name = generateEName();
            salary = generateSalary();
            desg = generateDesg();

            Employee emp = new Employee(id, name, salary, desg);

            return emp;
        } catch (IOException e) {
            System.out.println("Invalid Input format");
        }
		return null;
	}
	 private static int generateEid() throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter Emp id");
	        while (true) {
	            String s_id = br.readLine();
	            try {
	                  return Integer.parseInt(s_id);      
	                
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
	 private static String generateEName() throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter Emp Name");
	        while (true) {
	            String s_name = br.readLine();
	            try {
	                  return s_name;      
	                
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }

	    // to get salary from user
	    private static double generateSalary() throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter Emp Salary");
	        while (true) {
	            String s_sal = br.readLine();
	            try {
	                  return Double.parseDouble(s_sal);     
	                
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
	    
	    // to get designation from user
	    private static String generateDesg() throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter Emp Designation");
	        while (true) {
	            String s_desg = br.readLine();
	            try {
	                  return s_desg;     
	                
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
	    

}
