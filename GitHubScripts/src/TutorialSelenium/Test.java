package TutorialSelenium;

public class Test {
    static int x = 11;
    private int y = 33;
    public void method1(int x)
    {
        Test t = new Test();
        Test.x = 22;
        y = 44;
        System.out.println("Test.x: " + Test.x);
        System.out.println("t.x: " + Test.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y); 
     }
 public static void main(String args[])
    {
        Test t = new Test();
        t.method1(5);
    }

}
