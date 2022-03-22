public void BoyOpensDoor() {     
  doTogether( () -> {         
    this.teenPerson9.getLeftShoulder().turn( TurnDirection.RIGHT, 0.25 );     
  }, () -> {         
    this.teenPerson9.getLeftWrist().roll( RollDirection.RIGHT, 0.125 );     
  }, () -> {         
    this.teenPerson9.getRightHip().turn( TurnDirection.BACKWARD, 0.05 );     
  }, () -> {         
    this.teenPerson9.getRightKnee().turn( TurnDirection.FORWARD, 0.125 );     
  }, () -> {         
    this.teenPerson9.move( MoveDirection.FORWARD, 0.5 );     
  }, () -> {         
    this.billboard5.turn( TurnDirection.RIGHT, 0.25 );     
  }, () -> {         
    this.billboard5.move( MoveDirection.LEFT, 0.25 );     
  }, () -> {         
    this.billboard5.move( MoveDirection.BACKWARD, 1.0 );     
  } );  
}
