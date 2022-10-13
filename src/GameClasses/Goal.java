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
public class Goal extends GameObject {
    
    int points;
    
    public Goal(JButton _swingObject, Vector2 _moveCoords, int _points) {
        super(_swingObject, _moveCoords);
        
        this.points = _points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
