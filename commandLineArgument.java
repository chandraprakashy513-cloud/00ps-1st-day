//using command line argument

public class commandLineArgument {
    public static void main(String[] arg) {
        String name = arg[0];
        String mName = arg[1];
        String add = arg[3];
        String lname = arg[2];
        String fnmae = arg[0]+arg[1]+arg[2];
        System.out.println("Name="+name);
        System.out.println("middle Name="+mName);
        System.out.println("last Name="+lname);
        System.out.println("address="+add);
        System.out.println("full Name="+fnmae);


    }
}
