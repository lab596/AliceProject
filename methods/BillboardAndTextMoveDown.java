public void BillboardAndTextMoveDown() {     
  doTogether( () -> {         
    this.delay( 3.22 );     
  }, () -> {         
    this.playAudio( new AudioSource( Resources.He_Shoots____He_Scores_mp3 ) );     
  } );     
  doTogether( () -> {         
    this.IntroBillboard.move( MoveDirection.DOWN, 10.0 );     
  }, () -> {         
    this.TextOnBillboard.move( MoveDirection.DOWN, 10.0 );     
  }, () -> {         
    this.textModel2.move( MoveDirection.DOWN, 10.0 );     
  }, () -> {         
    this.textModel3.move( MoveDirection.DOWN, 10.0 );     
  } );  
}
