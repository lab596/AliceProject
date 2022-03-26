
public void Person4GoalieDive() {    
  doTogether( () -> {    
    this.teenPerson4.getLeftKnee().turn( TurnDirection.FORWARD, 0.25, Turn.duration( 2.0 ) ); 
  }, () -> {     
    this.teenPerson4.getRightKnee().turn( TurnDirection.FORWARD, 0.25, Turn.duration( 2.0 ) );  
  }, () -> {   
    this.teenPerson4.getLeftHip().turn( TurnDirection.BACKWARD, 0.25, Turn.duration( 2.0 ) );  
  }, () -> {     
    this.teenPerson4.getRightHip().turn( TurnDirection.BACKWARD, 0.25, Turn.duration( 2.0 ) );   
  }, () -> {    
    this.teenPerson4.move( MoveDirection.DOWN, 0.5, Move.duration( 2.0 ) );   
  }, () -> {     
    this.soccerBall.move( MoveDirection.FORWARD, 2.0, Move.duration( 1.0 ) );  
  } );  
  doTogether( () -> {     
    this.teenPerson4.move( MoveDirection.UP, 0.5, Move.duration( 2.0 ) );  
  }, () -> {     
    this.teenPerson4.getLeftKnee().turn( TurnDirection.BACKWARD, 0.25, Turn.duration( 2.0 ) ); 
  }, () -> {      
    this.teenPerson4.getRightKnee().turn( TurnDirection.BACKWARD, 0.25, Turn.duration( 2.0 ) );    
  }, () -> {     
    this.teenPerson4.getLeftHip().turn( TurnDirection.FORWARD, 0.25, Turn.duration( 2.0 ) ); 
  }, () -> {  
    this.teenPerson4.getRightHip().turn( TurnDirection.FORWARD, 0.25, Turn.duration( 2.0 ) );   
  }, () -> {       
    this.teenPerson4.getRightShoulder().turn( TurnDirection.LEFT, 0.5, Turn.duration( 2.0 ) );  
  }, () -> {       
    this.teenPerson4.getLeftShoulder().turn( TurnDirection.RIGHT, 0.5, Turn.duration( 2.0 ) );  
  }, () -> {       
    this.teenPerson4.delay( 1.0 );    
    this.teenPerson4.roll( RollDirection.RIGHT, 0.125, Roll.duration( 2.0 ) );  
  }, () -> {      
    this.soccerBall.move( MoveDirection.FORWARD, 0.5, Move.duration( 2.0 ) );  
  } );    
  doTogether( () -> {     
    this.soccerBall.move( MoveDirection.FORWARD, 6.0 ); 
  }, () -> {        
    this.soccerBall.move( MoveDirection.UP, 0.25 );  
  } );    
  doTogether( () -> {     
    this.soccerBall.move( MoveDirection.DOWN, 1.25 );     
  }, () -> {     
    this.teenPerson4.roll( RollDirection.RIGHT, 0.1 );   
  } ); 
}
 
  
