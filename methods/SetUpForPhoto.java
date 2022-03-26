
public void SetUpForPhoto() {    
  doTogether( () -> {      
    this.camera.moveAndOrientTo( this.FinalPic );  
  }, () -> {    
    this.teenPerson5.moveAndOrientTo( this.Boy5InPic );    
  }, () -> {      
    this.teenPerson6.moveAndOrientTo( this.Boy6InPic );  
  }, () -> { 
    this.teenPerson7.moveAndOrientTo( this.Boy7InPic );   
  }, () -> {      
    this.teenPerson8.moveAndOrientTo( this.Boy8InPic );    
  }, () -> {    
    this.adultPerson3.turn( TurnDirection.LEFT, 0.1 ); 
  }, () -> {   
    this.adultPerson.turn( TurnDirection.LEFT, 0.15 );  
  } );   
  this.setFogDensity( 0.0 );
}
 
  
