package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest2 {

    @Test
    public void testGPT2_001() {
        System.out.println("Group Test 2 - 001");
    }
    @Test(groups = {"reg"})
    public void testGPT2_002() {
        System.out.println("Group Test 2 - 002");
    }
    @Test(groups = {"reg"})
    public void testGPT2_003() {
        System.out.println("Group Test 2 - 003");
    }
}
