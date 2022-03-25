
public void BoysWalkToCreamery() {   
  this.sedan.setOpacity( 0.0 );  
  doTogether( () -> {    
    this.teenPerson8.move( MoveDirection.UP, 0.2 );   
  }, () -> {     
    this.teenPerson5.move( MoveDirection.UP, 0.13 );   
  }, () -> {    
    this.camera.moveAndOrientTo( this.FollowingToCreamery1 );  
  } );  
  doTogether( () -> {     
    this.teenPerson5.walkPerson5();  
  }, () -> {   
    this.teenPerson5.PersonSwingingArms();   
  }, () -> {    
    this.teenPerson6.delay( 0.2 );     
    this.teenPerson6.WalkPerson6();   
  }, () -> {   
    this.teenPerson6.Person6SwingingArms();  
  }, () -> {     
    this.teenPerson7.delay( 0.1 );    
    this.teenPerson7.walkPerson7();   
  }, () -> {       
    this.teenPerson7.Person7SwingingArms();   
  }, () -> {       
    this.teenPerson8.delay( 0.3 );     
    this.teenPerson8.walkPerson8();   
  }, () -> {    
    this.teenPerson8.say( "Im starving, can't wait to eat cake.", Say.duration( 2.0 ) );   
  }, () -> {     
    this.playAudio( new AudioSource( Resources.ImStarving_mp3 ) );  
  } );  
  doTogether( () -> {      
    this.teenPerson5.walkPerson5();   
  }, () -> {     
    this.teenPerson5.PersonSwingingArms();  
  } );   
  this.teenPerson5.getHead().turn( TurnDirection.RIGHT, 0.125 );   
  this.teenPerson5.getHead().turn( TurnDirection.LEFT, 0.25 );  
  this.teenPerson5.getHead().turn( TurnDirection.RIGHT, 0.125 );   
  this.teenPerson5.turn( TurnDirection.RIGHT, 0.5 );  
  doTogether( () -> {    
    this.teenPerson5.say( "Its safe for us to cross, lets go." );   
  }, () -> {      
    this.playAudio( new AudioSource( Resources.ItsSafe_mp3 ) ); 
  } );  
  this.teenPerson5.turn( TurnDirection.LEFT, 0.5 );  
  doTogether( () -> {   
    this.teenPerson5.walkPerson5();   
  }, () -> {     
    this.teenPerson5.PersonSwingingArms();   
  }, () -> {     
    this.teenPerson6.delay( 0.2 );  
    this.teenPerson6.WalkPerson6();  
  }, () -> {     
    this.teenPerson6.Person6SwingingArms();  
  }, () -> {     
    this.teenPerson7.delay( 0.1 );   
    this.teenPerson7.walkPerson7();    
  }, () -> {     
    this.teenPerson7.Person7SwingingArms();  
  }, () -> {    
    this.teenPerson8.delay( 0.3 );   
    this.teenPerson8.walkPerson8();  
  } );   
  for( Integer indexA = 0; indexA < 2; indexA++ ) {   
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
    }, () -> {        
      this.camera.moveAndOrientTo( this.FollowingToCreamery2 );  
    } );  
  }   
  doTogether( () -> {      
    this.teenPerson5.turn( TurnDirection.LEFT, 0.25 );  
  }, () -> {       
    this.teenPerson6.delay( 0.2 );     
    this.teenPerson6.WalkPerson6();  
  }, () -> {       
    this.teenPerson7.delay( 0.1 );     
    this.teenPerson7.walkPerson7(); 
  }, () -> {        
    this.teenPerson7.Person7SwingingArms();   
  }, () -> {      
    this.teenPerson8.delay( 0.3 );     
    this.teenPerson8.walkPerson8();  
  }, () -> {      
    this.teenPerson6.Person6SwingingArms(); 
  } );   
  doTogether( () -> {   
    this.teenPerson5.walkPerson52();   
  }, () -> {    
    this.teenPerson5.PersonSwingingArms(); 
  } );  
  doTogether( () -> {      
    this.teenPerson5.walkPerson5();   
  }, () -> {  
    this.teenPerson5.PersonSwingingArms(); 
  } );    
  doTogether( () -> {     
    this.teenPerson6.turn( TurnDirection.LEFT, 0.25 );  
  }, () -> {    
    this.teenPerson7.turn( TurnDirection.LEFT, 0.25 );  
  }, () -> {     
    this.teenPerson8.turn( TurnDirection.LEFT, 0.25 );    
  }, () -> {       
    this.sedan.setOpacity( 1.0 );  
  } );    
  doTogether( () -> {   
    this.sedan.move( MoveDirection.FORWARD, 30.0, Move.duration( 3.0 ) ); 
  }, () -> {     
    this.playAudio( new AudioSource( Resources.BusDriveAway_wav ) );  
  }, () -> {     
    this.teenPerson5.turn( TurnDirection.RIGHT, 0.25 );  
  } );    
  this.teenPerson5.walkPerson5();    
  doTogether( () -> {    
    this.teenPerson5.getLeftShoulder().turn( TurnDirection.RIGHT, 0.25 );
  }, () -> {     
    this.teenPerson5.getLeftWrist().roll( RollDirection.RIGHT, 0.125 );  
  }, () -> {      
    this.teenPerson5.getRightHip().turn( TurnDirection.BACKWARD, 0.05 ); 
  }, () -> {    
    this.teenPerson5.getRightKnee().turn( TurnDirection.FORWARD, 0.125 );   
  }, () -> {      
    this.teenPerson5.move( MoveDirection.FORWARD, 0.5 ); 
  }, () -> {     
    this.billboard7.turn( TurnDirection.LEFT, 0.25 );  
  }, () -> {   
    this.billboard7.move( MoveDirection.RIGHT, 0.25 );    
  }, () -> {  
    this.billboard7.move( MoveDirection.FORWARD, 1.0 );  
  } ); 
  doTogether( () -> {    
    this.teenPerson5.straightenOutJoints();  
  }, () -> {    
    this.teenPerson5.turn( TurnDirection.RIGHT, 0.5 );     
  } );    
  doTogether( () -> {      
    this.teenPerson5.say( "Come on guys, lets go inside." ); 
  }, () -> {    
    this.playAudio( new AudioSource( Resources.ComeOn_mp3 ) );   
  }, () -> {     
    this.cake.setOpacity( 0.0 );   
  } ); 
}
 

  
