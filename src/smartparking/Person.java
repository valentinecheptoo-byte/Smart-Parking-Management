package smartparking;

public abstract class Person {
    protected String name;
    protected String id;

    public Person(String name , String id) {
        this.name = name;
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public String getid() {
        return id;
    }

    public abstract void displayDetails();
    
}
