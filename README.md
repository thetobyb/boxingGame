# The Fighters Game #

**What is the main functionality of the fighters game?**

The fighters game involves the user/users picking 2 fighter characters 
at the start of the game, then the fighters will take turns in dealing
heavy or light blows to the opponents character. The game finishes when
either characters HP (Health Points) reaches 0. The fighters are pre-defined
within the game and the users have a choice of selecting which one they would
like to be.

## The main functions and functionality
The fighting game consists of two classes, which are the Boxers and
Fighters class. The Boxers class is where all of the main functionality occurs
and the fighters class is the "main" class where the program runs.

Each fighter has several stats, as follows:

Name - String
LightAttack - Int
HeavyAttack - Int
Block - Int
Attack - Int
Defence - Int
Health - Int
Alive - Boolean

When a user does either a light or heavy attack, their light or heavy attack number
compares against the opponents block, if the users attack is a higher
value than their block, the attack is successful. Because the attack
is successful, the user that tried to block loses 10 HP. If the attack is 
successfully blocked, the user will lose 0 HP.

The users attack and defence values are what you would normally find on 
a TopTrump card, these are meant to multiply the fighters light/heavy attack
and block depending on how high the attack and defence values are, but this
hasn't been implemented yet.


