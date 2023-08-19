import java.util.Scanner;

class Login {
    // private Scanner sc=new Scanner(System.in);
    private Scanner sc;
    private String username, password;


    public Login(Scanner sc) {
        this.sc = sc;
        insertData();
    }

    public void insertData() {
        System.out.println("Enter Username: ");
        username = sc.next();
        System.out.println("Enter Password:");
        password = sc.next();
        validation();
    }

    public void validation() {
        if (username.equals("admin")) {
            if (password.equals("admin")) {
                System.out.println("Login Successfully!! Welcome admin!!");

            } else {
                System.out.println("Wrong Password please try again ");

            }
        } else {
            System.out.println("Wrong Username please try again ");
        }
    }
  

    public Scanner getSc() {
        return sc;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}

class LoginApi {
    public static void main(String as[]) {
        // if using Scanner in main class, then create constructor of Login class & pass field "Scanner sc".
        Scanner sc = new Scanner(System.in);
        Login login = new Login(sc);
        System.out.println("\nYour username is: "+login.getUsername());
        System.out.println("Your password is: "+login.getPassword());

     // if using static method(it takes static filed only) In another class,
    //  & not creating constructor of that class. then we can use this.
        // Login.insertData();
     }
}
// ******OUTPUT*************
// Enter Username:
// admin
// Enter Password:
// admin
// Login Successfully!!
// Your username is: admin
// Your password is: admin
// ***************************