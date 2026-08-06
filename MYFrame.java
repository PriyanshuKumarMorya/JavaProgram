package AWTAdvanced;

import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class MYFrame extends Frame implements ActionListener {

    // Man and parameter of the jumping,run,x-axis of the man.
    int x = 50;
    int startX = 50;
    int manX = 50;
    int manY = 100;
    int groundY = 100;
    boolean isJumping = false;
    int manVelocity = 0;      // vertical velocity
    int jumpSpeed = -20;      // jump upward speed
    int gravity = 2;          // falling speed

    // Bus
    int busX = 300;
    int busY = 180;
    boolean moveBus = false;
    int busSpeed = 8;


    Label scoreLabel;
    //Define the button  names used this .
    Button startBtn, jumpBtn, resetBtn, settingBtn,ForwardBtn;
    int score = 0;

    Timer timer;

    public MYFrame() {

        setTitle("Man & Bus Game");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setBackground(Color.GREEN);

        settingBtn = new Button("Setting");
        settingBtn.setBounds(5,10,50,60);
        jumpBtn = new Button("JUMP"); // jump
        resetBtn = new Button("Reset");
        startBtn = new Button("Start");
        ForwardBtn = new Button("Forward");
        ForwardBtn.setBounds(250,50,60,50);

        scoreLabel = new Label("Score: 0");
        scoreLabel.setBackground(Color.CYAN);

        //all Button adding
        add(settingBtn);
        add(jumpBtn);
        add(resetBtn);
        add(startBtn);
        add(scoreLabel);
        add(ForwardBtn);

        settingBtn.addActionListener(this);
        jumpBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        startBtn.addActionListener(this);
        ForwardBtn.addActionListener(this);

        startGameLoop();

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    void startGameLoop() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                // Move bus
                if (moveBus) {
                    busX -= busSpeed;
                    if (busX < -60) {
                        busX = getWidth();
                        score++;
                        scoreLabel.setText("Score: " + score);
                    }
                }

                // Jumping the logical
                if (isJumping) {
                    manY += manVelocity;
                    manVelocity += gravity;

                    if (manY >= groundY) {
                        manY = groundY;
                        isJumping = false;
                        manVelocity = 0;
                    }
                }


                Rectangle man = new Rectangle(manX, manY, 30, 120);
                Rectangle bus = new Rectangle(busX, busY, 60, 30);

                if (man.intersects(bus)) {
                    resetGame();
                }

                repaint();
            }
        }, 0, 30);
    }

    void resetGame() {
        manX = 50;
        manY = groundY;
        isJumping = false;
        manVelocity = 0;
        busX = getWidth();
        moveBus = false;
        score = 0;
        scoreLabel.setText("Score: 0");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == startBtn) {
            moveBus = true;

        }
        else if (e.getSource() == jumpBtn) {
            if (!isJumping) {
                isJumping = true;
                manVelocity = jumpSpeed;
            }
        }
        else if (e.getSource() == resetBtn) {
            resetGame();
        } else if (e.getSource() == ForwardBtn ) {
            x += 15;
            if (x > getWidth()) x = startX;
        }

        else if (e.getSource() == settingBtn) {
            new SettingWindow(this);
            dispose();

        }
    }

    @Override
    public void paint(Graphics g) {

        // Ground
        g.drawLine(0, 220, getWidth(), 220);

        // Man
        g.setColor(Color.BLACK);
        g.drawOval(manX, manY, 30, 30);
        g.drawLine(manX + 15, manY + 30, manX + 15, manY + 80);
        g.drawLine(manX, manY + 50, manX + 30, manY + 50);
        g.drawLine(manX + 15, manY + 80, manX, manY + 120);
        g.drawLine(manX + 15, manY + 80, manX + 30, manY + 120);

        // Bus
        g.setColor(Color.RED);
        g.fillRect(busX, busY, 60, 30);
        g.setColor(Color.BLACK);
        g.fillOval(busX + 5, busY + 25, 10, 10);
        g.fillOval(busX + 40, busY + 25, 10, 10);
    }

    public static void main(String[] args) {
        new MYFrame();
    }
}


class SettingWindow extends Frame implements ActionListener {

    Button backBtn, featuresBtn;
    Label speedLabel, highScoreLabel, timeLabel, jumpLabel;
    int manWidth = 30, manHeight = 120;

    // Cons.
    public SettingWindow(MYFrame parent) {

        //SettingWindow Frame Size and Background color
        setTitle("Settings");
        setSize(300, 300);
        setLayout(null);
        setBackground(Color. YELLOW);

        // Buttons
        int btnWidth = 60;
        int btnHeight = 30;
        int frameWidth = 300;
        int xPos = frameWidth - btnWidth - 5;
        int yPos = 23;
        int wPos = frameWidth - 60 - 70;
        backBtn = new Button("Back");
        backBtn.setBounds(xPos, yPos, btnWidth, btnHeight);
        backBtn.addActionListener(this);

        featuresBtn = new Button("Features");
        featuresBtn.setBounds( wPos, 23, 60, 30);
        featuresBtn.addActionListener(this);

        add(backBtn);
        add(featuresBtn);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                //dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backBtn) {
            dispose();
            new MYFrame();
        } else if (e.getSource() == featuresBtn) {
            // Create Labels for features
            speedLabel = new Label("Speed: 15 px/move");
            highScoreLabel = new Label("High Score: 120");
            timeLabel = new Label("Time: 2 min 30 sec");
            jumpLabel = new Label("Jump Height: 50 px");

            // Position labels
            speedLabel.setBounds(7, 60, 120, 25);
            highScoreLabel.setBounds(175, 60, 120, 25);
            timeLabel.setBounds(7, 230, 130, 30);
            jumpLabel.setBounds(170, 230, 170, 30);


            //Background color
            speedLabel.setBackground(Color.red);
            highScoreLabel.setBackground(Color.CYAN);
            timeLabel.setBackground(Color.CYAN);
            jumpLabel.setBackground(Color.RED);

            remove(speedLabel);
            remove(highScoreLabel);
            remove(timeLabel);
            remove(jumpLabel);

            add(speedLabel);
            add(highScoreLabel);
            add(timeLabel);
            add(jumpLabel);

            repaint();


        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Draw man in center
        int x = (getWidth() - manWidth) / 2;
        int y = (getHeight() - manHeight) / 2;

        g.drawOval(x, y, 30, 30);                  // head
        g.drawLine(x + 15, y + 30, x + 15, y + 80); // body
        g.drawLine(x, y + 50, x + 30, y + 50);     // arms
        g.drawLine(x + 15, y + 80, x, y + 120);    // left leg
        g.drawLine(x + 15, y + 80, x + 30, y + 120); // right leg
    }
}



