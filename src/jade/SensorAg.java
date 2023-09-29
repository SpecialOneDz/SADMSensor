/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jade;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.WakerBehaviour;
import jade.lang.acl.ACLMessage;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author cheka
 */

    public class SensorAg extends Agent {

  protected void setup() {
 

  	System.out.println("Hello World! My name is :"+getLocalName());
   	System.out.println("My Adress is :"+ getAID ( ) ) ;
    try {
 			Thread.sleep(40000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
     	var debute = new WakerBehaviour (this , 5000) {
        public void onWake( ) {
        var msg = new ACLMessage(ACLMessage.INFORM) ;
        msg.setContent("data" ) ;
        msg.addReceiver (new AID("AgentReason1", AID.ISLOCALNAME) ) ;
        println("j�envoie data" );
       send ( msg ) ; }};
        
     addBehaviour (new Behaviour (this) {
    	 
            int i =0;
            public void action ( ) {
            	var msg = new ACLMessage(ACLMessage.INFORM) ;
            	
            	 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                 
            	
                msg.setContent("data" ) ;
                msg.addReceiver (new AID("AgentReason1", AID.ISLOCALNAME) ) ;
                println(timestamp + " : Sending new data" );
                
               
                
                send ( msg );
                i ++;
                }
              
            
            @Override
            public boolean done ( ) {return i >100;}
           } ) ;    
   	
   	
   	}; 
 
  
//  protected void takeDown(){
  //    System.out.println(" Agent " + getLocalName ( ) + " quitte la plateforme" ) ;
 // }
  
  
  public void println (String msg) {
  	System.out.println (this.getLocalName() + " :: " + msg ) ;
  	}
}
    

