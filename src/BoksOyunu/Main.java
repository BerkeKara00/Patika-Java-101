
package BoksOyunu;

import BoksOyunu.Ring;
import BoksOyunu.Fighter;

public class Main {
    public static void main(String[] args) {
        
        Fighter f1 = new Fighter("A", 120, 100,30);
        Fighter f2 = new Fighter("B", 85, 85,40);
        
        Ring ring = new Ring(f1, f2, 85, 100);
        
        ring.run();
    }
    
}
