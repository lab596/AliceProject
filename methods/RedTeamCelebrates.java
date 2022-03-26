
public void RedTeamCelabrates() {  
  doTogether( () -> {    
    this.teenPerson5.getRightShoulder().turn( TurnDirection.LEFT, 0.5 );   
  }, () -> {     
    this.teenPerson5.getLeftShoulder().turn( TurnDirection.RIGHT, 0.5 );  
  } );   
  doTogether( () -> {   
    this.teenPerson6.getRightShoulder().turn( TurnDirection.LEFT, 0.5 );  
  }, () -> {    
    this.teenPerson6.getLeftShoulder().turn( TurnDirection.RIGHT, 0.5 );   
  }, () -> {     
    this.teenPerson7.getRightShoulder().turn( TurnDirection.LEFT, 0.5 );   
  }, () -> {    
    this.teenPerson7.getLeftShoulder().turn( TurnDirection.RIGHT, 0.5 );    
  }, () -> { 
    this.teenPerson8.getRightShoulder().turn( TurnDirection.LEFT, 0.5 ); 
  }, () -> {  
    this.teenPerson8.getLeftShoulder().turn( TurnDirection.RIGHT, 0.5 );   
  } );   
  doTogether( () -> {    
    this.teenPerson5.say( "We won the game!", Say.duration( 1.0 ) );  
  }, () -> {     
    this.teenPerson5.playAudio( new AudioSource( Resources.WeWonTheGame_mp3 ) );  
  }, () -> {     
    this.teenPerson4.roll( RollDirection.LEFT, 0.225 );   
  }, () -> {       
    this.teenPerson4.getRightShoulder().turn( TurnDirection.RIGHT, 0.5 ); 
  }, () -> {  
    this.teenPerson4.getLeftShoulder().turn( TurnDirection.LEFT, 0.5 ); 
  } );   
  doTogether( () -> {       
    this.teenPerson6.getRightShoulder().turn( TurnDirection.RIGHT, 0.5 );    
  }, () -> {     
    this.teenPerson6.getLeftShoulder().turn( TurnDirection.LEFT, 0.5 ); 
  }, () -> {      
    this.teenPerson7.getRightShoulder().turn( TurnDirection.RIGHT, 0.5 );   
  }, () -> {     
    this.teenPerson7.getLeftShoulder().turn( TurnDirection.LEFT, 0.5 );  
  }, () -> {    
    this.teenPerson8.getRightShoulder().turn( TurnDirection.RIGHT, 0.5 );  
  }, () -> {    
    this.teenPerson8.getLeftShoulder().turn( TurnDirection.LEFT, 0.5 );   
  } );   
  doTogether( () -> {    
    this.teenPerson5.getRightShoulder().turn( TurnDirection.RIGHT, 0.5 ); 
  }, () -> {      
    this.teenPerson5.getLeftShoulder().turn( TurnDirection.LEFT, 0.5 );  
  } ); 
}
 
  
