
public void BoysTalkInCreamery() { 
  doTogether( () -> {      
    this.teenPerson6.say( "Hey guys, I heard that the team we are playing against today is the hardest one yet.", Say.duration( 5.0 ) );   
  }, () -> {     
    this.playAudio( new AudioSource( Resources.Boy6GeranitIHeardTheTeamWeArePlaying_mp3 ) ); 
  }, () -> {      
    this.teenPerson6.getLeftShoulder().turn( TurnDirection.RIGHT, 0.25 );  
  }, () -> {      
    this.teenPerson6.talk();    
    this.teenPerson6.talk(); 
    this.teenPerson6.talk();     
    this.teenPerson6.talk();     
    this.teenPerson6.talk();      
    this.teenPerson6.talk();      
    this.teenPerson6.talk();     
    this.teenPerson6.talk();     
    this.teenPerson6.talk();     
    this.teenPerson6.talk();  
  }, () -> {       
    this.camera.moveAndOrientTo( this.FacingBoy6 ); 
  }, () -> {   
    this.teenPerson7.getHead().turn( TurnDirection.LEFT, 0.25 );  
  } );  
  doTogether( () -> {   
    this.teenPerson5.say( "Yeah, its gonna be a tough battle today, but as long as we play like we did last week we can win.", Say.duration( 6.0 ) );  
  }, () -> {     
    this.playAudio( new AudioSource( Resources.YeahItsGonnaBeAToughBattle_mp3 ) );  
  }, () -> {    
    this.teenPerson5.talk();     
    this.teenPerson5.talk();    
    this.teenPerson5.talk();    
    this.teenPerson5.talk();    
    this.teenPerson5.talk();     
    this.teenPerson5.talk();    
    this.teenPerson5.talk();    
    this.teenPerson5.talk();    
    this.teenPerson5.talk();    
    this.teenPerson5.talk();    
    this.teenPerson5.talk();    
    this.teenPerson5.talk(); 
  }, () -> {       
    this.camera.moveAndOrientTo( this.FacingBoy5 );   
  }, () -> {    
    this.teenPerson6.getLeftShoulder().turn( TurnDirection.LEFT, 0.25 ); 
  }, () -> {      
    this.teenPerson8.getHead().turn( TurnDirection.RIGHT, 0.25 ); 
  }, () -> {     
    doTogether( () -> {      
      this.teenPerson5.getRightShoulder().turn( TurnDirection.LEFT, 0.25 );  
    }, () -> {           
      this.teenPerson5.getRightIndexFinger().turn( TurnDirection.FORWARD, 0.25 );   
    }, () -> {       
      this.teenPerson5.getRightIndexFingerKnuckle().turn( TurnDirection.FORWARD, 0.125 );  
    }, () -> {  
      this.teenPerson5.getRightMiddleFinger().turn( TurnDirection.FORWARD, 0.25 );  
    }, () -> {    
      this.teenPerson5.getRightMiddleFingerKnuckle().turn( TurnDirection.FORWARD, 0.125 );   
    }, () -> {       
      this.teenPerson5.getRightPinkyFinger().turn( TurnDirection.FORWARD, 0.25 );  
    }, () -> {        
      this.teenPerson5.getRightPinkyFingerKnuckle().turn( TurnDirection.FORWARD, 0.125 ); 
    } ); 
  } );   
  doTogether( () -> {   
    this.teenPerson7.say( "I'm really nervous for this game guys, we actually have a chance of winning the trophy this year, I don't wanna blow it for you guys.", Say.duration( 7.0 ) ); 
  }, () -> {      
    this.playAudio( new AudioSource( Resources.Person7ImReallyNervous_mp3 ) );  
  }, () -> {      
    this.teenPerson7.getRightShoulder().turn( TurnDirection.LEFT, 0.25 ); 
  }, () -> {      
    this.teenPerson7.getRightElbow().turn( TurnDirection.LEFT, 0.125 );  
  }, () -> {       
    this.teenPerson6.getHead().turn( TurnDirection.RIGHT, 0.25 );    
  }, () -> {   
    this.teenPerson7.talk();      
    this.teenPerson7.talk();     
    this.teenPerson7.talk();     
    this.teenPerson7.talk();     
    this.teenPerson7.talk();    
    this.teenPerson7.talk();    
    this.teenPerson7.talk();    
    this.teenPerson7.talk();    
    this.teenPerson7.talk();    
    this.teenPerson7.talk();    
    this.teenPerson7.talk();    
    this.teenPerson7.talk();    
  }, () -> {        
    this.camera.moveAndOrientTo( this.FacingBoy7 );  
  }, () -> {      
    this.teenPerson8.getHead().turn( TurnDirection.LEFT, 0.25 ); 
  } );   
  doTogether( () -> {     
    this.teenPerson8.say( "Hey man don\u2019t worry. Just try your best.", Say.duration( 3.0 ) );  
  }, () -> {    
    this.playAudio( new AudioSource( Resources.Boy8JoeyDontWorryJust_mp3 ) );   
  }, () -> {     
    this.camera.moveAndOrientTo( this.FacingBoy8 ); 
  }, () -> {      
    this.teenPerson8.talk();    
    this.teenPerson8.talk();    
    this.teenPerson8.talk();    
    this.teenPerson8.talk();    
    this.teenPerson8.talk();    
    this.teenPerson8.talk();    
  } ); 
  doTogether( () -> {    
    doTogether( () -> {    
      this.teenPerson5.getRightShoulder().turn( TurnDirection.RIGHT, 0.25 );   
    }, () -> {        
      this.teenPerson5.getRightIndexFinger().turn( TurnDirection.BACKWARD, 0.25 );  
    }, () -> {     
      this.teenPerson5.getRightIndexFingerKnuckle().turn( TurnDirection.BACKWARD, 0.125 );   
    }, () -> {      
      this.teenPerson5.getRightMiddleFinger().turn( TurnDirection.BACKWARD, 0.25 );  
    }, () -> {      
      this.teenPerson5.getRightMiddleFingerKnuckle().turn( TurnDirection.BACKWARD, 0.125 );  
    }, () -> {        
      this.teenPerson5.getRightPinkyFinger().turn( TurnDirection.BACKWARD, 0.25 );    
    }, () -> {      
      this.teenPerson5.getRightPinkyFingerKnuckle().turn( TurnDirection.BACKWARD, 0.125 );  
    } ); 
  }, () -> {   
    this.teenPerson7.getHead().turn( TurnDirection.RIGHT, 0.25 );    
  }, () -> {   
    this.camera.moveAndOrientTo( this.ViewingTable ); 
  }, () -> {      
    this.teenPerson7.getRightShoulder().turn( TurnDirection.RIGHT, 0.25 );  
  }, () -> {  
    this.teenPerson7.getRightElbow().turn( TurnDirection.RIGHT, 0.125 );  
  }, () -> {     
    this.teenPerson6.getHead().turn( TurnDirection.LEFT, 0.25 );  
  } );   
  doTogether( () -> {     
    this.cake.setOpacity( 1.0 );
  }, () -> {    
    this.teenPerson6.say( "Hey look, our food has come. Lets eat.", Say.duration( 3.0 ) ); 
  }, () -> {    
    this.playAudio( new AudioSource( Resources.Boy6OurFoodHasCome_mp3 ) );  
  }, () -> {    
    this.teenPerson6.talk();     
    this.teenPerson6.talk();    
    this.teenPerson6.talk();    
    this.teenPerson6.talk();    
    this.teenPerson6.talk();  
    this.teenPerson6.talk();  
  } );    
  this.delay( 1.0 );   
  this.setFogDensity( 1.0 ); 
}
 
  
