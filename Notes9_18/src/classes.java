import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class classes {
    public static void main(String args[]){

        Person homeOwner = new Person();
        homeOwner.setFirstName("Bob");//set appends the data
        homeOwner.firstName = "Mike";//also sets the name, but has less adaptability than set

        System.out.println(homeOwner.getFirstName());//get shows the data

        LocalDate xDate1 = LocalDate.now();
        int iAge = homeOwner.calcAge(xDate1);

        //creates an array list of items. Does not need a defined end
        List<Listitem> xList = new ArrayList<>();



        Listitem item1 = new Listitem();
        xList.add(item1);//added item1 to our list, all contents

        Listitem item2 = new Listitem();
        xList.add(item2);

        Listitem item3 = new Listitem();
        item2.name = "yo numbuh two here!";
        xList.add(item3);

        //System.out.println(item1.name);

        for (Listitem x: xList) {

            System.out.println(x.name);

        }
    }
}
