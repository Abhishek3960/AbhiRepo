package annotation;

public enum Tester {
    Abhishek("Abhishek Kumar");

    public String authorName;
    Tester(String authorName)
    {
        this.authorName=authorName;
    }

    public String toString() {
        return this.authorName;
    }
}
