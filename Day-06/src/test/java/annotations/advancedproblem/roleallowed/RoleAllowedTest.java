package annotations.advancedproblem.roleallowed;
import org.junit.jupiter.api.Test;

public class RoleAllowedTest {

    @Test
    public void testAdminAccess() {
        AdminService adminService = new AdminService();
        adminService.login("ADMIN");
        adminService.manageAdminSettings("ADMIN");  // Should print "Managing admin settings."
    }

    @Test
    public void testNonAdminAccess() {
        AdminService adminService = new AdminService();
        adminService.login("USER");
        adminService.manageAdminSettings("USER");  // Should print "Access Denied!"
    }

    @Test
    public void testGeneralMethod() {
        AdminService adminService = new AdminService();
        adminService.viewSettings("USER");  // Should print "Viewing settings."
    }
}
