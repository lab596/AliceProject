 
public void Boy1Talk1() {     
  doTogether( () -> {         
    this.teenPerson9.say( "I'm already outside mom!", Say.duration( 1.5 ) );     
  }, () -> {         
    this.playAudio( new AudioSource( Resources.Im_already_outside_mp3 ) );     
  }, () -> {         
    this.teenPerson9.talk();         
    this.teenPerson9.talk();         
    this.teenPerson9.talk();     
  } );  
}
 
