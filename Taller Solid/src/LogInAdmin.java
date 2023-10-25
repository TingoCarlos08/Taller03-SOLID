public class LogInAdmin extends LogInterface {
    private boolean userIsAdmin;
    UserService userService;

    public LogInAdmin(UserService userService) {
        this.userService=usrService;
    }
    
    @Override
    public void log (User user) {
        this.userIsAdmin = verifyIfTheUserIsAdmin(user);
        if(!userIsAdmin){
            return;
        }
        System.out.println("Has access to the website in admin mode");
        // Logic
    }
    private boolean verifyIfTheUserIsAdmin(User user){
        // Do something
        return true;
    }
}

