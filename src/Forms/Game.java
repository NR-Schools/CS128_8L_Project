/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Callbacks.IGameCallback;
import GameClasses.Vector2;
import GameClasses.Enemy;
import GameClasses.GameObject;
import GameClasses.Goal;
import GameClasses.Player;
import GameClasses.Wall;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author hp
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    
    private IGameCallback callback;
    
    private Player player;
    private Goal dGoal, sGoal;
    private ArrayList<Wall> walls;
    private ArrayList<Enemy> enemies;
    
    private int DefDuration; // In Seconds
    private int CurrDuration; // In Seconds
    
    private int Points;
    
    private Vector2 EDGE;
    
    private Timer gameTimer, gameObjTimer;
    
    private int timeSec;
    
    public Game(int _duration) {
        initComponents();
        
        // Set Layout to Null to resolve revalidate() invoking layout manager and resetting positions
        this.setLayout(null);
        
        UI_Pane.setPosition(this, 10);
        
        // Set Game Params
        this.DefDuration = _duration;
        this.CurrDuration = _duration;
        this.Points = 0;
        
        EDGE = new Vector2(
            this.getSize().width - 40,
            this.getSize().height - 95
        );
        
        // Initialize Components
        InitializeGameComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WallObj1 = new javax.swing.JButton();
        WallObj2 = new javax.swing.JButton();
        WallObj3 = new javax.swing.JButton();
        WallObj4 = new javax.swing.JButton();
        WallObj5 = new javax.swing.JButton();
        WallObj6 = new javax.swing.JButton();
        WallObj7 = new javax.swing.JButton();
        WallObj8 = new javax.swing.JButton();
        EnemyObj1 = new javax.swing.JButton();
        EnemyObj2 = new javax.swing.JButton();
        EnemyObj3 = new javax.swing.JButton();
        EnemyObj4 = new javax.swing.JButton();
        PlayerObj = new javax.swing.JButton();
        dGoalObj = new javax.swing.JButton();
        UI_Pane = new javax.swing.JLayeredPane();
        UI_Time = new javax.swing.JLabel();
        UI_Health = new javax.swing.JLabel();
        UI_Points = new javax.swing.JLabel();
        sGoalObj = new javax.swing.JButton();
        GameMenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        EndGameMenuItem = new javax.swing.JMenuItem();
        GameMenu = new javax.swing.JMenu();
        s20TimerMenuItem = new javax.swing.JMenuItem();
        s40TimerMenuItem = new javax.swing.JMenuItem();
        s60TimerMenuItem = new javax.swing.JMenuItem();
        HelpMenu = new javax.swing.JMenu();
        GameHelpMenuItem = new javax.swing.JMenuItem();
        VersionMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(580, 510));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        WallObj1.setBackground(new java.awt.Color(153, 153, 153));
        WallObj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/wall.png"))); // NOI18N

        WallObj2.setBackground(new java.awt.Color(153, 153, 153));
        WallObj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/wall.png"))); // NOI18N

        WallObj3.setBackground(new java.awt.Color(153, 153, 153));
        WallObj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/wall.png"))); // NOI18N

        WallObj4.setBackground(new java.awt.Color(153, 153, 153));
        WallObj4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/wall.png"))); // NOI18N

        WallObj5.setBackground(new java.awt.Color(153, 153, 153));
        WallObj5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/wall.png"))); // NOI18N

        WallObj6.setBackground(new java.awt.Color(153, 153, 153));
        WallObj6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/wall.png"))); // NOI18N

        WallObj7.setBackground(new java.awt.Color(153, 153, 153));
        WallObj7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/wall.png"))); // NOI18N

        WallObj8.setBackground(new java.awt.Color(153, 153, 153));
        WallObj8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/wall.png"))); // NOI18N

        EnemyObj1.setBackground(new java.awt.Color(255, 0, 51));

        EnemyObj2.setBackground(new java.awt.Color(255, 0, 51));

        EnemyObj3.setBackground(new java.awt.Color(255, 0, 51));

        EnemyObj4.setBackground(new java.awt.Color(255, 0, 51));

        PlayerObj.setBackground(new java.awt.Color(0, 204, 255));
        PlayerObj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PlayerObjKeyPressed(evt);
            }
        });

        dGoalObj.setBackground(new java.awt.Color(0, 255, 0));

        UI_Time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UI_Time.setText("Remaining Time: 20s");

        UI_Health.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UI_Health.setText("Health: 10");

        UI_Points.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UI_Points.setText("Points: 0");

        UI_Pane.setLayer(UI_Time, javax.swing.JLayeredPane.DEFAULT_LAYER);
        UI_Pane.setLayer(UI_Health, javax.swing.JLayeredPane.DEFAULT_LAYER);
        UI_Pane.setLayer(UI_Points, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout UI_PaneLayout = new javax.swing.GroupLayout(UI_Pane);
        UI_Pane.setLayout(UI_PaneLayout);
        UI_PaneLayout.setHorizontalGroup(
            UI_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UI_PaneLayout.createSequentialGroup()
                .addGroup(UI_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UI_Health)
                    .addComponent(UI_Points)
                    .addComponent(UI_Time))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        UI_PaneLayout.setVerticalGroup(
            UI_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UI_PaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(UI_Time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UI_Health)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UI_Points)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        sGoalObj.setBackground(new java.awt.Color(0, 255, 204));

        FileMenu.setText("File");

        EndGameMenuItem.setText("End Game");
        EndGameMenuItem.setToolTipText("");
        EndGameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndGameMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(EndGameMenuItem);

        GameMenuBar.add(FileMenu);

        GameMenu.setText("Game");

        s20TimerMenuItem.setText("20 second Timer");
        s20TimerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s20TimerMenuItemActionPerformed(evt);
            }
        });
        GameMenu.add(s20TimerMenuItem);

        s40TimerMenuItem.setText("40 second Timer");
        s40TimerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s40TimerMenuItemActionPerformed(evt);
            }
        });
        GameMenu.add(s40TimerMenuItem);

        s60TimerMenuItem.setText("60 second Timer");
        s60TimerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s60TimerMenuItemActionPerformed(evt);
            }
        });
        GameMenu.add(s60TimerMenuItem);

        GameMenuBar.add(GameMenu);

        HelpMenu.setText("Help");

        GameHelpMenuItem.setText("Game Help");
        GameHelpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameHelpMenuItemActionPerformed(evt);
            }
        });
        HelpMenu.add(GameHelpMenuItem);

        VersionMenuItem.setText("Version");
        VersionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VersionMenuItemActionPerformed(evt);
            }
        });
        HelpMenu.add(VersionMenuItem);

        GameMenuBar.add(HelpMenu);

        setJMenuBar(GameMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(EnemyObj2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(WallObj2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(WallObj5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(EnemyObj1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(WallObj7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(sGoalObj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WallObj3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(EnemyObj4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(WallObj6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(EnemyObj3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(WallObj8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(dGoalObj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(UI_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(WallObj4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PlayerObj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(WallObj1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(WallObj8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(WallObj1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(WallObj6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WallObj3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnemyObj4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(WallObj4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(EnemyObj1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UI_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WallObj5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(EnemyObj3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PlayerObj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EnemyObj2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112))
                            .addComponent(WallObj2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dGoalObj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sGoalObj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(WallObj7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EndGameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndGameMenuItemActionPerformed
        // TODO add your handling code here:

        GameEnd();
    }//GEN-LAST:event_EndGameMenuItemActionPerformed

    private void s20TimerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s20TimerMenuItemActionPerformed
        // TODO add your handling code here:

        // Relaunch App with new settings
        StopAllTimers();
        callback.RestartGame(20);
    }//GEN-LAST:event_s20TimerMenuItemActionPerformed

    private void s40TimerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s40TimerMenuItemActionPerformed
        // TODO add your handling code here:

        // Relaunch App with new settings
        StopAllTimers();
        callback.RestartGame(40);
    }//GEN-LAST:event_s40TimerMenuItemActionPerformed

    private void s60TimerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s60TimerMenuItemActionPerformed
        // TODO add your handling code here:

        // Relaunch App with new settings
        StopAllTimers();
        callback.RestartGame(60);
    }//GEN-LAST:event_s60TimerMenuItemActionPerformed

    private void GameHelpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameHelpMenuItemActionPerformed
        // TODO add your handling code here:
        String helpStr = "";

        helpStr += " This is A Game \n\n";
        helpStr += " Use Arrow Keys To Move \n";
        helpStr += " Hover Mouse To Moving Wall to Make it Stop \n";
        helpStr += " Touch the Green Button To Earn Points \n";

        JOptionPane.showMessageDialog(rootPane, helpStr);
    }//GEN-LAST:event_GameHelpMenuItemActionPerformed

    private void VersionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VersionMenuItemActionPerformed
        // TODO add your handling code here:
        String verStr = "A Game v1.0.0";
        JOptionPane.showMessageDialog(rootPane, verStr);
    }//GEN-LAST:event_VersionMenuItemActionPerformed

    private void PlayerObjKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlayerObjKeyPressed
        // TODO add your handling code here:

        //if (!player.isAllowMovement()) return;
        
        int keyCode = evt.getKeyCode();
        int movSpd = player.getMoveSpeed();

        int x = player.getSwingObject().getLocation().x;
        int y = player.getSwingObject().getLocation().y;

        switch (keyCode) {
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                y -= movSpd;
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                y += movSpd;
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                x -= movSpd;
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                x += movSpd;
                break;
            default:
                break;
        }

        player.SetLatestMoveCoords(new Vector2(
                player.getSwingObject().getLocation().x - x,
                player.getSwingObject().getLocation().y - y
            )
        );

        player.getSwingObject().setLocation(x, y);

        // Check For Collisions
        ScreenEdgeCollision(player);
    }//GEN-LAST:event_PlayerObjKeyPressed

    private void InitializeGameComponents() {
        // ** Players ** //
        player = new Player(10, PlayerObj, 5);
        dGoal = new Goal(dGoalObj, new Vector2(0, 0), 5);
        sGoal = new Goal(sGoalObj, new Vector2(0, 0), 8);
        
        walls = new ArrayList<>(Arrays.asList(
                new Wall(WallObj1, new Vector2(0, -5)),
                new Wall(WallObj2, new Vector2(0, 5)),
                new Wall(WallObj3, new Vector2(5, 0)),
                new Wall(WallObj4, new Vector2(5, 0)),
                new Wall(WallObj5, new Vector2(0, 5)),
                new Wall(WallObj6, new Vector2(0, 5)),
                new Wall(WallObj7, new Vector2(-5, 0)),
                new Wall(WallObj8, new Vector2(5, 0))
        ));
        
        for (Wall wall : walls) {
            wall.getSwingObject().addMouseListener(GetNewMouseListener(wall));
        }
        
        enemies = new ArrayList<>(Arrays.asList(
                new Enemy(1,EnemyObj1, new Vector2(0, 5)),
                new Enemy(1, EnemyObj2, new Vector2(-5, 0)),
                new Enemy(1, EnemyObj3, new Vector2(0, -5)),
                new Enemy(1, EnemyObj4, new Vector2(5, 0))
        ));
        
        for (Enemy enemy : enemies) {
            enemy.getSwingObject().addMouseListener(GetNewMouseListener(enemy));
        }
        
        
        // ** Initialize+Run-Timers ** //
        InitializeTimers();
    }
    
    private void InitializeTimers() {
        gameTimer = new Timer();
        gameTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                timeSec += 1;
                UpdateUI();
                
                // Check if Game is "Done"
                if (timeSec == CurrDuration) GameEnd();
                
                // Update Move Vector of Walls
                if (timeSec % 2 == 0) {
                    for (Wall wall : walls) {
                        wall.getMoveCoords().x *= -1;
                        wall.getMoveCoords().y *= -1;
                    }
                }
                
                // Choose New Move Direction for sGoal every 1 seconds
                if (timeSec % 1 == 0) {
                    int r = new Random().nextInt(8);
                    
                    int speed = 5;
                    
                    switch(r) {
                        case 0:
                            sGoal.setMoveCoords(new Vector2(0, -speed));
                            break;
                        case 1:
                            sGoal.setMoveCoords(new Vector2(speed, 0));
                            break;
                        case 2:
                            sGoal.setMoveCoords(new Vector2(-speed, 0));
                            break;
                        case 3:
                            sGoal.setMoveCoords(new Vector2(speed, 0));
                            break;
                        case 4:
                            sGoal.setMoveCoords(new Vector2(-speed, -speed));
                            break;
                        case 5:
                            sGoal.setMoveCoords(new Vector2(-speed, speed));
                            break;
                        case 6:
                            sGoal.setMoveCoords(new Vector2(speed, -speed));
                            break;
                        case 7:
                            sGoal.setMoveCoords(new Vector2(speed, speed));
                            break;
                    }
                }
            }
        }, 0, 1000);
        
        gameObjTimer = new Timer();
        gameObjTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                for (Wall wall : walls) {
                    wall.getSwingObject().setLocation(
                        wall.getSwingObject().getLocation().x + wall.getMoveCoords().x,
                        wall.getSwingObject().getLocation().y + wall.getMoveCoords().y
                    );

                    ScreenEdgeCollision(wall);
                    WallCollisions(wall);
                }

                for (Enemy enemy : enemies) {
                    enemy.getSwingObject().setLocation(
                        enemy.getSwingObject().getLocation().x + enemy.getMoveCoords().x,
                        enemy.getSwingObject().getLocation().y + enemy.getMoveCoords().y
                    );

                    ScreenEdgeCollision(enemy);
                    EnemyCollisions(enemy);
                }
                
                // Update sGoal
                sGoal.getSwingObject().setLocation(
                        sGoal.getSwingObject().getLocation().x + sGoal.getMoveCoords().x,
                        sGoal.getSwingObject().getLocation().y + sGoal.getMoveCoords().y
                );
                ScreenEdgeCollision(sGoal);
                GoalCollisions(dGoal);
                GoalCollisions(sGoal);
            }
        }, 0, 100);
    }
    
    private void StopAllTimers() {
        // Just To Be Sure :)
        gameTimer.cancel();
        gameObjTimer.cancel();
    }
    
    private void GameEnd() {
        StopAllTimers();
        
        callback.GameFinished(this.DefDuration, Points);
    }
    
    // =========================================================================
    
    private void ScreenEdgeCollision(GameObject obj) {
        if (obj.getSwingObject().getBounds().getMinX() < 0) {
            obj.getSwingObject().setLocation(
                    EDGE.x,
                    obj.getSwingObject().getLocation().y
            );
        }
        
        if (obj.getSwingObject().getBounds().getMaxX() > this.getSize().width) {
            obj.getSwingObject().setLocation(
                    5,
                    obj.getSwingObject().getLocation().y
            );
        }
        
        if (obj.getSwingObject().getBounds().getMaxY() < 5) {
            obj.getSwingObject().setLocation(
                    obj.getSwingObject().getLocation().x,
                    EDGE.y
            );
        }
        
        if (obj.getSwingObject().getBounds().getMinY() > this.getSize().height-90) {
            obj.getSwingObject().setLocation(
                    obj.getSwingObject().getLocation().x,
                    2
            );
        }
    }
    
    private void GoalCollisions(Goal goal) {
        if (player.getSwingObject().getBounds().intersects(goal.getSwingObject().getBounds())) {
            // Add Points To Player
            Points += goal.getPoints();
            UpdateUI();
            
            // Select Random Coord within Frame
            goal.getSwingObject().setLocation(
                    new Random().nextInt(EDGE.x),
                    new Random().nextInt(EDGE.y)
            );
        }
    }
    
    private void EnemyCollisions(Enemy enemy) {
        while (PlayerObj.getBounds().intersects(enemy.getSwingObject().getBounds())) {
            // Damage Player
            player.TakeDamage(
                enemy.getDamage()
            );
            UpdateUI();
            
            // If Player Health <= 0, END GAME
            if (player.getHealth() <= 0) GameEnd();
            
            // Randomized Player Location
            PlayerObj.setLocation(
                    new Random().nextInt(this.getSize().width-50),
                    new Random().nextInt(this.getSize().height-100)
            );
        }
    }
    
    private void WallCollisions(Wall wall) {
        while (player.getSwingObject().getBounds().intersects(wall.getSwingObject().getBounds())) {
            // Undo Last Move
            // "Glitches" Player
            player.getSwingObject().setLocation(
                player.getSwingObject().getLocation().x + wall.getMoveCoords().x,
                player.getSwingObject().getLocation().y + wall.getMoveCoords().y
            );
        }
    }
    
    private void UpdateUI() {
        UI_Time.setText(
                "Remaining Time: " +
                Integer.toString(CurrDuration-timeSec) +
                "s"
        );
        
        UI_Health.setText(
                "Health: " +
                Integer.toString(player.getHealth())
        );
        
        UI_Points.setText(
                "Points: " +
                Integer.toString(Points)
        );
    }
    
    // =========================================================================
    
    private MouseListener GetNewMouseListener(GameObject obj) {
        return new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    //
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    obj.setMoveCoords(new Vector2(0, 0));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    obj.ResetMoveCoords();
                }
            };
    }
    
    // =========================================================================
    
    public void SetCallback(IGameCallback _callback) {
        this.callback = _callback;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EndGameMenuItem;
    private javax.swing.JButton EnemyObj1;
    private javax.swing.JButton EnemyObj2;
    private javax.swing.JButton EnemyObj3;
    private javax.swing.JButton EnemyObj4;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuItem GameHelpMenuItem;
    private javax.swing.JMenu GameMenu;
    private javax.swing.JMenuBar GameMenuBar;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JButton PlayerObj;
    private javax.swing.JLabel UI_Health;
    private javax.swing.JLayeredPane UI_Pane;
    private javax.swing.JLabel UI_Points;
    private javax.swing.JLabel UI_Time;
    private javax.swing.JMenuItem VersionMenuItem;
    private javax.swing.JButton WallObj1;
    private javax.swing.JButton WallObj2;
    private javax.swing.JButton WallObj3;
    private javax.swing.JButton WallObj4;
    private javax.swing.JButton WallObj5;
    private javax.swing.JButton WallObj6;
    private javax.swing.JButton WallObj7;
    private javax.swing.JButton WallObj8;
    private javax.swing.JButton dGoalObj;
    private javax.swing.JMenuItem s20TimerMenuItem;
    private javax.swing.JMenuItem s40TimerMenuItem;
    private javax.swing.JMenuItem s60TimerMenuItem;
    private javax.swing.JButton sGoalObj;
    // End of variables declaration//GEN-END:variables
}
