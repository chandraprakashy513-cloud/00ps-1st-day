//write a program to create a class over loading and create a mathode displaydata
//one mathode print inly the id second print only name and third print idName 


class displaydata{
    int id(int n)
    {
        System.out.println("id="+id);
    }
    String name(String naam)
    {
        System.out.println("Name="+name);
    }
    double Id_name(int id,String name)
    {
        System.out.println("Name and id="+name,+id);
    }



}
public class Que_on_MOL {
    public static void main(String[] args) {
        displaydata obj=new displaydata();
        obj.displaydata("3456");

    }
}
    
