public class Simulation {
private  int numberOfDies;
private int numberOfTosses;
    Bins results=new Bins(2,12);
Simulation(int numberOfDies,int numberOfTosses){  //number of tosses 10000
    this.numberOfDies=numberOfDies;
    this.numberOfTosses=numberOfTosses;

}

    public static void main ( String[] args ) {
           Simulation sim=new Simulation(2,10000);
           sim.runSimulation();
           sim.printResults();

    }

    private void runSimulation () {
        Dice dice = new Dice(2);  //craps 2 dices are used
       // Bins results=new Bins(2,12);
       int tossSum= 0;
       int i=0;
    for (i=2;i<=10000;i++) {
    tossSum = dice.tossAndSum();
    // Integer numberOfBinValue=results.getBin(tossSum);  //passing sum to getBin=3 value from haspmap
    results.incrementBim(tossSum-1);
}

    }


    private void printResults () {
  int i=0;
        System.out.println("Sim Print");
  for(i=2;i<=12;i++)
  {
      results.getBin(i);
      System.out.println(i+":"+ results.getBin(i)+":");
  }

    }


}
