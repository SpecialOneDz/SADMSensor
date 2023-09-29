package jade;


import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.domain.introspection.ACLMessage;

/**
 *
 * @author cheka
 */

    public class Coord extends Agent {
    	private int step = 0;
  protected void setup() {
  	System.out.println("Hello World! My name is :"+getLocalName());
   	System.out.println("My Adress is :"+ getAID ( ) ) ;
   	
   	try {
		Thread.sleep(40000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   	
   	addBehaviour (new Behaviour (this) {

		@Override
		public void action() {
			
			// TODO Auto-generated method stub
			jade.lang.acl.ACLMessage msg = receive() ;
			println ("recu " + msg.getContent ( ) ) ;
			step++; 
		}

		@Override
		public boolean done() {
			// TODO Auto-generated method stub
			{return step >100;}
		}
   		
   		
   	});
  }
  
 // protected void takeDown(){
 //     System.out.println(" Agent " + getLocalName ( ) + " quitte la plateforme" ) ;
  // }

    public void println (String msg) {
      	System.out.println (this.getLocalName() + " :: " + msg ) ;
      	}
    }