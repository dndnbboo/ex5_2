/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreusingbound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

// 64050075

/**
 *
 * @author User
 */
public class Subscriber implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        System.out.println("live result : " + evt.getNewValue());
    }
}
