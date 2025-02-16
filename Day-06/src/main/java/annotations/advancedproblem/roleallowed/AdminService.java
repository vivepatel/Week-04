package annotations.advancedproblem.roleallowed;


public class AdminService {

    public void login(String role) {
        if ("ADMIN".equals(role)) {
            System.out.println("Login successful. You have ADMIN access.");
        } else {
            System.out.println("Login successful. You have USER access.");
        }
    }

    @RoleAllowed("ADMIN")
    public void manageAdminSettings(String role) {
        if (role.equals("ADMIN")) {
            System.out.println("Managing admin settings.");
        } else {
            System.out.println("Access Denied!");
        }
    }

    public void viewSettings(String role) {
        System.out.println("Viewing settings.");
    }
}
