/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameClasses;

import javax.swing.JButton;

/**
 *
 * @author hp
 */
public class Player extends GameObject {
    
    private int health;
    private int moveSpeed;
    private boolean allowMovement;
    
    public Player(int _health, JButton _swingObject, int _moveSpeed) {
        super(_swingObject, new Vector2(0, 0));
        
        this.health = _health;
        this.moveSpeed = _moveSpeed;
    }

    public int getHealth() {
        return health;
    }

    public void TakeDamage(int _damage) {
        this.health -= _damage;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
    
    public void SetLatestMoveCoords(Vector2 newCoords) {
        this.currMoveCoords = newCoords;
    }

    public boolean isAllowMovement() {
        return allowMovement;
    }

    public void setAllowMovement(boolean allowMovement) {
        this.allowMovement = allowMovement;
    }
}
