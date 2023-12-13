/**
 * User: Sandeera Jayampathi (DS)
 * Date: 11/27/2023
 * Time: 9:07 PM
 */
public class Main {

    public static void main(String[] args) {
        Hashtable myHashtable = new Hashtable();
        myHashtable.set("nails",100);
        myHashtable.set("tile",50);
        myHashtable.set("lumber",80);

        myHashtable.set("bolts",200);
        myHashtable.set("screws",140);
        myHashtable.printTable();
        System.out.println("value of lumber = "+myHashtable.get("lumber"));
        System.out.println("value of screws = "+myHashtable.get("screws"));
        System.out.println("value of cement = "+myHashtable.get("cement"));

        System.out.println("keys list = "+myHashtable.keys());
    }


}
