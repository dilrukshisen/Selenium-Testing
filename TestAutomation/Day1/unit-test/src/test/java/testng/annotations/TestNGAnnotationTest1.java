package testng.annotations;

import org.testng.annotations.Test;

public class TestNGAnnotationTest1 {

    public static void main(String[] args) {
        System.out.println("Hello World");
        TestNGAnnotationTest1 x = new TestNGAnnotationTest1();
        x.print();
    }

    @Test
    public void test(){
        System.out.println("Test");
    }

    public void print(){
        System.out.println("Print !");
    }

    public String x(String s,int y){
        System.out.println("10");
        return "2";
    }
}
