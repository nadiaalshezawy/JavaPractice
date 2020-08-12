import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    //this method loads all items from a text file and returns an ArrayList of Items
    public ArrayList<Item> laodItems(String filename) throws Exception {
        File file = new File(filename);
        String[] subLine = new String[2];

        ArrayList<Item> itemList = new ArrayList<Item>();


        Scanner fileScanner = new Scanner(file);
        int count = 0;

        while (fileScanner.hasNextLine()) {
            Item item1 = new Item();
            String Line = fileScanner.nextLine();
            subLine = Line.split("=");
            item1.name = subLine[0];
            item1.weight = Integer.parseInt(subLine[1]);
            itemList.add(item1);


        }

        return itemList;
    }


/*
    loadU1: this method takes the ArrayList of Items returned from loadItems and starts creating U1 rockets.
    It first tries to fill up 1 rocket with as many items as possible before creating a new rocket object and
    filling that one until all items are loaded. The method then returns the ArrayList of those U1 rockets that are fully loaded.
    */

    public ArrayList<U1> loadU1(ArrayList<Item> itemList) {


        ArrayList<U1> U1List = new ArrayList<U1>();
        int index = 0;

       // U1 U1rocket ;


        while ( index<itemList.size()) {

            U1 U1rocket =new U1();

            do{

              if(U1rocket.canCarry(itemList.get(index)))
              {
                   U1rocket.carry(itemList.get(index));
                      ++index; }
                      else
                         break;
             }while(index < itemList.size());




        U1List.add(U1rocket);  // add u1 to list




        }
        return U1List;


    }

   /* loadU2: this method also takes the ArrayList of Items and starts creating U2 rockets and filling
    them with those items the same way as with U1 until all items are loaded. The method then returns
    the ArrayList of those U2 rockets that are fully loaded.
    */
    public ArrayList<U2> loadU2(ArrayList<Item> itemList) {


        ArrayList<U2> U2List = new ArrayList<U2>();
        int index = 0;


        while ( index<itemList.size()) {

            U2 U2rocket =new U2();

            do{

                if(U2rocket.canCarry(itemList.get(index)))
                {
                    U2rocket.carry(itemList.get(index));
                    ++index; }
                else
                    break;
            }while(index < itemList.size());




            U2List.add(U2rocket);  // add u1 to list




        }
        return U2List;

    }

    /*runSimulation: this method takes an ArrayList of Rockets and calls launch and land methods for each of
     the rockets in the ArrayList. Every time a rocket explodes or crashes (i.e if launch or land return false)
     it will have to send that rocket again. All while keeping track of the total budget required to send each rocket
     safely to Mars. runSimulation then returns the total budget required to send all rockets (including the crashed ones)*/

    public double  runSimulation(ArrayList<Rocket> RocketList)
        {
            int index=0;
            double budget=0;


            while (index<RocketList.size())
            {
               // Rocket rock1=new Rocket();
               // rock1=RocketList.get(index);

                if((RocketList.get(index)).launch() && (RocketList.get(index)).land())
                {
                    budget=budget+(RocketList.get(index)).cost;
                    ++index;
                }
                else
                    budget=budget+(RocketList.get(index)).cost;

            }


               return budget;
        }





}

