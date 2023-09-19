package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest4 {

    @Test(groups = {"reg"})
    public void testGPT4_001() {
        System.out.println("Group Test 4 - 001");
    }
    @Test(groups = {"reg"})
    public void testGPT4_002() {
        System.out.println("Group Test 4 - 002");
    }
    @Test(groups = {"smoke","reg"})
    public void testGPT4_003() {
        System.out.println("Group Test 4 - 003");
    }
    @Test(groups = {"reg"})
    public void testGPT4_004() {
        System.out.println("Group Test 4 - 004");
    }
    @Test(groups = {"smoke"})
    public void testGPT4_005() {
        System.out.println("Group Test 4 - 005");
    }
}

