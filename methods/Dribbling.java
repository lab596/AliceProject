
public void Dribbling() {  
  doTogether( () -> {   
    this.teenPerson5.getRightHip().turn( TurnDirection.BACKWARD, 0.125 );   
  }, () -> {      
    this.teenPerson5.getRightAnkle().turn( TurnDirection.FORWARD, 0.125 );  
  } );   
  doTogether( () -> {    
    this.soccerBall.move( MoveDirection.BACKWARD, 3.0 );   
  }, () -> {     
    this.teenPerson5.straightenOutJoints();  
  } ); 
  for( Integer indexA = 0; indexA < 1; indexA++ ) {      
    doTogether( () -> {    
      this.teenPerson5.getRightHip().turn( TurnDirection.BACKWARD, 0.125 );  
    }, () -> {       
      this.teenPerson5.getRightKnee().turn( TurnDirection.FORWARD, 0.05 );    
    }, () -> {       
      this.teenPerson5.getLeftHip().turn( TurnDirection.FORWARD, 0.125 );  
    } );     
    doTogether( () -> {     
      this.teenPerson5.getRightHip().turn( TurnDirection.FORWARD, 0.125 );     
    }, () -> {      
      this.teenPerson5.getRightKnee().turn( TurnDirection.BACKWARD, 0.05 );   
    }, () -> {       
      this.teenPerson5.getLeftHip().turn( TurnDirection.BACKWARD, 0.125 );      
    }, () -> {      
      this.teenPerson5.move( MoveDirection.FORWARD, 3.0 );      
    } ); 
  }  
}
 
  
