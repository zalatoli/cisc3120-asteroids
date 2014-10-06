package cisc3120.asteroids;

import java.awt.*;


/**
 * Class which controls the game logic specific to Asteroids. Because it extends
 * <code>Game</code>, this automatically "redraws" itself every hundredth of a
 * second. Your work is in two main places: (1) the constructor, which should
 * create every object that you need at the beginning of the game (ships,
 * asteroids...), and (2) the <code>paint()</code> method, which should describe
 * how to paint the game each time the screen is refreshed. (Note: each object
 * in the game should know how to "paint itself"--much of the real game logic
 * will be in those paint methods, since that's when objects in the game will
 * "move.")
 * 
 * 
 * @author Scott Dexter
 *
 */
class Asteroids extends Game {

	// if you had a Ship class, you might want to have one in your Asteroids
	// class.
	// Ship ship;

	/**
	 * Populate the game. This 'skeleton' calls the <code>Game</code>
	 * constructor to set things up, and also defines a <code>Point</code> at
	 * the center of the game. You need to create the objects in the game. Make
	 * sure the last thing the constructor does is invoke <code>repaint()</code>
	 * .
	 */
	static final int WIDTH=800;
	static final int HEIGHT=600;

	public Asteroids() {
		super("Asteroids!", WIDTH, HEIGHT);
		Point center = new Point(WIDTH / 2, HEIGHT / 2);

		// if you had a ship object, you might create it this way
		// ship = new Ship(shipShape, center, 0.0, WIDTH, HEIGHT);

		repaint();
	}

	/**
	 * Paints the game. This 'skeleton' paints the screen black, then gets ready
	 * to draw in white. You need to tell it what else to pain.
	 * 
	 * @see java.awt.Canvas#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics brush) {
		brush.setColor(Color.black);
		brush.fillRect(0, 0, width, height);
		brush.setColor(Color.white);
		//----CODE BY ZALATOLI----//
		brush.drawLine(width/2, height/2, width/2, 50);

		// if you had a ship, you might paint it this way...
		// ship.paint(brush);

	}

	/**
	 * Aha: here's where everything gets started: simply by invoking the
	 * <code>Asteroids</code> constructor.
	 * 
	 * @param args
	 *            Unused.
	 */
	public static void main(String[] args) {
		new Asteroids();
	}
}
