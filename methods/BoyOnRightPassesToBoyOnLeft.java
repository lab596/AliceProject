
public void BoyOnRightPassesToBoyOnLeft() {  
  doTogether( () -> {       
    this.teenPerson8.KickingTheBall(); 
  }, () -> {    
    this.soccerBall.move( MoveDirection.RIGHT, 5.0 ); 
  }, () -> {      
    this.soccerBall.move( MoveDirection.FORWARD, 4.0 ); 
  }, () -> {    
    this.teenPerson.turn( TurnDirection.RIGHT, 0.125 );  
  } );   
  doTogether( () -> {     
    this.teenPerson8.straightenOutJoints(); 
  }, () -> {    
    this.teenPerson.Run();   
  }, () -> {    
    this.teenPerson.PersonSwingingArmsWhileRunning();    
  }, () -> {    
    this.teenPerson3.Run();  
  }, () -> {   
    this.teenPerson3.PersonSwingingArmsWhileRunning();  
  } );   
  doTogether( () -> {     
    this.teenPerson.Run(); 
  }, () -> {   
    this.teenPerson.PersonSwingingArmsWhileRunning();  
  }, () -> {     
    this.teenPerson3.Run();  
  }, () -> {    
    this.teenPerson3.PersonSwingingArmsWhileRunning();   
  } );   
  this.teenPerson.turn( TurnDirection.LEFT, 0.125 ); 
  doTogether( () -> {    
    this.teenPerson6.KickingTheBall();
  }, () -> {      
    this.soccerBall.move( MoveDirection.LEFT, 5.0 ); 
  }, () -> {      
    this.soccerBall.move( MoveDirection.BACKWARD, 4.0 );  
  } );  
  this.teenPerson8.turn( TurnDirection.RIGHT, 0.35 );  
  doTogether( () -> {      
    this.teenPerson6.straightenOutJoints();   
  }, () -> {      
    this.teenPerson8.KickingTheBall();  
  }, () -> {    
    this.soccerBall.move( MoveDirection.BACKWARD, 4.0 ); 
  } );    
  this.teenPerson8.straightenOutJoints();
}
 
  
