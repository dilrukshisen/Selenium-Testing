package testng.annotations;

import org.testng.annotations.Test;

public class PriorityTest1 {


    @Test(priority = 0)
    public void testLogin() {
        System.out.println("Login");
    }

    @Test(priority = 1)
    public void testCreate() {
        System.out.println("Create");
    }

    @Test(priority = 2)
    public void testEdit() {
        System.out.println("Edit");
    }

    @Test(priority = 3)
    public void testDelete() {
        System.out.println("Delete");
    }

    @Test(priority = 4)
    public void testLogout() {
        System.out.println("Logout");
    }

}
