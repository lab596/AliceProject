
public void TeamRunsBackToBench() { 
  doTogether( () -> {   
    this.teenPerson5.turn( TurnDirection.RIGHT, 0.35 );
  }, () -> {     
    this.teenPerson6.turn( TurnDirection.RIGHT, 0.1 );  
  }, () -> {     
    this.teenPerson7.turn( TurnDirection.RIGHT, 0.1 ); 
  }, () -> {     
    this.teenPerson8.turn( TurnDirection.RIGHT, 0.25 );   
  } );    
  doTogether( () -> {   
    for( Integer indexA = 0; indexA < 2; indexA++ ) { 
      doTogether( () -> {     
        this.teenPerson5.walkPerson52Fast();        
      }, () -> {         
        this.teenPerson5.PersonSwingingArms();      
      } );     
    }  
  }, () -> {    
    doTogether( () -> {      
      this.teenPerson6.walkPerson62Fast();     
    }, () -> {    
      this.teenPerson6.Person6SwingingArms();      
    } );  
  }, () -> {    
    doTogether( () -> {    
      this.teenPerson7.walkPerson72();    
    }, () -> {      
      this.teenPerson7.Person7SwingingArms();      
    } );   
  }, () -> { 
    this.teenPerson8.walkPerson82();   
  } );   
  this.setFogDensity( 1.0 ); 
}
 
  
