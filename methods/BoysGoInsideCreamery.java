
public void BoysGoInsideCreamery() {  
  this.setFogDensity( 1.0 );  
  doTogether( () -> {      
    this.teenPerson6.move( MoveDirection.FORWARD, 6.0 );  
  }, () -> {      
    this.teenPerson7.move( MoveDirection.FORWARD, 6.0 );  
  }, () -> {  
    this.teenPerson8.move( MoveDirection.FORWARD, 6.0 );     
  } );   
  doTogether( () -> {         
    this.teenPerson8.turn( TurnDirection.RIGHT, 0.25 );
  }, () -> {       
    this.teenPerson7.turn( TurnDirection.RIGHT, 0.25 ); 
  }, () -> {     
    this.teenPerson6.turn( TurnDirection.RIGHT, 0.25 );  
  }, () -> {       
    this.teenPerson5.turn( TurnDirection.RIGHT, 0.5 );   
  } );   
  doTogether( () -> {      
    this.teenPerson6.move( MoveDirection.FORWARD, 8.0 );  
  }, () -> {   
    this.teenPerson6.move( MoveDirection.LEFT, 4.0 );     
  }, () -> {    
    this.teenPerson7.move( MoveDirection.FORWARD, 9.0 );
  }, () -> {   
    this.teenPerson8.move( MoveDirection.FORWARD, 7.0 );  
  }, () -> {   
    this.teenPerson8.move( MoveDirection.RIGHT, 2.0 );   
  }, () -> {     
    this.teenPerson8.move( MoveDirection.UP, 0.5 );   
  }, () -> {    
    this.teenPerson5.move( MoveDirection.FORWARD, 4.0 );  
  }, () -> {    
    this.teenPerson5.move( MoveDirection.LEFT, 1.0 );   
  }, () -> {      
    this.camera.moveAndOrientTo( this.FollowingToCreamery3 );   
  }, () -> {     
    this.billboard7.turn( TurnDirection.RIGHT, 0.25 );  
  }, () -> {      
    this.billboard7.move( MoveDirection.LEFT, 0.25 ); 
  }, () -> {      
    this.billboard7.move( MoveDirection.BACKWARD, 1.0 );  
  } );   
  this.setFogDensity( 0.0 );
}
 
  
