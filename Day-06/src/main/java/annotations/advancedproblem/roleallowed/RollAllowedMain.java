package annotations.advancedproblem.roleallowed;

import java.lang.reflect.Method;

public class RollAllowedMain {

    public static void main(String[] args) {
        AdminService adminService = new AdminService();

        // Simulate user roles
        String adminRole = "ADMIN";
        String userRole = "USER";

        // Admin user
        System.out.println("Testing as ADMIN user:");
        adminService.login(adminRole);
        invokeMethodBasedOnRole(adminService, "manageAdminSettings", adminRole);

        // Non-admin user
        System.out.println("\nTesting as USER:");
        adminService.login(userRole);
        invokeMethodBasedOnRole(adminService, "manageAdminSettings", userRole);
    }

    private static void invokeMethodBasedOnRole(AdminService adminService, String methodName, String role) {
        try {
            Method method = adminService.getClass().getMethod(methodName, String.class);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (roleAllowed.value().equals(role)) {
                    method.invoke(adminService, role);
                } else {
                    System.out.println("Access Denied!");
                }
            } else {
                method.invoke(adminService, role);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
