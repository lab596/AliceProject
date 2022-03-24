 
public void BusDrivesAway() {   
  this.camera.moveAndOrientTo( this.BusBackView );  
  doTogether( () -> {     
    this.playAudio( new AudioSource( Resources.BusDriveAway_wav ) );  
  }, () -> {     
    this.bus.getBackWheels().turn( TurnDirection.BACKWARD, 2.0 );   
  }, () -> {      
    this.bus.getFrontRightWheel().turn( TurnDirection.BACKWARD, 2.0 );  
  }, () -> {       
    this.bus.getFrontLeftWheel().turn( TurnDirection.BACKWARD, 2.0 ); 
  }, () -> {       
    this.bus.move( MoveDirection.FORWARD, 10.0 );   
  } );  
  this.setFogDensity( 1.0 ); 
}
