
public void BoysGettingUpFromTable() {   
  doTogether( () -> {    
    doTogether( () -> {    
      this.teenPerson5.getRightHip().turn( TurnDirection.FORWARD, 0.25 );    
    }, () -> {       
      this.teenPerson5.getLeftHip().turn( TurnDirection.FORWARD, 0.25 );  
    }, () -> {      
      this.teenPerson5.getRightKnee().turn( TurnDirection.BACKWARD, 0.25 );    
    }, () -> {      
      this.teenPerson5.getLeftKnee().turn( TurnDirection.BACKWARD, 0.25 );    
    }, () -> {         
      this.teenPerson5.move( MoveDirection.UP, 0.5 );   
    }, () -> {        
      this.teenPerson6.getRightHip().turn( TurnDirection.FORWARD, 0.25 );   
    }, () -> {       
      this.teenPerson6.getLeftHip().turn( TurnDirection.FORWARD, 0.25 );     
    }, () -> {    
      this.teenPerson6.getRightKnee().turn( TurnDirection.BACKWARD, 0.25 );   
    }, () -> {      
      this.teenPerson6.getLeftKnee().turn( TurnDirection.BACKWARD, 0.25 );   
    }, () -> {       
      this.teenPerson6.move( MoveDirection.UP, 0.5 );    
    }, () -> {     
      this.teenPerson7.getRightHip().turn( TurnDirection.FORWARD, 0.25 );      
    }, () -> {        
      this.teenPerson7.getLeftHip().turn( TurnDirection.FORWARD, 0.25 );    
    }, () -> {        
      this.teenPerson7.getRightKnee().turn( TurnDirection.BACKWARD, 0.25 );   
    }, () -> {        
      this.teenPerson7.getLeftKnee().turn( TurnDirection.BACKWARD, 0.25 );    
    }, () -> {     
      this.teenPerson7.move( MoveDirection.UP, 0.5 );    
    }, () -> {      
      this.teenPerson8.getRightHip().turn( TurnDirection.FORWARD, 0.25 );  
    }, () -> {       
      this.teenPerson8.getLeftHip().turn( TurnDirection.FORWARD, 0.25 );    
    }, () -> {        
      this.teenPerson8.getRightKnee().turn( TurnDirection.BACKWARD, 0.25 );   
    }, () -> {        
      this.teenPerson8.getLeftKnee().turn( TurnDirection.BACKWARD, 0.25 );   
    }, () -> {        
      this.teenPerson8.move( MoveDirection.UP, 0.3 );    
    } );  
  }, () -> {    
    doTogether( () -> {       
      this.teenPerson5.move( MoveDirection.BACKWARD, 0.5 );     
    }, () -> {        
      this.teenPerson5.move( MoveDirection.LEFT, 2.5 );  
    }, () -> {      
      this.teenPerson8.move( MoveDirection.LEFT, 3.0 );   
    }, () -> {      
      this.teenPerson8.move( MoveDirection.FORWARD, 0.5 );   
    }, () -> {        
      this.teenPerson6.move( MoveDirection.RIGHT, 2.0 );     
    }, () -> {   
      this.teenPerson6.move( MoveDirection.FORWARD, 0.5 );  
    }, () -> {        
      this.teenPerson7.move( MoveDirection.RIGHT, 2.5 );    
    }, () -> {      
      this.teenPerson7.move( MoveDirection.FORWARD, 0.5 );    
    } );   
  }, () -> {     
    this.camera.moveAndOrientTo( this.FollowingToCreamery3 );  
  }, () -> {    
    this.cake.setOpacity( 0.0 );  
  } );   
  this.setFogDensity( 0.0 );  
  doTogether( () -> {   
    this.teenPerson7.say( "That was good food. I am now ready to win this game. Let's go!", Say.duration( 4.0 ) );  
  }, () -> {     
    this.playAudio( new AudioSource( Resources.Person7ThatWasGoodFood__2__mp3 ) );   
  }, () -> {    
    this.teenPerson7.talk();      
    this.teenPerson7.talk();      
    this.teenPerson7.talk();      
    this.teenPerson7.talk();  
    this.teenPerson7.talk();  
    this.teenPerson7.talk();  
    this.teenPerson7.talk();  
    this.teenPerson7.talk();  
  } );  }
 
  
