/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JButton;

/**
 *
 * @author hp
 */
public class Wall {
    private final JButton wallObj;
    private final Coords defCoords;
    private Coords coords;
    
    public Wall(JButton _wallObj, Coords _coords) {
        this.wallObj = _wallObj;
        this.coords = _coords;
        this.defCoords = _coords;
    }

    public JButton getWallObj() {
        return wallObj;
    }

    public Coords getCoords() {
        return coords;
    }
    
    public void setCoords(Coords _coords) {
        this.coords = _coords;
    }
    
    public void ResetMoveCoords() {
        this.coords = defCoords;
    }
}
