//copy constructor
class CopyConst {
    int age;
    String name;

    //parameterized constructor
    CopyConst(String name,int age){
        this.name = name;
        this.age=age;
    }
    //copy constructor
    CopyConst(CopyConst C)
    {
        this.age = C.age;
        this.name = C.name;
    }
    void display(){
        System.out.println("Name:"+name+",Age:"+age);
    }
    public static void main(String[] args) {
        CopyConst C1 = new CopyConst("annu",19);
        CopyConst C2 = new CopyConst(C1);

        C1.display();
        C2.display();
    }
}

