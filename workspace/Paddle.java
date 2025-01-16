//
//  Class author: Nathania Dawit
//  Date created: 12/05/2024
//  General description: This class represents the paddle in the Brick Break game. The paddle can move 
//  horizontally and interact with the ball to reflect it.
//

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
    private int x;        // X-coordinate of the paddle
    private int y;        // Y-coordinate of the paddle
    private int width;    // Width of the paddle
    private int height;   // Height of the paddle
    private int velocity; // Current horizontal velocity of the paddle

    // 
    //  Constructor
    //  Pre-condition: Input values x, y, width, and height must be positive integers.
    //  Post-condition: Creates a paddle object with the specified position and dimensions.
    //
    public Paddle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.velocity = 0;
    }

    //
    //  Pre-condition: Graphics object must be valid.
    //  Post-condition: Draws the paddle at its current position on the screen.
    //
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);
    }

    //
    //  Pre-condition: None
    //  Post-condition: Moves the paddle horizontally based on its velocity.
    //
    public void move() {
        x += velocity;

        // Prevent paddle from moving out of bounds
        if (x < 0) x = 0;
        if (x + width > 692) x = 692 - width;
    }

    //
    //  Pre-condition: None
    //  Post-condition: Sets the paddle's horizontal velocity.
    //
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    //
    //  Pre-condition: None
    //  Post-condition: Returns the paddle's current velocity.
    //
    public int getVelocity() {
        return velocity;
    }

    //
    //  Pre-condition: None
    //  Post-condition: Increases or decreases the paddle's velocity by the specified value.
    //
    public void addVelocity(int value) {
        velocity += value;
        if (velocity >6) {
            velocity=6;
        }else if ( velocity < -6){
            velocity=-6;
        }
        }

    //
    //  Pre-condition: None
    //  Post-condition: Returns the paddle's current x-coordinate.
    //
    public int getX() {
        return x;
    }

    //
    //  Pre-condition: None
    //  Post-condition: Returns the paddle's current y-coordinate.
    //
    public int getY() {
        return y;
    }

    //
    //  Pre-condition: None
    //  Post-condition: Returns the paddle's width.
    //
    public int getWidth() {
        return width;
    }

    //
    //  Pre-condition: None
    //  Post-condition: Returns the paddle's height.
    //
    public int getHeight() {
        return height;
    }
    public void setX(int x) {
    this.x = x;
    }
}
