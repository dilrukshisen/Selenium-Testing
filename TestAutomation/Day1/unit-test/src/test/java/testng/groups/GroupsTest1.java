package testng.groups;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class GroupsTest1 {

    @Test(groups = {"smoke","reg"})
    public void testGPT1_001() {
        System.out.println("Group Test 1 - 001");
    }
    @Test(groups = {"smoke"})
    public void testGPT1_002() {
        System.out.println("Group Test 1 - 002");
    }
    @Test
    public void testGPT1_003() {
        System.out.println("Group Test 1 - 003");
    }
    @Test(groups = {"reg"})
    public void testGPT1_004() {
        System.out.println("Group Test 1 - 004");
    }
    @Test(groups = {"smoke","reg"})
    public void testGPT1_005() {
        System.out.println("Group Test 1 - 005");
    }

}
