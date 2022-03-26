
public void PhotoShoot() {   
  doTogether( () -> {     
    this.teenPerson2.say( "1..2..3, say cheese!", Say.duration( 4.0 ) ); 
  }, () -> {     
    this.teenPerson2.playAudio( new AudioSource( Resources.SayCheese__mp3 ) );
  } );    
  doTogether( () -> {   
    this.teenPerson5.say( "Cheese!", Say.duration( 1.0 ) ); 
  }, () -> {    
    this.teenPerson5.playAudio( new AudioSource( Resources.Boy5Cheese_mp3 ) );  
  }, () -> {      
    this.teenPerson6.say( "Cheese!", Say.duration( 1.0 ) );    
  }, () -> {  
    this.teenPerson6.playAudio( new AudioSource( Resources.Boy6Cheese_mp3 ) ); 
  }, () -> {     
    this.teenPerson7.say( "Cheese!", Say.duration( 1.0 ) );  
  }, () -> {    
    this.teenPerson7.playAudio( new AudioSource( Resources.Boy7Cheese_mp3 ) );   
  }, () -> {       
    this.teenPerson8.say( "Cheese!", Say.duration( 1.0 ) );    
  }, () -> {   
    this.teenPerson8.playAudio( new AudioSource( Resources.Boy8Cheese_mp3 ) );  
  }, () -> {   
    this.adultPerson3.say( "Cheese!", Say.duration( 1.0 ) ); 
  }, () -> { 
    this.adultPerson3.playAudio( new AudioSource( Resources.MomCheese_mp3 ) );  
  }, () -> {   
    this.adultPerson.say( "Cheese!", Say.duration( 1.0 ) );  
  }, () -> {     
    this.adultPerson.playAudio( new AudioSource( Resources.CoachCheese_mp3 ) );    
  } );    
  {      
    // do in order   
    this.setAtmosphereColor( Color.BLACK );     
    this.setFromAboveLightColor( Color.BLACK );     
    this.setFromBelowLightColor( Color.BLACK );    
  } 
}
 
  
