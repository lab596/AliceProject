
public void Shooting() {  
  doTogether( () -> {     
    this.teenPerson5.getRightHip().turn( TurnDirection.BACKWARD, 0.125, Turn.duration( 4.0 ) );  
  }, () -> {  
    this.teenPerson5.getRightAnkle().turn( TurnDirection.RIGHT, 0.2, Turn.duration( 4.0 ) );  
  } );   
  doTogether( () -> {      
    this.soccerBall.move( MoveDirection.FORWARD, 3.0 );   
  }, () -> {    
    this.soccerBall.move( MoveDirection.UP, 1.0 );
  } );   
  this.teenPerson5.getRightHip().turn( TurnDirection.FORWARD, 0.125, Turn.animationStyle( AnimationStyle.BEGIN_GENTLY_AND_END_ABRUPTLY ), Turn.duration( 1.0 ) ); 
  this.teenPerson5.getRightAnkle().turn( TurnDirection.LEFT, 0.2, Turn.duration( 0.5 ) ); 
}
 
  
