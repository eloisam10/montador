package src.br.com.wcc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Semicondutor {

    Random ran = new Random(); 
    int nxt = ran.nextInt(10);
    
    ArrayList<Semicondutor> numberOfSemicondutor;
    numberOfSemicondutor = new ArrayList<Semicondutor>();
    numberOfSemicondutor.add(nxt);
}