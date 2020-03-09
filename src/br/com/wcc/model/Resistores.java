package src.br.com.wcc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Resistores {

    Random ran = new Random(); 
    int nxt = ran.nextInt(10);
    
    ArrayList<Resistores> numberOfResistores;
    numberOfResistores = new ArrayList<Resistores>();
    numberOfResistores.add(nxt);
}