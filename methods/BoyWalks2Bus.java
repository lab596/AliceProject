public void BoyWalks2Bus() {   
  doTogether( () -> {    
    this.teenPerson9.walkPerson52();  
  }, () -> {   
    this.teenPerson9.PersonSwingingArms(); 
  } );    
  this.camera.moveAndOrientTo( this.FollowingToBus2 );  
  doTogether( () -> {    
    this.teenPerson9.walkPerson52();  
  }, () -> {      
    this.teenPerson9.PersonSwingingArms();    
  } );   
  this.camera.moveAndOrientTo( this.FollowingToBus3 );    
  doTogether( () -> {    
    this.teenPerson9.walkPerson5(); 
  }, () -> {    
    this.teenPerson9.PersonSwingingArms();   
  } );    
  this.teenPerson9.setOpacity( 0.0 ); 
}
 
