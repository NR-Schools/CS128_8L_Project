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
public abstract class GameObject {
    protected JButton swingObject;
    protected Vector2 currMoveCoords;
    protected Vector2 defMoveCoords;
    
    public GameObject(JButton _swingObject, Vector2 _moveCoords) {
        this.swingObject = _swingObject;
        this.currMoveCoords = _moveCoords;
        this.defMoveCoords = _moveCoords;
    }

    public JButton getSwingObject() {
        return swingObject;
    }

    public void setSwingObject(JButton swingObject) {
        this.swingObject = swingObject;
    }

    public Vector2 getMoveCoords() {
        return currMoveCoords;
    }

    public void setMoveCoords(Vector2 moveCoords) {
        this.currMoveCoords = moveCoords;
    }
    
    public void ResetMoveCoords() {
        this.currMoveCoords = defMoveCoords;
    }
}
