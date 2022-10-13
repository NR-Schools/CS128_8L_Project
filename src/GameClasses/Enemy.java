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
public class Enemy extends GameObject {
    
    int damage;
    
    public Enemy(int _damage, JButton _swingObject, Vector2 _moveCoords) {
        super(_swingObject, _moveCoords);
        
        this.damage = _damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
