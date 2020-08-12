import java.util.ArrayList;

public class main {

    public static void main (String args[])throws Exception
    {
        ArrayList<Item> phase1item=new ArrayList<Item>();
        ArrayList<Item> phase2item=new ArrayList<Item>();

        ArrayList<U1> phase1U1=new ArrayList<U1>();
        ArrayList<U1> phase2U1=new ArrayList<U1>();
        ArrayList<U2> phase1U2=new ArrayList<U2>();
        ArrayList<U2> phase2U2=new ArrayList<U2>();

        ArrayList<Rocket> rocketList=new ArrayList<Rocket>();


        //Create a Simulation object
        Simulation sim1=new Simulation();
       // Load Items for Phase-1 and Phase-2
        phase1item=sim1.laodItems("Phase-1.txt");
        phase2item=sim1.laodItems("Phase-2.txt");

      //  Load a fleet of U1 rockets for Phase-1 and then for Phase-2
        phase1U1=sim1.loadU1(phase1item);
        phase2U1=sim1.loadU1(phase2item);

        // convert U1 list to rocket
        for( int i=0;i<phase1U1.size();i++)
          rocketList.add(phase1U1.get(i));




        //Run the simulation using the fleet of U1 rockets and display the total budget required.
        System.out.println("The total budget of U1 "+sim1.runSimulation(rocketList)+"  million");



// repeate for U2


        //  Load a fleet of U2 rockets for Phase-1 and then for Phase-2
        phase1U2=sim1.loadU2(phase1item);
        phase2U2=sim1.loadU2(phase2item);

        // convert U2 list to rocket
        rocketList=new ArrayList<Rocket>();


        for( int i=0;i<phase1U2.size();i++)
            rocketList.add(phase1U2.get(i));

        System.out.println("U2 programm");

        //Run the simulation using the fleet of U1 rockets and display the total budget required.
        System.out.println("The total budget of U2 :"+sim1.runSimulation(rocketList)+"  million");



    }
}

/*
Create a Main class with the main method and start running the simulation:
Create a Simulation object
Load Items for Phase-1 and Phase-2
Load a fleet of U1 rockets for Phase-1 and then for Phase-2
Run the simulation using the fleet of U1 rockets and display the total budget required.
Repeat the same for U2 rockets and display the total budget for that.
 */