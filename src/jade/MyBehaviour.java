/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jade;

import jade.core.behaviours.Behaviour;
import jade.domain.introspection.ACLMessage;

/**
 *
 * @author cheka
 */
public class MyBehaviour extends Behaviour {

    private int step = 0;
    @Override
    public void action() {
        switch (step)
        {   case 0 : task("step one"); step++;
            case 2 : task("step two"); step++;
            case 3 : task("step tree"); step++; }
    }

    @Override
    public boolean done() {
        
         {return step >= 3;}
         // boolean end=(step == 3) ; 
        // if (end)myAgent.doDelete( ); 
        // return end ; 
    }

    private void task(String s) {
        System.out.println(myAgent.getLocalName( )+" : " + s) ; 
    }
    
}
