
public void First2BoysRun2Ball() {    
  doTogether( () -> {    
    this.teenPerson6.turn( TurnDirection.RIGHT, 0.5 ); 
  }, () -> {      
    this.teenPerson5.Run();   
  }, () -> {        
    this.teenPerson5.PersonSwingingArmsWhileRunning();   
  }, () -> {     
    this.teenPerson.walkPerson5();   
  }, () -> { 
    this.teenPerson.PersonSwingingArms();    
  } ); 
  this.teenPerson5.turn( TurnDirection.RIGHT, 0.5 );   
  this.teenPerson5.move( MoveDirection.RIGHT, 0.35 ); 
  doTogether( () -> {  
    this.teenPerson6.walkPerson52();    
  }, () -> {    
    this.teenPerson5.KickingTheBall(); 
  }, () -> {    
    this.soccerBall.move( MoveDirection.FORWARD, 10.0 );   
  } );  
  doTogether( () -> {   
    this.teenPerson5.straightenOutJoints();  
  }, () -> {     
    this.teenPerson6.turn( TurnDirection.LEFT, 0.5 );  
  } ); 
}
