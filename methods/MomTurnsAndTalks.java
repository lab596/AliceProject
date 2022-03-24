
public void MomTurnsAndTalks() {     
  this.adultPerson3.turn( TurnDirection.RIGHT, 0.5, Turn.animationStyle( AnimationStyle.BEGIN_AND_END_GENTLY ) );     
  doTogether( () -> {         
    this.adultPerson3.walkPerson5();     
  }, () -> {         
    doTogether( () -> {             
      this.adultPerson3.getRightShoulder().turn( TurnDirection.RIGHT, 0.1 );         
    }, () -> {             
      this.adultPerson3.getLeftShoulder().turn( TurnDirection.RIGHT, 0.1 );         
    } );         
    doTogether( () -> {            
      this.adultPerson3.getRightShoulder().turn( TurnDirection.LEFT, 0.1 );         
    }, () -> {             
      this.adultPerson3.getLeftShoulder().turn( TurnDirection.LEFT, 0.1 );         
    } );         
    doTogether( () -> {             
      this.adultPerson3.getRightShoulder().turn( TurnDirection.LEFT, 0.1 );         
    }, () -> {             
      this.adultPerson3.getLeftShoulder().turn( TurnDirection.LEFT, 0.1 );         
    } );         
    doTogether( () -> {             
      this.adultPerson3.getRightShoulder().turn( TurnDirection.RIGHT, 0.1 );         
    }, () -> {             
      this.adultPerson3.getLeftShoulder().turn( TurnDirection.RIGHT, 0.1 );         
    } );    
  }, () -> {         
    this.adultPerson3.say( "Sounds good, good luck at the game.", Say.duration( 2.0 ) );     
  }, () -> {         
    this.playAudio( new AudioSource( Resources.Sounds_Good_mp3 ) );     
  }, () -> {         
    this.adultPerson3.talk();         
    this.adultPerson3.talk();         
    this.adultPerson3.talk();         
    this.adultPerson3.talk();     
  } );     
  doTogether( () -> {         
    this.adultPerson3.getNeck().turn( TurnDirection.RIGHT, 0.07 );     
  }, () -> {         
    this.adultPerson3.turn( TurnDirection.LEFT, 0.25 );     
  }, () -> {         
    this.adultPerson3.getRightShoulder().turn( TurnDirection.LEFT, 0.25 );     
  }, () -> {         
    this.adultPerson3.getRightIndexFinger().turn( TurnDirection.FORWARD, 0.25 );     
  }, () -> {         
    this.adultPerson3.getRightIndexFingerKnuckle().turn( TurnDirection.FORWARD, 0.125 );    
  }, () -> {       
    this.adultPerson3.getRightMiddleFinger().turn( TurnDirection.FORWARD, 0.25 );   
  }, () -> {     
    this.adultPerson3.getRightMiddleFingerKnuckle().turn( TurnDirection.FORWARD, 0.125 );   
  }, () -> {     
    this.adultPerson3.getRightPinkyFinger().turn( TurnDirection.FORWARD, 0.25 );   
  }, () -> {    
    this.adultPerson3.getRightPinkyFingerKnuckle().turn( TurnDirection.FORWARD, 0.125 );   
  }, () -> {    
    this.adultPerson3.say( "Bring home a goal.", Say.duration( 1.0 ) ); 
  }, () -> {     
    this.playAudio( new AudioSource( Resources.Bring_Home_a_Goal_mp3 ) );  
  }, () -> {    
    this.adultPerson3.talk();     
    this.adultPerson3.talk();  
  } ); 
}
 
  
