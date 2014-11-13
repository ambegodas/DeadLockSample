/**
 * @autor pathmasri
 * Nov 14, 2014 1:14:18 AM
 */
package com.sample.deadlock;

public class PlayerB extends Thread {
	
	private Racket racket;
	private Ball ball;
	
	
	public void run(){
		synchronized (racket) {			
			System.out.println("Plauer B starts playing. Racket is aquired");
			try {
				System.out.println("Player B is waiting for the ball");
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (ball) {
				System.out.println("Yahoo... Player B is playing TT..");
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
