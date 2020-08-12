import java.util.Random;

public class U1 extends Rocket {

    U1()
    {
        cost=100 ;
        weight= 9070.185 ;
        cargolimit=16329.33 ;

      // double launchexplosion ;
      // double landingcrash;

    }
    // calculate chance of exploding and return either true or false based on a random number using the probability equation for each.
    public boolean launch()
    {
        double percentage;
        Random r = new Random();
        percentage= r.nextDouble()*100;

        launchexplosion=5*(weight/cargolimit);

        if(percentage>launchexplosion)  // if percentage bigger than probability ,successful launch
        {  System.out.println("The launching U1 was successful");
        return true;}

        else{System.out.println("The launching U1 exploid");
            return false;

        }// exploide
    }

    //calculate chance of exploding and return either true or false based on a random number using the probability equation for each.
    public boolean land()
    {
        double percentage;
        Random r = new Random();
        percentage= r.nextDouble()*100;

        landingcrash=1*(weight/cargolimit);

        if(percentage>landingcrash) {
            System.out.println("The landing U1 was successful");
            return true;
        }
        else {
            System.out.println("The landing U1  exploid");
            return false;

        }
    }
/*
    public void printstatus( boolean success,String  status)
    {
        if(success)
            System.out.println("The "+status+" was successufl");
        else
            System.out.println("The "+status+" exploid");
    }
    /*
/*
    // Chance of launch explosion = 5% * (cargo carried / cargo limit)
    public double getlaunchexplosion()
    {
        launchexplosion=.05*(cargocarried/cargolimit);

        return launchexplosion;
    }

    //Chance of landing crash = 1% * (cargo carried / cargo limit)

    public double getlandingcrash()
    {
        landingcrash=.01*(cargocarried/cargolimit);

        return landingcrash;

    }
    */
}
