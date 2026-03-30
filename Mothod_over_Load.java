// diffenition MOL=> of mathode over loading  in java allows to craete a multiple methode...
// in the class with same name but diff parameter....it is a part of pollymorphism


class Mathmatics
{
    int addvalue(int a,int b)
    {
        return  a+b;
    }
    int addvalue(int a,int b,int c)
    {
        return a+b+c;
    }
    double addvalue(double a,double b)
    {
        return a+b;
    }
    double addvalue(double a,double b,double c)
    {
        return a+b+c;
    }
}

public class Mothod_over_Load{
    public static void main(String[] args) {
        Mathmatics obj=new Mathmatics();
        System.out.println("Result="+obj.addvalue(20.33,10.45));
    }

}
    

