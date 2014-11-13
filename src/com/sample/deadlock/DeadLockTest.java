/**
 * @autor pathmasri
 * Nov 14, 2014 12:59:40 AM
 */
package com.sample.deadlock;

public class DeadLockTest {
	
	public static void main(String[] args){
		Ball ball = new Ball();
		Racket racket = new Racket();
		
		PlayerA playerA = new PlayerA();
		playerA.setBall(ball);
		playerA.setRacket(racket);
		
		PlayerB playerB = new PlayerB();
		playerB.setBall(ball);
		playerB.setRacket(racket);
		
		playerA.start();
		playerB.start();
		
	}

}