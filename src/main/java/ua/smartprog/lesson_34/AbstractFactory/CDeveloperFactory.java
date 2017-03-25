package ua.smartprog.lesson_34.AbstractFactory;

public class CDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer getDeveloper() {
        return new Csharp();
    }
}
