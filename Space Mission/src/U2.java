import java.util.Random;

public class U2 extends Rocket {
    U2()
    {
        cost=120 ;
        weight= 16329.33 ;
        cargolimit=26308.365 ;

      //  double launchexplosion ;
       // double landingcrash;

    }
    // calculate chance of exploding and return either true or false based on a random number using the probability equation for each.
    public boolean launch()
    {
        double percentage;
        Random r = new Random();
        percentage= r.nextDouble()*100;

        launchexplosion=4*(weight/cargolimit);

        if(percentage>launchexplosion)  // if percentage bigger than probability ,successful launch
        {System.out.println("The launching U2 was successful");
            return true;
        }

        else {System.out.println("The launching  U2 exploid");
            return false;    // exploide
        }
    }

    //calculate chance of exploding and return either true or false based on a random number using the probability equation for each.
    public boolean land()
    {
        double percentage;
        Random r = new Random();
        percentage= r.nextDouble()*100;

        landingcrash=8*(weight/cargolimit);

        if(percentage>landingcrash) {
            System.out.println("The Landing U2 was successful");
            return true;
        }
        else {System.out.println("The landing U2 exploid");
            return false;
        }
    }
}
