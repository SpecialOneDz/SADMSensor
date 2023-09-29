package jade;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.WakerBehaviour;
import jade.lang.acl.*;
import jade.core.AID;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgentPP extends Agent{
    
String name ;

    protected void setup( ) {
        name = getLocalName ( );
        System.out.println (" Agent " + name + " est pret!" ) ;
        
        try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if (name.equals ("AgentReason1" ) ) {
        //lancement de la partie dans 15 secondes
            var debute = new WakerBehaviour (this , 5000) {
                public void onWake( ) {
                	
                var msg = new ACLMessage(ACLMessage.INFORM) ;
                msg.setContent("Reason" ) ;
                msg.addReceiver (new AID("AgentReason2", AID.ISLOCALNAME) ) ;
                println("Send the first solution" );
                send ( msg ) ; } } ;
            addBehaviour(debute) ;
        }
        
        addBehaviour (new Behaviour (this) {
      
            int i =0;
            public void action ( ) {
                ACLMessage msg = receive() ;
                if( msg != null ) {
                if ( msg.equals("Reason") ) {
                println ("recu " + msg.getContent ( ) ) ;
                ACLMessage retour = msg.createReply ( ) ;
                retour.setContent ("Reason") ;
                send (retour) ;
                i ++;
                }
            
          //      if (i==10 || i==20 || i==30 || i==40) {
           //     	var msg2 = new ACLMessage(ACLMessage.INFORM) ;
                   // msg2.setContent("data" ) ;
                  //  msg2.addReceiver (new AID("AgentCoordination", AID.ISLOCALNAME) ) ;
                 //   println("j�envoie decision" );
               //     send ( msg2 );
             //   }
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                println (timestamp + " : " + msg.getContent ( ) + " recieved !" ) ;
                }
                block( ) ; }
              
            
            @Override
             public boolean done ( ) {return i >1000;}
           } ) ;
    }
        public void println (String msg) {
        	System.out.println (this.getLocalName() + " :: " + msg ) ;
        	}

}