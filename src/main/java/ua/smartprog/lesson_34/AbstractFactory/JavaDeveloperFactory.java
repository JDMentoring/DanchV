package ua.smartprog.lesson_34.AbstractFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }
}
