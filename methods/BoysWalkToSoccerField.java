
public void BoysWalkToSoccerField() {  
  doTogether( () -> {     
    this.teenPerson5.turn( TurnDirection.RIGHT, 0.5 );   
  }, () -> {      
    this.teenPerson8.turn( TurnDirection.RIGHT, 0.5 ); 
  } ); 
  doTogether( () -> {      
    this.teenPerson5.turn( TurnDirection.LEFT, 0.02 );   
  }, () -> {       
    this.teenPerson6.turn( TurnDirection.LEFT, 0.01 );   
  } );   
  doTogether( () -> {    
    this.teenPerson8.move( MoveDirection.DOWN, 0.1 ); 
  }, () -> {   
    doTogether( () -> {    
      this.teenPerson5.walkPerson52Fast();   
    }, () -> {       
      this.teenPerson5.PersonSwingingArms();   
    }, () -> {     
      this.teenPerson6.delay( 0.2 );     
      this.teenPerson6.walkPerson62Fast();  
    }, () -> {        
      this.teenPerson6.Person6SwingingArms();   
    }, () -> {    
      this.teenPerson7.delay( 0.1 );    
      this.teenPerson7.walkPerson72Fast();   
    }, () -> {    
      this.teenPerson7.Person7SwingingArms();   
    }, () -> {      
      this.teenPerson8.delay( 0.3 );      
      this.teenPerson8.walkPerson82Fast();    
    } );     
    doTogether( () -> {       
      this.teenPerson5.walkPerson52();  
    }, () -> {      
      this.teenPerson5.PersonSwingingArms();     
    }, () -> {     
      this.teenPerson6.delay( 0.2 );         
      this.teenPerson6.WalkPerson62();   
    }, () -> {         
      this.teenPerson6.Person6SwingingArms();  
    }, () -> {      
      this.teenPerson7.delay( 0.1 );     
      this.teenPerson7.walkPerson72();    
    }, () -> {        
      this.teenPerson7.Person7SwingingArms();    
    }, () -> {        
      this.teenPerson8.delay( 0.3 );    
      this.teenPerson8.walkPerson82();  
    } ); 
  }, () -> {   
    this.playAudio( new AudioSource( Resources.bensound_thejazzpiano_wav, 0.25, 46.1, 60.0 ) ); 
  } );    
  doTogether( () -> {      
    this.camera.moveAndOrientTo( this.FollowToSoccerField1 );   
  }, () -> {    
    this.teenPerson5.turn( TurnDirection.RIGHT, 0.25 ); 
  }, () -> {    
    this.teenPerson6.turn( TurnDirection.RIGHT, 0.25 ); 
  }, () -> {    
    this.teenPerson7.turn( TurnDirection.RIGHT, 0.25 );  
  }, () -> {      
    this.teenPerson8.turn( TurnDirection.RIGHT, 0.25 );  
  }, () -> {     
    this.adultPerson3.moveAndOrientTo( this.objectMarker5 );   
  }, () -> {      
    this.adultPerson3.straightenOutJoints();  
  } );   
  doTogether( () -> {    
    this.adultPerson3.turn( TurnDirection.RIGHT, 0.125 ); 
  }, () -> {     
    this.teenPerson5.walkPerson52Fast();   
  }, () -> {      
    this.teenPerson5.PersonSwingingArms(); 
  }, () -> {      
    this.teenPerson6.delay( 0.2 );   
    this.teenPerson6.walkPerson62Fast();   
  }, () -> {     
    this.teenPerson6.Person6SwingingArms();  
  }, () -> {    
    this.teenPerson7.delay( 0.1 );   
    this.teenPerson7.walkPerson72Fast();   
  }, () -> {     
    this.teenPerson7.Person7SwingingArms(); 
  }, () -> {    
    this.teenPerson8.delay( 0.3 );     
    this.teenPerson8.walkPerson82Fast();   
  } );    
  this.camera.moveAndOrientTo( this.FollowToSoccerField2 ); 
  {         // do in order    
    doTogether( () -> {     
      this.teenPerson5.walkPerson52Fast();     
    }, () -> {     
      this.teenPerson5.PersonSwingingArms();    
    }, () -> {      
      this.teenPerson6.delay( 0.2 );       
      this.teenPerson6.walkPerson62Fast();    
    }, () -> {      
      this.teenPerson6.Person6SwingingArms();   
    }, () -> {       
      this.teenPerson7.delay( 0.1 );      
      this.teenPerson7.walkPerson72Fast();   
    }, () -> {   
      this.teenPerson7.Person7SwingingArms();    
    }, () -> {    
      this.teenPerson8.delay( 0.3 );      
      this.teenPerson8.walkPerson82Fast();   
    } );    
    doTogether( () -> {    
      this.teenPerson5.walkPerson52();   
    }, () -> {      
      this.teenPerson5.PersonSwingingArms();   
    }, () -> {        
      this.teenPerson6.delay( 0.2 );      
      this.teenPerson6.WalkPerson62();     
    }, () -> {      
      this.teenPerson6.Person6SwingingArms();      
    }, () -> {       
      this.teenPerson7.delay( 0.1 );      
      this.teenPerson7.walkPerson72(); 
    }, () -> {         
      this.teenPerson7.Person7SwingingArms();       
    }, () -> {        
      this.teenPerson8.delay( 0.3 );    
      this.teenPerson8.walkPerson82();     
    } );   
  }    
  this.camera.moveAndOrientTo( this.FollowToSoccerField3 ); 
  doTogether( () -> {    
    this.teenPerson5.walkPerson52Fast();  
  }, () -> {     
    this.teenPerson5.PersonSwingingArms();  
  }, () -> {      
    this.teenPerson6.delay( 0.2 );   
    this.teenPerson6.walkPerson62Fast();  
  }, () -> {     
    this.teenPerson6.Person6SwingingArms(); 
  }, () -> {  
    this.teenPerson7.delay( 0.1 );  
    this.teenPerson7.walkPerson72Fast();  
  }, () -> {     
    this.teenPerson7.Person7SwingingArms();    
  }, () -> {    
    this.teenPerson8.delay( 0.3 );     
    this.teenPerson8.walkPerson82Fast(); 
  } );  
  this.camera.moveAndOrientTo( this.FollowToSoccerField4 ); 
  doTogether( () -> {     
    this.teenPerson5.turn( TurnDirection.RIGHT, 0.125 ); 
  }, () -> {      
    this.teenPerson6.turn( TurnDirection.RIGHT, 0.125 ); 
  }, () -> {   
    this.teenPerson7.turn( TurnDirection.RIGHT, 0.125 );  
  }, () -> {     
    this.teenPerson8.turn( TurnDirection.RIGHT, 0.125 );  
  } );   
  {      
    // do in order     
    for( Integer indexA = 0; indexA < 2; indexA++ ) {      
      doTogether( () -> {       
        this.teenPerson5.walkPerson52Fast();     
      }, () -> {           
        this.teenPerson5.PersonSwingingArms();   
      }, () -> {            
        this.teenPerson6.delay( 0.2 );         
        this.teenPerson6.walkPerson62Fast();   
      }, () -> {           
        this.teenPerson6.Person6SwingingArms();      
      }, () -> {          
        this.teenPerson7.delay( 0.1 );       
        this.teenPerson7.walkPerson72Fast();   
      }, () -> {          
        this.teenPerson7.Person7SwingingArms();     
      }, () -> {         
        this.teenPerson8.delay( 0.3 );        
        this.teenPerson8.walkPerson82Fast();      
      } );      
    }   
    doTogether( () -> {    
      this.teenPerson5.walkPerson52();    
    }, () -> {      
      this.teenPerson5.PersonSwingingArms();    
    }, () -> {        
      this.teenPerson6.delay( 0.2 );     
      this.teenPerson6.WalkPerson62();   
    }, () -> {     
      this.teenPerson6.Person6SwingingArms();   
    }, () -> {      
      this.teenPerson7.delay( 0.1 );    
      this.teenPerson7.walkPerson72();    
    }, () -> {         
      this.teenPerson7.Person7SwingingArms();     
    }, () -> {        
      this.teenPerson8.delay( 0.3 );   
      this.teenPerson8.walkPerson82();    
    } );   
  }    
  this.camera.moveAndOrientTo( this.FollowToSoccerField5 );  
  doTogether( () -> {   
    this.teenPerson6.say( "Hi coach, we are ready for the game today!", Say.duration( 3.0 ) ); 
  }, () -> {     
    this.teenPerson6.playAudio( new AudioSource( Resources.HeyCoachWeAreReady_mp3 ) ); 
  }, () -> {     
    this.teenPerson6.talk();       
    this.teenPerson6.talk();    
    this.teenPerson6.talk();    
    this.teenPerson6.talk();    
    this.teenPerson6.talk();
    this.teenPerson6.talk();    
  } ); 
  this.adultPerson.turn( TurnDirection.RIGHT, 0.125 ); 
  doTogether( () -> {  
    this.adultPerson.say( "Okay guys, this is going to be a tough game. Good luck!", Say.duration( 4.0 ) );  
  }, () -> {      
    this.adultPerson.playAudio( new AudioSource( Resources.OkayGuysThisIsGoingToBeAToughGame_mp3 ) ); 
  }, () -> {     
    this.adultPerson.talk();    
    this.adultPerson.talk();    
    this.adultPerson.talk();    
    this.adultPerson.talk();
    this.adultPerson.talk();    
    this.adultPerson.talk();    
    this.adultPerson.talk();    
    this.adultPerson.talk();
  } ); 
  doTogether( () -> {    
    this.teenPerson8.say( "Hi Mom, we are energized and ready!", Say.duration( 3.0 ) );   
  }, () -> {    
    this.teenPerson8.playAudio( new AudioSource( Resources.HiMomWeAreEnergized_mp3 ) );   
  } );    
  doTogether( () -> {    
    this.adultPerson3.say( "That is good to hear because all of you are starting. Good luck!", Say.duration( 4.0 ) );  
  }, () -> {     
    this.adultPerson3.playAudio( new AudioSource( Resources.ThatIsGoodToHear_mp3 ) );  
  }, () -> {     
    this.adultPerson3.talk();     
    this.adultPerson3.talk();     
    this.adultPerson3.talk();     
    this.adultPerson3.talk();
    this.adultPerson3.talk();   
    this.adultPerson3.talk();  
    this.adultPerson3.talk();    
    this.adultPerson3.talk();  
  } ); 
}
 
  
