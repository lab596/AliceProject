 
public void BoyLowersHand() {     
  doTogether( () -> {         
    this.teenPerson9.getLeftShoulder().turn( TurnDirection.LEFT, 0.25 );     
  }, () -> {         
    this.teenPerson9.getLeftWrist().roll( RollDirection.LEFT, 0.125 );     
  }, () -> {         
    this.teenPerson9.getRightHip().turn( TurnDirection.FORWARD, 0.05 );     
  }, () -> {         
    this.teenPerson9.getRightKnee().turn( TurnDirection.BACKWARD, 0.125 );     
  }, () -> {         
    this.teenPerson9.move( MoveDirection.FORWARD, 0.5 );     
  } );  
}
