package ua.smartprog.lessons.lesson_34.AbstractFactory;

public class CDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer getDeveloper() {
        return new Csharp();
    }
}
