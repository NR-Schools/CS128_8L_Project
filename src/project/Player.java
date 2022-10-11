/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author hp
 */
public class Player {
    private int health;
    private int currMovSpd;
    private boolean allowMovement;
    
    private Coords dirLastMoved;
    
    public Player(int _health, int _defMovSpd)
    {
        this.health = _health;
        this.currMovSpd = _defMovSpd;
        this.allowMovement = true;
    }
    
    public void RegenHealth(int amt) {
        this.health += amt;
    }
    
    public void TakeDamage(int amt) {
        this.health -= amt;
    }
    
    public int getHealth() {
        return health;
    }

    public boolean isAllowMovement() {
        return allowMovement;
    }

    public void setAllowMovement(boolean allowMovement) {
        this.allowMovement = allowMovement;
    }

    public void IncMovSpd(int amt) {
        this.currMovSpd += amt;
    }
    
    public int getCurrMovSpd() {
        return this.currMovSpd;
    }

    public Coords getDirLastMoved() {
        return dirLastMoved;
    }

    public void setDirLastMoved(Coords dirLastMoved) {
        this.dirLastMoved = dirLastMoved;
    }
}
