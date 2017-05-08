package ua.smartprog.lessons.delegation;

public class Main {
    public static void main(String[] args) {
        A a = new A();

        Composition cm = new Composition();
        cm.setTestable(a);
        System.out.println("test composition");
        cm.getTestable().test();

        DelegationA dl1 = new DelegationA(a);
        DelegationA dl2 = new DelegationA(a);
        DelegationA dl3 = new DelegationA(dl1);
        DelegationA dl4 = new DelegationA(dl2);

        System.out.println("test delegation");
        ITestable[] arrayTest = new ITestable[]{a,dl1,dl2,dl3,dl4};

        for(ITestable item: arrayTest){
            item.test();
            System.out.println("\n");
        }

    }
}
