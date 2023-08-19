package FileHandling;

import java.util.ArrayList;
import java.util.Scanner;

public class FileCRUD {
  public static void main(String[] args) {
        int choice= -1;
          Scanner sc = new Scanner(System.in);
          Scanner sc2=new Scanner(System.in); //for String
          ArrayList<Employee> al=new ArrayList<>();
  
  // this do-while loop will run until & unless choice is not equal to 0.
          do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("0.EXIT");  
            System.out.println("Enter Your Choice : ");   
            choice =sc.nextInt();  
            
            switch(choice){
             case 1:          
              System.out.println("Enter how many employees you want to insert: ");
              int n =sc.nextInt();
  //n times this for-loop will be run, & n times emp_record will be added to collection i.e arraylist
              for(int i=1;i<=n;i++){
                System.out.println("Enter employee id : ");
                int empid=sc.nextInt();
                System.out.println("Enter employee name : ");
                String empname=sc2.nextLine();
                System.out.println("Enter employee salary : ");
                int salary=sc.nextInt();
              
                al.add(new Employee(empid,empname,salary)); 

              }
              break;
             case 2:
               System.out.println(al);
               break;
              
             default :
               System.out.println("iYou have entered invalid input!!");
            }

          }while(choice!=0);
        
    }
}
// *******************OUTPUT*********************
// 1.INSERT
// 2.DISPLAY
// 0.EXIT
// Enter Your Choice :
// 1(my input)

// Enter how many employees you want to insert: 
// 2(my input)

// Enter employee id : 
// 1(my input)
// Enter employee name : 
// pragya(my input)
// Enter employee salary : 
// 100000(my input)
// Enter employee id : 
// 2(my input)
// Enter employee name : 
// komal(my input)
// Enter employee salary : 
// 100000(my input)

// 1.INSERT
// 2.DISPLAY
// 0.EXIT
// Enter Your Choice :
// 2(my input)
// [Employee [empId=1, empName=pragya, salary=100000], Employee [empId=2, empName=komal, salary=100000]]
// *****************************************************************************************************