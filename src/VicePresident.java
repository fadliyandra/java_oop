class VicePresident extends Manager{

    VicePresident(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hi " + ", My Name Is Manager VP " + this.name); //methode overriding mendeklarasikan ulang
    }
}


