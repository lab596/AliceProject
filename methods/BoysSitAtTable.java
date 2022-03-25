 
public void BoysSitAtTable() {  
  doTogether( () -> {    
    this.teenPerson6.turn( TurnDirection.LEFT, 0.04 );  
  }, () -> {     
    this.teenPerson5.walkPerson5(); 
  }, () -> {     
    this.teenPerson6.WalkPerson6();  
  }, () -> {     
    this.teenPerson7.walkPerson7();  
  }, () -> {     
    this.teenPerson8.walkPerson8();    
  } );  
  doTogether( () -> {    
    this.teenPerson6.turn( TurnDirection.RIGHT, 0.5 );   
  }, () -> {     
    this.teenPerson7.turn( TurnDirection.RIGHT, 0.5 ); 
  }, () -> {    
    this.teenPerson8.move( MoveDirection.FORWARD, 2.0 );  
  }, () -> {   
    this.teenPerson5.move( MoveDirection.FORWARD, 1.0 );   
  }, () -> {    
    this.teenPerson6.move( MoveDirection.BACKWARD, 0.5 );    
  } );  
  this.teenPerson7.move( MoveDirection.BACKWARD, 0.5 );     
  doTogether( () -> {   
    this.teenPerson5.move( MoveDirection.FORWARD, 0.5 );   
  }, () -> {    
    this.teenPerson5.move( MoveDirection.RIGHT, 2.0 );   
  }, () -> {    
    this.teenPerson8.move( MoveDirection.RIGHT, 3.0 );   
  }, () -> {      
    this.teenPerson8.move( MoveDirection.BACKWARD, 0.5 );   
  }, () -> {     
    this.teenPerson6.move( MoveDirection.LEFT, 2.0 );  
  }, () -> {      
    this.teenPerson6.move( MoveDirection.BACKWARD, 0.5 );  
  }, () -> {    
    this.teenPerson7.move( MoveDirection.LEFT, 2.5 );  
  }, () -> {     
    this.teenPerson7.move( MoveDirection.BACKWARD, 0.5 ); 
  } );  
  doTogether( () -> {     
    this.camera.moveAndOrientTo( this.ViewingTable );   
  }, () -> {       
    this.teenPerson5.getRightHip().turn( TurnDirection.BACKWARD, 0.25 );  
  }, () -> {      
    this.teenPerson5.getLeftHip().turn( TurnDirection.BACKWARD, 0.25 ); 
  }, () -> {       
    this.teenPerson5.getRightKnee().turn( TurnDirection.FORWARD, 0.25 );    
  }, () -> {     
    this.teenPerson5.getLeftKnee().turn( TurnDirection.FORWARD, 0.25 );  
  }, () -> {   
    this.teenPerson5.move( MoveDirection.DOWN, 0.5 ); 
  }, () -> {    
    this.teenPerson6.getRightHip().turn( TurnDirection.BACKWARD, 0.25 );   
  }, () -> {      
    this.teenPerson6.getLeftHip().turn( TurnDirection.BACKWARD, 0.25 );
  }, () -> {       
    this.teenPerson6.getRightKnee().turn( TurnDirection.FORWARD, 0.25 );  
  }, () -> {      
    this.teenPerson6.getLeftKnee().turn( TurnDirection.FORWARD, 0.25 ); 
  }, () -> {    
    this.teenPerson6.move( MoveDirection.DOWN, 0.5 );  
  }, () -> {    
    this.teenPerson7.getRightHip().turn( TurnDirection.BACKWARD, 0.25 ); 
  }, () -> {      
    this.teenPerson7.getLeftHip().turn( TurnDirection.BACKWARD, 0.25 );  
  }, () -> {      
    this.teenPerson7.getRightKnee().turn( TurnDirection.FORWARD, 0.25 );    
  }, () -> {    
    this.teenPerson7.getLeftKnee().turn( TurnDirection.FORWARD, 0.25 ); 
  }, () -> {  
    this.teenPerson7.move( MoveDirection.DOWN, 0.5 ); 
  }, () -> {   
    this.teenPerson8.getRightHip().turn( TurnDirection.BACKWARD, 0.25 );  
  }, () -> {     
    this.teenPerson8.getLeftHip().turn( TurnDirection.BACKWARD, 0.25 );   
  }, () -> {    
    this.teenPerson8.getRightKnee().turn( TurnDirection.FORWARD, 0.25 );   
  }, () -> {      
    this.teenPerson8.getLeftKnee().turn( TurnDirection.FORWARD, 0.25 );  
  }, () -> {      
    this.teenPerson8.move( MoveDirection.DOWN, 0.3 ); 
  } ); 
}
 
  
