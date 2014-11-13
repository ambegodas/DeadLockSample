/**
 * @autor pathmasri
 * Nov 14, 2014 1:13:53 AM
 */
package com.sample.deadlock;

public class PlayerA extends Thread {
	
	private Racket racket;
	private Ball ball;
	
	
	public void run(){
		synchronized (ball) {			
			System.out.println("Plauer A starts playing. Ball is aquired");
			try {
				System.out.println("Plauer A is waiting for the racket");
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (racket) {
				System.out.println("Yahoo... Player A is playing TT..");
			}
		}
		
	}
	
	/**
	 * @return the racket
	 */
	public Racket getRacket() {
		return racket;
	}

	/**
	 * @param racket the racket to set
	 */
	public void setRacket(Racket racket) {
		this.racket = racket;
	}

	/**
	 * @return the ball
	 */
	public Ball getBall() {
		return ball;
	}

	/**
	 * @param ball the ball to set
	 */
	public void setBall(Ball ball) {
		this.ball = ball;
	}




}
