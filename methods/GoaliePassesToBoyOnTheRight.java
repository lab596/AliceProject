   
public void GoaliePassesToBoyOnTheRight() {   
  doTogether( () -> {   
    this.teenPerson7.turn( TurnDirection.RIGHT, 0.125 );  
  }, () -> {    
    this.teenPerson8.turn( TurnDirection.LEFT, 0.35 ); 
  } );  
  doTogether( () -> {  
    this.camera.moveAndOrientTo( this.EagleEyePosition2 ); 
  }, () -> {    
    this.teenPerson7.move( MoveDirection.RIGHT, 2.0 );  
  }, () -> {      
    this.teenPerson7.move( MoveDirection.FORWARD, 0.5 );  
  } );  
  doTogether( () -> {    
    this.teenPerson2.Run();  
  }, () -> {   
    this.teenPerson2.PersonSwingingArmsWhileRunning();  
  }, () -> {     
    this.teenPerson7.KickingTheBall();    
  }, () -> {     
    this.soccerBall.move( MoveDirection.RIGHT, 1.0 ); 
  }, () -> {    
    this.soccerBall.move( MoveDirection.BACKWARD, 7.0 ); 
  } );   
  this.teenPerson7.straightenOutJoints();   
  doTogether( () -> {    
    this.teenPerson2.Run();  
  }, () -> {     
    this.teenPerson2.PersonSwingingArmsWhileRunning();  
  } );  
  doTogether( () -> {    
    this.teenPerson6.move( MoveDirection.RIGHT, 1.0 );  
  }, () -> {    
    this.teenPerson6.turn( TurnDirection.RIGHT, 0.125 );   
  } ); 
}
 
