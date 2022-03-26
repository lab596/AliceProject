
public void RedTeamScores() {  
  this.teenPerson5.turn( TurnDirection.LEFT, 0.5 );  
  doTogether( () -> {   
    this.camera.moveAndOrientTo( this.EagleEyePosition3 );  
  }, () -> {      
    this.teenPerson5.move( MoveDirection.LEFT, 2.0 ); 
  }, () -> {     
    this.teenPerson5.move( MoveDirection.FORWARD, 5.0 );  
  } );    
  for( Integer indexA = 0; indexA < 3; indexA++ ) {      
    this.Dribbling();  
  }   
  doTogether( () -> {   
    this.teenPerson5.moveAndOrientTo( this.Boy5WhenScoring );   
  }, () -> {     
    this.camera.moveAndOrientTo( this.Scoring1 );   
  }, () -> {    
    this.soccerBall.moveAndOrientTo( this.BallWhenScoring );   
  } );   
  this.soccerBall.move( MoveDirection.UP, 0.05 );   
  doTogether( () -> {    
    this.soccerBall.move( MoveDirection.BACKWARD, 1.0 ); 
  }, () -> {    
    this.soccerBall.resize( 0.8 );   
  }, () -> {     
    this.camera.moveAndOrientTo( this.Scoring2 ); 
  } );   
  this.delay( 0.5 );  
  this.camera.moveAndOrientTo( this.Scoring3 ); 
  this.Shooting();   
  this.camera.moveAndOrientTo( this.FollowBall1 );   
  doTogether( () -> {      
    this.soccerBall.move( MoveDirection.FORWARD, 2.0 );   
  }, () -> {     
    this.soccerBall.move( MoveDirection.UP, 0.25 );  
  }, () -> {    
    this.soccerBall.move( MoveDirection.RIGHT, 0.25 );  
  } );   
  this.Person4GoalieDive();   
  doTogether( () -> {    
    this.camera.moveAndOrientTo( this.EagleEyePosition1, MoveAndOrientTo.duration( 5.0 ) );  
  }, () -> {     
    this.playAudio( new AudioSource( Resources._2017_04_14___Happy_Dreams___David_Fesliyan_wav, 1.0, 0.0, 5.0 ) );   
  } ); 
}
 
  
