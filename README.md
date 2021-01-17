# What is MLBSimulator?
A program that simulates a full season of Major League Baseball and crowns a winner*.

*Note- This program uses no real life data and generates a completely random result.

# Pre-requisite Information
*This section explains what the MLB is and how a team wins a championship.

In Major League Baseball, there are 30 teams that are divided by two leagues, the National League(NL) and the American League(AL).
![ALNL](https://images.saymedia-content.com/.image/t_share/MTc1NDU3NjcxMzg3MDMwNzIy/major-league-baseball-teams-a-short-history.jpg)

In each of these two leagues, they hold 15 teams, which are further divided into three regions of five teams: East(E), Central(C), West(W). 

In total, there are 6 divisions- American League East(ALE), American League Central(ALC), American League West(ALW), National League East(NLE), National League Central(NLC), and National League West(NLW).
![MLBDiv](https://i.ibb.co/gy2QnWy/Screen-Shot-2021-01-17-at-5-21-41-PM.png)

**Now that we have all the teams and divisions introduced, how does a simulation work and how do we crown a winner?** 

In the MLB, teams play against each other in a 162 game season. Once these games conclude, a total of 10 teams will qualify for the MLB Postseason.

**What is the MLB Postseason and how do we determine the 10 teams that qualify?**

The MLB Postseason is a tournament that takes place every October where 10 teams try to win the championship. 
Of the 10 teams that qualify for the postseason, 5 of them come from each league. So 5 teams come from the National League and another 5 teams come from the American League.

Let's look at how the 5 teams from the National League qualify. 
We have the NL East, NL Central, and NL West. The team with the best record in each of those divisions will qualify, which is known as the division winner. 
If we look at the divisions picture above, the teams are set up in alphabetical order, but for examples sake, we'll just say that they are ordered by records. 
So in that case, the Atlanta Braves will qualify from the NL East, the Chicago Cubs will qualify from the NL Central, and the Arizona Diamondbacks will qualify from the NL West.

We have 3 teams qualifed, but where do the other 2 teams come from? The other 2 teams that qualify are known as Wild Card teams. 
These teams will be the teams with the best records that aren't division winners. Let's stay with the previous example where Atlanta, Chicago, and Arizona are qualified.
Let's say Miami has 85 wins, Cincinnati has 90 wins, Colorado has 94 wins, and Los Angeles has 92 wins.
The two wild card teams will be Colorado and Los Angeles.

Now we have our five teams determined from the National League and the same type of system will apply to the American League.

**How does the MLB Postseason work?**

We'll use our National League example to explain this where we have our three division winners in Atlanta, Chicago, and Arizona & the two wild card teams in Colorado and Los Angeles.

First we need to determine seeding from our division winners. Let's say Atlanta has 96 wins, Chicago has 101 wins, and Arizona has 98 wins. Chicago will be the 1st seed, Arizona will be the 2nd seed, and Atlanta will be the 3rd seed.

To start the MLB postseason, the two wild card teams in Colorado and Los Angeles will play each other in a 1 game match(the Wild Card game) where the winner will move on and the loser will go home. Let's say in our example, Los Angeles wins.

Now our four remaining teams are Chicago(#1 seed), Arizona(#2), Atlanta(#3), and Los Angeles(#4) and they prepare to face off for the National League Division Series(NLDS). 

The #1 seed always plays against the winner of the Wild Card game. And then the other two division winners, the #2 & #3 seeds will play against each other.
Chicago and Los Angeles will play each other in a 5 game series, where the first team to 3 wins will move on. The same will occur between Arizona and Atlanta. Let's say Chicago and Atlanta win their series respectively.

Now our two remaining teams in the National League are Chicago and Atlanta and they prepare to face off in the National League Championship Series(NLCS). 

Chicago and Atlanta will face off against each other in a 7 game series, where the first team to 4 wins will move on. Let's say in our example, Chicago moves on. 

Now Chicago is the lone remaining team from the National League and they will move on to what you may have heard before as the World Series. What occured for the National League also occured for the American League with a different set of teams, so there is also a lone remaining team from the American League as well that is qualified for the World Series.
Chicago will face whatever team is remaining from the American League side in a 7 game series, where the first team to 4 will win. Let's say Chicago wins this series. Now Chicago is crowned the World Series champion.

# How does this program work?
This program is already hardcoded in with 6 separate arrays of 5 teams designated for each division. Each team in the array is given a win count(randomly selected from the Wins.dat file) and is then ordered in descending order with best record placed first and worst record last. 
Afterwards, each division's 5 teams are printed to the compiler with their win count, loss count, and their win percentage.

Following this, I simulate a postseason scenario where I give the higher seed better odds of winning. For example, the #1 seed vs the #4 seed. The #1 seed has a 65% chance of winning, while #4 has 35% chance. And then when it comes to #2 seed vs #3 seed, it is 55% vs 45%.
Once the World Series concludes, a little window will print text saying [City Name] [Team Name] wins the world series!.

# Why did I make this program?
I made this program in high school where the teacher assigned us a project where we could code anything we wanted, but it had to be complex enough that it couldn't be made in 1 or 2 hours.

I like sports, so I decided to make something on MLB as the season was beginning at the time I was making it. 

Overall, I look at this project and I am satisfied for what I made at the time, but when I look at it now, I can only cringe a little at some of the poor coding practices i had. Such as, only using one file for the entire program was a mistake. Utilizing OOP would've made this project not only easier to read, but easier to code.
And also, I'm sure I could've implemented some way to make it use some real life data instead of being completely random, so that it'd be more interesting because as of right now, it's a cool project that serves no purpose.

But alas, everyone starts somewhere, and I think sharing some of my less skilled work is just as important as uploading my better works.
