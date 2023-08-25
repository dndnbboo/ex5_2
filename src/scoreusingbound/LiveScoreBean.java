/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreusingbound;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// 64050075

/**
 *
 * @author User
 */
public class LiveScoreBean {
    
    private String someData;

    public static final String PROP_SOMEDATA = "someData";

    public String getSomeData() {
        return someData;
    }

    public void setScoreLine(String someData) {
        String oldSomeData = this.someData;
        this.someData = someData;
        propertyChangeSupport.firePropertyChange(PROP_SOMEDATA, oldSomeData, someData);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
