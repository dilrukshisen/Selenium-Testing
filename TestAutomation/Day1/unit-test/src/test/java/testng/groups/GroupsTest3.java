package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest3 {

    @Test(groups = {"reg"})
    public void testGPT3_001() {
        System.out.println("Group Test 3 - 001");
    }
    @Test
    public void testGPT3_002() {
        System.out.println("Group Test 3 - 002");
    }
    @Test(groups = {"smoke","reg"})
    public void testGPT3_003() {
        System.out.println("Group Test 3 - 003");
    }

    @Test(groups = {"smoke"})
    public void testGPT3_004() {
        System.out.println("Group Test 3 - 004");
    }
}
