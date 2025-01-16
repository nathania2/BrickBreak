//
//  Class author: Nathania Dawit
//  Date created: 12/05/2024
//  General description: This class represents the ball in the Brick Break game. It manages the ball's 
//  position, velocity, and interactions with other game components.
//

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    private int x;        // X-coordinate of the ball
    private int y;        // Y-coordinate of the ball
    private int size;     // Diameter of the ball
    private int xVelocity; // Horizontal velocity
    private int yVelocity; // Vertical velocity

    // 
    //  Constructor
    //  Pre-condition: Input values x, y, and size must be positive integers.
    //  Post-condition: Creates a ball object with the specified position and size, and initializes velocity to 0.
    //
    public Ball(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xVelocity = 1;
        this.yVelocity = -2;
    }

    //
    //  Pre-condition: Graphics object must be valid.
    //  Post-condition: Draws the ball at its current position on the screen.
    //
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, size, size);
    }

    //
    //  Pre-condition: The ball must have valid velocity values.
    //  Post-condition: Updates the ball's position based on its velocity.
    //
    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    //
    //  Pre-condition: None
    //  Post-condition: Reverses the ball's horizontal velocity.
    //
    public void reverseX() {
        xVelocity = -xVelocity;
    }

    //
    //  Pre-condition: None
    //  Post-condition: Reverses the ball's vertical velocity.
    //
    public void reverseY() {
        yVelocity = -yVelocity;
    }

    //
    //  Pre-condition: None
    //  Post-condition: Returns the ball's current x-coordinate.
    //
    public int getXpos() {
        return x;
    }


    public void setX( int X) {
        x = X ;
    }

    public void setY (int Y) {
        y= Y;
    }
    //
    //  Pre-condition: None
    //  Post-condition: Returns the ball's current y-coordinate.
    //
    public int getYpos() {
        return y;
    }

    //
    //  Pre-condition: None
    //  Post-condition: Returns the ball's size (diameter).
    //
    public int getSize() {
        return size;
    }

    //
    //  Pre-condition: None
    //  Post-condition: Sets the ball's horizontal velocity.
    //
    public void setXVelocity(int velocity) {
        xVelocity = velocity;
    }

    //
    //  Pre-condition: None
    //  Post-condition: Sets the ball's vertical velocity.
    //
    public void setYVelocity(int velocity) {
        yVelocity = velocity;
    }
}
