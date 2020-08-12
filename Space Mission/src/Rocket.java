public class Rocket implements SpaceShip {

    double cost ;
    double weight ; // rocket weight
    double cargolimit ; //   rocket weight with cargo
    double launchexplosion ;
    double landingcrash;



   public  boolean launch()  // always return true and will be override in u1/u2
    {
        return true;
    }
   public  boolean land()  // always return true and will be override in u1/u2
    {
        return true;
    }
    public boolean   canCarry(Item it ) //returns true if the rocket can carry such item or false if it will exceed the weight
    {
        double temp=0;

        temp=weight+it.weight;
        if ((temp) < cargolimit)
            return true;
         else
             return false;
    }

    public void   carry(Item it ) // a method that also takes an Item object and updates the current weight of the rocket.
    {
        weight=weight+it.weight;

    }
}

