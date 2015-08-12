//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

public class FlightTest {
	public static void main(String[] args) {
		// instantiate planes
		// For the commercial plane
		Eagle plane1 = new Eagle();
		// when plane is created, it's grounded
		// and boarding 10 passengers is possible
		plane1.board(10);
		// if the plane takes off
		plane1.takeOff();
		// we can't board passengers anymore
		plane1.board(10);
		// and there will only be 10 passengers aboard
		System.out.println("Num Passengers: "+plane1.getNumPassenger());
		// it flies in 39000 ft
		System.out.println("Altitude: "+plane1.getAltitude());
		// and its speed is 550 mph
		System.out.println("Speed: "+plane1.getSpeed());
		// if the plane lands again
		plane1.land();
		// its altitude becomes 0
		System.out.println("Altitude: "+plane1.getAltitude());
		// as well as its speed
		System.out.println("Speed: "+plane1.getSpeed());
		// As for the bomber plane
		Dragon plane2 = new Dragon();
		// when plane is created, it's grounded
		// and loaded with 2 bombs
		System.out.println("Num Bombs: "+plane2.getNumBombs());
		// but it cannot drop bomb while grounded
		plane2.dropBomb();
		// if the plane takes off
		plane2.takeOff();
		// it can drop bombs
		plane2.dropBomb();
		// until its bomb bays are empty
		plane2.dropBomb();
		// that's when it cannot drop bomb anymore
		plane2.dropBomb();
		// it flies at 30000 ft
		System.out.println("Altitude: "+plane2.getAltitude());
		// and its speed is 1000 mph
		System.out.println("Speed: "+plane2.getSpeed());
		// until it lands
		plane2.land();
		// its altitude becomes 0
		System.out.println("Altitude: "+plane1.getAltitude());
		// as well as its speed
		System.out.println("Speed: "+plane1.getSpeed());
	}
}
