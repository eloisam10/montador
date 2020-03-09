package src.br.com.wcc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Capacitores {

    Random ran = new Random(); 
    int nxt = ran.nextInt(10);
    
    ArrayList<Capacitores> numberOfCapacitores;
    numberOfCapacitores = new ArrayList<Capacitores>();
    numberOfCapacitores.add(nxt);
}
