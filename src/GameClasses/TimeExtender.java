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
public class TimeExtender extends GameObject {
    
    private final int timeIncrease;
    private final int maxCoolDown;
    private int currCoolDown;
    
    public TimeExtender(int _timeIncrease, int _coolDown, JButton _swingObject, Vector2 _moveCoords) {
        super(_swingObject, _moveCoords);
        
        _swingObject.setVisible(false);
        
        this.timeIncrease = _timeIncrease;
        this.maxCoolDown = _coolDown;
        this.currCoolDown = _coolDown;
    }
    
    public int getTimeIncrease() {
        return this.timeIncrease;
    }
    
    public void updateCoolDown(int dec_cd) {
        if (currCoolDown > 0) {
            currCoolDown -= dec_cd;
        }
    }
    
    public void resetCoolDown() {
        this.currCoolDown = this.maxCoolDown;
    }

    public boolean isAllowExtend() {
        return this.currCoolDown == 0;
    }
}
