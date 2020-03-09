package src.br.com.wcc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Conectores {

    Random ran = new Random(); 
    int nxt = ran.nextInt(10);
    
    ArrayList<Conectores> numberOfConectores;
    numberOfConectores = new ArrayList<Conectores>();
    numberOfConectores.add(nxt);
}