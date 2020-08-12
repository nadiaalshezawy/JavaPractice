public interface SpaceShip {

    boolean launch();  // return true/false if launch successfull/crashed
    boolean land();   // returns either true or false based on the success of the landing.
    boolean  canCarry(Item it ); //returns true if the rocket can carry such item or false if it will exceed the weight
    void  carry(Item it ); // a method that also takes an Item object and updates the current weight of the rocket.
}
