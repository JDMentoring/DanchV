package ua.smartprog.lessons.delegation;

public class DelegationB implements ITestable {
    private ITestable testable;

    public DelegationB(ITestable testable) {
        this.testable = testable;
    }

    public void test() {
        System.out.println(" before test");
        testable.test();
        System.out.println(" after test");
    }
}
