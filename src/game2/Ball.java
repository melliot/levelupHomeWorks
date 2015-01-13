package game2;

import java.awt.*;

public class Ball {
    int x = 0;
    int y = 0;
    int xa = 1;
    int ya = 1;
    static  int counter = 0;
    static int score = 0;
    private Game game;


    public Ball(Game game, int x, int y){
        this.x = x;
        this.y = y;
        this.game= game;
    }

    void move() {
        System.out.println(ya);
        if (x + xa < 0)
            xa = 1;
        if (x + xa > game.getWidth() - 30)
            xa = -1;
        if (y + ya < 0)
            ya = Math.abs(ya);
        if (y + ya > game.getHeight() - 30){
            game.gameOver();
        }
        if (collision()){
            score++;
            System.out.println("!@#$");
            ya = -ya;
            y = game.racquet.y - 30;
            counter++;
        }

        if(counter % 4 == 3){
            if(ya < 0){
                System.out.println("###");
                ya = ya - 1;
                System.out.println(ya);
                counter = 0;
            }
            if(ya > 0){
                System.out.println("%%%");
                ya = ya + 1;
                System.out.println(ya);
                counter = 0;
            }
        }
        System.out.println("!!!!");
        x = x + xa;
        y = y + ya;
    }
    public  static int getCounter(){
        return score;
    }
    private boolean collision() {
        return game.racquet.getBounds().intersects(getBounds());
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, 30, 30);
    }

    public void paint(Graphics2D g) {
        g.fillOval(x, y, 30, 30);
    }
}