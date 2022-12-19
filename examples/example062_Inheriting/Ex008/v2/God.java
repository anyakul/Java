package examples.example062_Inheriting.Ex008.v2;

import examples.example062_Inheriting.Ex008.v2.Healers.Healer;
import examples.example062_Inheriting.Ex008.v2.Warriors.Warrior;

public class God extends Hero implements Healer, Warrior {

    @Override
    public void attack(Hero target) {
        
    }

    @Override
    public void healing(Hero target) {
        
    }
}

