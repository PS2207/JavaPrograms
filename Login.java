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
                System.out.println("Successfully Login welcome user");

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
        System.out.println(login.getUsername());
        System.out.println(login.getPassword());

        //if using static method(it takes static filed only)  In another class,& not
        // creating constructor of that class. then we can use this.
        // Login.insertData();

    }
}
