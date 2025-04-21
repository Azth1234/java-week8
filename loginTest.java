interface PortalSystem{
    boolean login(String id,String Password);
}

class loginSystem implements PortalSystem{
    public boolean login(String id,String Password){
        if(id.equals("Student123") && Password.equals("Pass123")){
            System.out.println("Login Succesfully");
            return true;
        }
        else{
            System.out.println("Invalid Credentials!!!");
            return false;
        }
    }
}

//main class
class loginTest{
    public static void main(String[] args) {
        loginSystem portal=new loginSystem();
        portal.login("Student123","Pass123");
        portal.login("Studen12","pass");
    }
}