public void myFirstMethod() {     
  // Rohan Udupa - He Shoots... he Scores!     
  // Intro     
  // Camera moves from "StartOfIntro" to "Intro2" to "Intro3"     
  this.CameraMovesInIntro();     
  // After 3 seconds - Billboard and text moves Down     
  this.BillboardAndTextMoveDown();     
  // SCENE1 - In the house     
  // Camera moves to "StartingPosition"     
  this.camera.moveAndOrientTo( this.StartingPosition );     
  // Mom says "Hey bud, your late for school." from the kitchen     
  doTogether( () -> {         
    this.adultPerson3.say( "Hey bud, your late for school.", Say.duration( 2.0 ) );     
  }, () -> {         
    this.playAudio( new AudioSource( Resources.Hey_Bud_mp3 ) );     
  } );     
  // Camera moves to "FacingDoor"     
  this.camera.moveAndOrientTo( this.FacingDoor );     
  // Door opens while Boy's hand extends out with the door     
  this.BoyOpensDoor();     
  // Boy lowers hand and says "I'm already outside mom!" at the same time     
  this.BoyLowersHand();     
  this.Boy1Talk1();     
  // He then says “Remember mom, I'm going to the ice cream shop with some of my friends after school, then we are heading to the game.”     
  this.Boy1Talk2();     
  // Camera moves to "FacingKitchen"     
  this.camera.moveAndOrientTo( this.FacingKitchen );     
  // Mom turns around and says “Sounds good, good luck at the game. Bring home a goal.”at the same time     
  this.MomTurnsAndTalks();     
  // Camera moves to "FollowToBus" and Boy turns around at the same time     
  doTogether( () -> {         
    this.camera.moveAndOrientTo( this.FollowingToBus1 );     
  }, () -> {         
    this.teenPerson9.turn( TurnDirection.RIGHT, 0.5 );     } );     
  // Boy moves forward, camera goes to "FollowToBus2", and Boy says "Ok, thanks mom." at the same time     
  // Camera moves to FollowToBus3" while Boy continues to move forward     
  // Boy disappears into bus     
  this.BoyWalks2Bus();     
  // Bus drives away    
  // Scene cuts using opasity     
  this.BusDrivesAway();     
  // SCENE 2 - at school and at Joe's Creamery     
  // Camera moves to "ViewingSchool"     
  this.camera.moveAndOrientTo( this.FacingSchool );     
  this.setFogDensity( 0.0 );     
  this.delay( 1.0 );     
  this.LaterAtSchool.move( MoveDirection.DOWN, 10.0 );
   // 10 Kids walk out together     
  // Camera moves to "FollowingToCreamery1" and Boys walk to the street in a diamond pattern     
  // Camera moves to "FollowingToCreamery2" and Boys walk forward and are on the street     
  // Boys walk to the door and open it while a car drives by on the left side of the street towards the camera     
  doTogether( () -> {         
    this.teenPerson5.GoingDownStairs();     
  }, () -> {         
    this.teenPerson8.GoingDownStairs();     
  }, () -> {         
    this.playAudio( new AudioSource( Resources.PeopleTalking_wav, 0.1, 0.0, 12.0 ) );     
  } );     
  doTogether( () -> {         
    this.teenPerson6.turn( TurnDirection.LEFT, 0.25 );     
  }, () -> {         
    this.teenPerson7.turn( TurnDirection.RIGHT, 0.35 );     
  } );     
  doTogether( () -> {         
    this.BoysWalkToCreamery();     
  }, () -> {         
    this.playAudio( new AudioSource( Resources.PeopleTalking_wav, 0.1 ) );     
  } );     
  // Camera goes to "FollowingToCreamery3" and Boys walk towards second table and sit down     
  // Camera goes to "FacingTable"     
  this.BoysGoInsideCreamery();     
  doTogether( () -> {         
    this.BoysSitAtTable();     
  }, () -> {         
    this.playAudio( new AudioSource( Resources.bensound_thejazzpiano_wav, 0.25, 0.0, 10.0 ) );     
  } );     
  // Boy 2 states, “Hey guys, I heard that the team we are playing against today is the hardest one yet.” and camera moves to "FacingBoy2"     
  // “Yeah, it gonna be a tough battle today, but as long as we play like we did last week we can win.” states Boy 1 and camera moves to "FacingBoy1"     
  // “I'm really nervous for this game guys, we actually have a chance of winning that trophy this year, I don't wanna blow it for you guys.” says Boy 3 and camera moves to "FacingBoy3"     
  // “Hey man don’t worry. Just try your best.”says boy 4 and camera moves to "FacingBoy4"     
  // Camera moves to "FacingTable"     
  // Scene cuts using opasity     
  doTogether( () -> {         
    this.BoysTalkInCreamery();     
  }, () -> {         
    this.playAudio( new AudioSource( Resources.bensound_thejazzpiano_wav, 0.25, 9.95, 39.0 ) );     } );     
  // Camera moves to "FacingTableGetUp" and all Boys get up and go to postitions to get up     
  // Scene uncuts using opasity     
  // “Wow that was good food, I’m ready to win this game now!” - Boy 3     
  // Boys move to door and camera moves to "FollowToDoor"     
  doTogether( () -> {         
    this.BoysGettingUpFromTable();     
  }, () -> {         
    this.playAudio( new AudioSource( Resources.bensound_thejazzpiano_wav, 0.25, 39.1, 46.0 ) );     
  } );     
  // SCENE3 - Transition from Creamery to Soccer Field     
  // Boys walk forward and camera moves to "FollowToCreamery 2"     
  // Boys turn right and Camera moves to "FollowToSoccerField1"     
  // Boys walk forward and Camera moves to "FollowToSoccerField2"
   // Boys walk forward and Camera moves to "FollowToSoccerField3"     
  // Boys 1 says "Hi coach, we are ready for the game today!", boys move forward and Camera moves to "FollowToSoccerField4"     
  // and Camera moves to "FollowToSoccerField5" and coach says "Okay guys, this is going to be a tough game good luck!"     
  this.BoysWalkToSoccerField();     
  // Camera cuts using opacity     
  this.setFogDensity( 1.0 );     
  // SCENE 4 - Soccer Game     
  // Camera moves to "EagleEyePosition1"     
  doTogether( () -> {         
    this.teenPerson5.moveAndOrientTo( this.objectMarker2 );     
  }, () -> {         
    this.teenPerson6.moveAndOrientTo( this.objectMarker3 );     
  }, () -> {         
    this.teenPerson7.moveAndOrientTo( this.objectMarker1 );     
  }, () -> {         
    this.teenPerson8.moveAndOrientTo( this.objectMarker4 );     
  }, () -> {         
    this.camera.moveAndOrientTo( this.EagleEyePosition1 );     
  } );     
  // Camera uncuts using opacity     
  this.setFogDensity( 0.0 );     
  this.playAudio( new AudioSource( Resources.whistle_wav, 1.0, 0.0, 1.14 ) );     
  // 2 boys - 1 on each team run forward to get ball     
  // Red boy gets there first and turns and does kiking motion and ball moves backward     
  doTogether( () -> {         
    this.First2BoysRun2Ball();     
  }, () -> {         
    this.playAudio( new AudioSource( Resources.The_Fans___Ole_Ole_Ole___The_Name_Of_The_Game__1__wav, 0.5, 0.0, 11.0 ) );     
  } );     
  // Camera moves to "EagleEyePosition2"     
  // Red Boy on right side turns around and runs forward then turns left goalie does kiking motion and ball moves right to boy right blue boy moves forward at same time     
  doTogether( () -> {         
    this.GoaliePassesToBoyOnTheRight();     
  }, () -> {         
    this.playAudio( new AudioSource( Resources.The_Fans___Ole_Ole_Ole___The_Name_Of_The_Game__1__wav, 0.25, 11.0, 23.0 ) );     
  } );     
  // Red boy with ball turns right and moves forward with ball     
  // Red boy with ball turns left, does kicking motion and ball moves left to boy in center     
  doTogether( () -> {         this.BoyOnRightPassesToBoyOnLeft();     }, () -> {         this.playAudio( new AudioSource( Resources.The_Fans___Ole_Ole_Ole___The_Name_Of_The_Game__1__wav, 0.25, 23.0, 39.0 ) );     
                                                                               } );     
  // Camera moves to "EagleEyePosition3" and boy on left moves forward     
  // Red boy with ball dribbles forward and ball moves with him     
  // Red boy with ball turns left and moves forward while ball moves left     
  // Red boy with ball turns right and dribbles forward and ball moves forward     
  // Camera moves to "OverShoulder"     
  // Red boy starts to move leg back in kicking motion     
  // Camera moves to "AtLeftKnee"     
  // Boy finishes swinging motion and ball starts moving forward and up     
  // Camera goes to "FollowBall1" and ball keeps going forward and up     
  // Camera goes to "FollowBall2" and ball keeps going forward and up     
  // Camera goes to "FollowBall3" and ball goes into goal     
  // Coach says from the sideline "Yes, good job guys a goal, we won the game"     
  // Camera goes to "EagleEyePosition1"
   doTogether( () -> {         
     this.RedTeamScores();     
   }, () -> {         
     this.playAudio( new AudioSource( Resources.The_Fans___Ole_Ole_Ole___The_Name_Of_The_Game__1__wav, 0.25, 39.0, 74.0 ) );     
   } );     
  // Boys on red team move arms up and turn right and run forward     
  doTogether( () -> {         
    this.RedTeamCelabrates();     
  }, () -> {         
    this.playAudio( new AudioSource( Resources._2017_04_14___Happy_Dreams___David_Fesliyan_wav, 1.0, 5.0, 15.2 ) );     
  } );     
  // Camera cuts using opacity     
  doTogether( () -> {         
    this.TeamRunsBackToBench();     
  }, () -> {         
    this.playAudio( new AudioSource( Resources._2017_04_14___Happy_Dreams___David_Fesliyan_wav, 1.0, 15.2, 25.0 ) );     
  } );     
  // SCENE 5 - Photo shoot     
  // Camera moves to "PicturePosition"     
  // Boys on red team all move to bench position     
  this.SetUpForPhoto();     
  // Woman says "1..2..3, Say Cheese!"     
  // BlackBillboad moves up to block camera     
  this.PhotoShoot();  
}
    
