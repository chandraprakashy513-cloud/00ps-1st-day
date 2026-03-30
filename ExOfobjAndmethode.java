//Que->>write a programm to create a class of name studentInfo and create a data member id int ,name string
//course string and create two methode setInfo and getinfo 


class studentInfo{
    int id;
    String name;
    String course;
    
    void setInfo()
    {
        id=101;
        name="chandra Prakash yadav";
        course ="b.trch";

    }
     void getInfo()
     {
        System.out.println("Name="+name);
        System.out.println("Id="+id);
        System.out.println("Course="+course);
     }
}


public class ExOfobjAndmethode {
    public static void main(String[] args) {
        studentInfo obj=new studentInfo();
        obj.setInfo();
        obj.getInfo();
    }
    
}
