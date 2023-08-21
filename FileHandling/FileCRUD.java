package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;

public class FileCRUD {
  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    int choice = -1;
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in); // for String
    ArrayList<Employee> al = new ArrayList<>();
    File file = new File("myFile.txt");
    ObjectOutputStream oos = null;
    ObjectInputStream ois = null;
    ListIterator li = null;
    if (file.isFile()) {
      ois = new ObjectInputStream(new FileInputStream(file));
      al = (ArrayList<Employee>) ois.readObject();
      ois.close();
    }
    // this do-while loop will run until & unless choice is not equal to 0.
    do {
      System.out.println("1.INSERT");
      System.out.println("2.DISPLAY");
      System.out.println("3.SEARCH");
      System.out.println("4.DELETE");
      System.out.println("5.UPDATE");
      System.out.println("6.SORT By EmpId - On Screen");
      System.out.println("7.SORT By EmpId - On File");
      System.out.println("8.SORT By EmpName - On Screen");
      System.out.println("9.SORT By EmpName - On File");
      System.out.println("10.SORT By Salary in desc - On Screen");
      System.out.println("11.SORT By Salary in asc- On File");
      System.out.println("0.EXIT");
      System.out.println("Enter Your Choice : ");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Enter how many employees you want to insert: ");
          int n = sc.nextInt();
          // n times this for-loop will be run, & n times emp_record will be added to collection i.e arraylist
          for (int i = 1; i <= n; i++) {
            System.out.println("Enter employee id : ");
            int empid = sc.nextInt();
            System.out.println("Enter employee name : ");
            String empname = sc2.nextLine();
            System.out.println("Enter employee salary : ");
            int salary = sc.nextInt();

            al.add(new Employee(empid, empname, salary));
          }
          oos = new ObjectOutputStream(new FileOutputStream(file)); // myFile will be created
          oos.writeObject(al); // collection data will be written in created file but we cannot read it,

          break;

        case 2:
          if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Employee>) ois.readObject();
            ois.close();

            System.out.println("_____________________________________________________\n");
            li = al.listIterator();
            while (li.hasNext())
              System.out.println(li.next());
            System.out.println("______________________________________________________");
    
          } else {
            System.out.println("File Not Exists...");
          }
          break;

        case 3:
          if (file.isFile()) {
            //read inserted input as 3
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Employee>) ois.readObject();
            ois.close();

            boolean found = false;
            System.out.println("Enter empId to serach: ");
            int empid = sc.nextInt();
            System.out.println("______________________________________________________");
            li = al.listIterator();
            while (li.hasNext()) {
              Employee e = (Employee) li.next();
              if (e.empId == empid) {
                System.out.println(e);
                found = true;
              }
            }
            if (!found) {
              System.out.println("Record Not Found...!!");
              System.out.println("______________________________________________________");
            }
          } else {
            System.out.println("File not exists...");
          }
          break;
        case 4:
          if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Employee>) ois.readObject();
            ois.close();

            boolean found = false;
            System.out.println("Enter empid to delete: ");
            int empid = sc.nextInt();
            System.out.println("_________________________");
            li = al.listIterator();
            while (li.hasNext()) {
              Employee e = (Employee) li.next();
              if (e.empId == empid) {
                li.remove();
                found = true;
              }
            }
            if (found) {
              // since reocrd deleted from collection not file,so add these lines to update file,.
              oos = new ObjectOutputStream(new FileOutputStream(file));
              oos.writeObject(al);
              oos.close();
              System.out.println("Record is deleted successfully...");

            } else {
              System.out.println("Record Not Found...");
            }
            System.out.println("_________________________");
          } else {
            System.out.println("File Not exists...");
          }
          break;
        case 5:
         if(file.isFile()){
           ois = new ObjectInputStream(new FileInputStream(file));
           al = (ArrayList<Employee>)ois.readObject();
           ois.close();
           
           boolean found=false;
           System.out.println("Enter empid to update: ");
           int empid= sc.nextInt();
           System.out.println("_________________________");
           li=al.listIterator();
           while(li.hasNext()){
            Employee e = (Employee)li.next();
            if(e.empId == empid){
              System.out.println("Enter new empName: ");
              String ename= sc2.nextLine();
               System.out.println("Enter new salary:");
               int salary= sc.nextInt();
               li.set(new Employee(empid, ename, salary));
               found=true;
            }
           }
           if(found){
               oos=new ObjectOutputStream(new FileOutputStream(file));
               oos.writeObject(al);
               oos.close();
                System.out.println("Record updated successfully...");
           }else{
                System.out.println("Record Not Found...");
           }
         }else{
          System.out.println("File not exists");
         }
         break;
         case 6:
          if(file.isFile()){
            ois=new ObjectInputStream(new FileInputStream(file));
            al=(ArrayList<Employee>) ois.readObject();
            ois.close();

            Collections.sort(al, new Comparator<Employee>() {
              public int compare(Employee e1, Employee e2){
                return e1.empId - e2.empId;
              }
            });
            System.out.println("__________________________________________-");
            li=al.listIterator();
            while(li.hasNext()){
             System.out.println(li.next());
            }
          }else{
            System.out.println("File not exists...");
          }
          break;

          case 7:
           if(file.isFile()){
             ois=new ObjectInputStream(new FileInputStream(file));
             al=(ArrayList<Employee>) ois.readObject();
             ois.close();

             Collections.sort(al, new Comparator<Employee>() {
              public int compare(Employee e1, Employee e2){
                return e1.empId - e2.empId;
              }
             });
             oos=new ObjectOutputStream(new FileOutputStream(file));
             oos.writeObject(al);
             oos.close();
            
             System.out.println("_________________________________________");
             li=al.listIterator();
             while(li.hasNext()){
              System.out.println(li.next());
             }
           }else{
             System.out.println("File not exists...");
           }
           break;


         case 8:
           if(file.isFile()){
            ois=new ObjectInputStream(new FileInputStream(file));
            ois.readObject();
            ois.close();

            Collections.sort(al, new Comparator<Employee>() {
              public int compare(Employee e1, Employee e2){
                return e1.empName.compareTo(e2.empName);
              }
            });
            System.out.println("_________________________________________");
            li=al.listIterator();
            while(li.hasNext()){
              System.out.println(li.next());
            }
           }else{
            System.out.println("File not exists...");
           }
          break;
         case 9:
          if(file.isFile()){
            ois=new ObjectInputStream(new FileInputStream(file));
            ois.readObject();
            ois.close();
            Collections.sort(al, new Comparator<Employee>() {
              public int compare(Employee e1, Employee e2){
                return e1.empName.compareTo(e2.empName);
              }
            });
             System.out.println("_________________________________________");
             li=al.listIterator();
             while(li.hasNext()){
              System.out.println(li.next());
             }
             oos=new ObjectOutputStream(new FileOutputStream(file));
             oos.writeObject(al);
             oos.close();
          }else{
             System.out.println("File not exists...");
          }
          break;
         case 10:
          if(file.isFile()){
            ois=new ObjectInputStream(new FileInputStream(file));
            ois.readObject();
            ois.close();

            Collections.sort(al, new Comparator<Employee>() {
              public int compare(Employee e1, Employee e2){
                return e2.salary - e1.salary;
              }
            });
            System.out.println("_________________________________________");
            li=al.listIterator();
            while(li.hasNext()){
              System.out.println(li.next());
            }

          }else{
            System.out.println("File not exists...");
          }
          break;

          case 11:
           if(file.isFile()){
             ois=new ObjectInputStream(new FileInputStream(file));
             ois.readObject();
             ois.close();
             
             Collections.sort(al, new Comparator<Employee>() {
               public int compare(Employee e1, Employee e2){
                return e1.salary - e2.salary;
               }
             });

             oos=new ObjectOutputStream(new FileOutputStream(file));
             oos.writeObject(al);
             oos.close();

             li=al.listIterator();
             while(li.hasNext()){
              System.out.println(li.next());
             }
           }else{
            System.out.println("File not exists...");
           }
           break;
        
           default:
          System.out.println("You have entered invalid input!!");
      }

    } while (choice != 0);

  }
}
// *******************OUTPUT*********************
// 1.INSERT
// 2.DISPLAY
// 3.SEARCH
// 4.DELETE
// 5.UPDATE
// 6.SORT By EmpId - On Screen
// 7.SORT By EmpId - On File
// 8.SORT By EmpName - On Screen        
// 9.SORT By EmpName - On File
// 10.SORT By Salary in desc - On Screen
// 11.SORT By Salary in asc- On File 
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
// 3.SEARCH
// 4.DELETE
// 5.UPDATE
// 6.SORT By EmpId - On Screen
// 7.SORT By EmpId - On File
// 8.SORT By EmpName - On Screen        
// 9.SORT By EmpName - On File
// 10.SORT By Salary in desc - On Screen
// 11.SORT By Salary in asc- On File 
// 0.EXIT
// Enter Your Choice :
// 2(my input)
// [Employee [empId=1, empName=pragya, salary=100000], Employee [empId=2,
// empName=komal, salary=100000]]

// but if you rerun the code & display the content, data will not be dispayed,
// because collection will be empty.
// Since collections store the data only during the execution.
// so whenever there is the data in a collection, we want to display even after
// rerun ,we need to write this collection into a file.
// so to write data into file use -ObjectOutputStream(new
// FileOutputStream("myFile.txt")), oos.objectWrite(collecionObj)
// to read data from file use -ObjectInputStream(new
// FileInputStream("myFile.txt")), ois.objectRead()
// *****************************************************************************************************