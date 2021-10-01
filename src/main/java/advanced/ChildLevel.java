package advanced;

public class ChildLevel extends childClassDemo {

    public void getData(int a)
    {
        System.out.println(a);
    }
    public void getData(String a)
    {
        System.out.println(a);
    }
    public void getData(int a,int b)
    {
        System.out.println(b);
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub

        childlevel cl=new childlevel();
        cl.getData(2);
        cl.getData("hello");
        cl.getData(2, 5);

    }

}

//.. ChildDemo.java

   //     package coreJava;

class childDemo extends ParentDemo{

    String name ="QAClickAcademy";


    public childDemo()
    {
        super();// this should be always be at first line
        System.out.println("child class construtor");

    }
    public void getStringdata()
    {
        System.out.println(name);
        System.out.println(super.name);
    }


    public void getData()
    {
        super.getData();
        System.out.println("I am in child class");
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub

        childDemo cd = new childDemo();

        cd.getStringdata();
        cd.getData();
    }

}
