abstract class View{
    protected Implementer implementer;
    public View(Implementer implementer){
        this.implementer= implementer;
    }
    abstract String show();
}

class Grid extends View{

    public Grid(Implementer implementer) {
        super(implementer);
    }

    @Override
    String show() {
        return implementer.info()+" Grid View";
    }

}

class List extends View{

    public List(Implementer implementer) {
        super(implementer);
    }

    @Override
    String show() {
        return implementer.info()+" List View";
    }

}

class Table extends View{

    public Table(Implementer implementer) {
        super(implementer);
    }

    @Override
    String show() {
        return implementer.info()+" Table View";
    }

}


interface Implementer{
    String info();
}

class Student implements Implementer{

    @Override
    public String info() {
        return "Student";
    }

}

class Faculty implements Implementer{

    @Override
    public String info() {
        return "Faculty";
    }

}






class Main{
    public static void main(String[] args) {
        View v1= new Grid (new Student());
        View v2= new List(new Faculty());
        View v3= new Table(new Student());

        System.out.println(v1.show());

        System.out.println(v2.show());

        System.out.println(v3.show());
    }

}