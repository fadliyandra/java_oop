class Manager extends Employee{
    String name;

    String company;

    Manager(String name){
        super(name);
    }
    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hi " + ", My Name Is Manager " + this.name);
    }
}
