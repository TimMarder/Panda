# Panda
Team Panda
Tim Marder, Sean Roudnitsky, Ryan Kim (Period 2)

Description:
The project is a football simulation game that allows you to be in full contorl of your own team. You have many options similar to the ones that coaches on real
football teams have and you have to make the right decision on how to spend your team's budget to improve your team as much as possible. There is a main dashboard
where the user can choose to view his/her players and their stats. They can view their team's budget, visit the shop where equipment such as helmets, pads, and
cleats can be bought, draft better players to improve the overall team rating, and actually play a game. There are 4 games in the Pandamonium Football League,
the Wildcard game, Divisional Round, Conference Championship, and the PandaBowl. Each game is harder than the previous one and the only way that the user can
successfully win games is by making wise decisions during games and after games when the team earns money from winning and now has to decide what to spend it on.
The user wins the game when they have beaten the final team in the PandaBowl, which can be quite difficult unless the user follows all steps necessary to get a 
good player roster with up-to-date equipment.

Instructions:
1. Complile the program with $ javac Football.java
2. Run the program with $ java Football
3. Input your name
4. Confirm
5. Choose the team that you want to coach
6. Confirm
7. This is where you will get a welcome message and a first glance at the dashboard. You will have 5 options:
	- Player list & View stats
	- View team budget
	- Shop for Equipment
	- Draft players
	- Play a game
8. Choose Player list & View stats to see the players that you already own and the stats that they currently have. (Individual attributes such as strength, speed,
catching, throwing, awareness, etc.)
9. Choose view team budget to see how much money the team has and is able to spend on equipment or to draft new players.
10. Choose shop for equipment where you will get another menu:
	- Helmets
	- Pads
	- Cleats
		--> Choose what equipment you would like to choose for your team and another sub-menu will show up with the different brands for each piece of equipment
		is available in the shop and how much better it will make the overall rating of the team.
11. Choose draft players to tremendously increase the overall team rating by getting players with higher individual ratings. You will get a menu with
	- Offense
	- Defense
	--> Once you choose one of these menus, you will get another menu with
		(Offense)
		- Quarterbacks
		- Receivers
		- Runningbacks
		--> These are the offensive players that are available to be drafted, each at a different price and each with a different amount of points to be added
		to the overall team rating.
		(Defense)
		- Linebackers
		- Cornerbacks
		- Safeties
		--> These are the defensive players that are available to be drafted, each at a different price and each with a different amount of points to be added
		to the overall team rating.
12. Choose the play a game option to actually participate in a game against an AI opponent team.
	* In the beginning of the game, you will be asked to choose heads or tails for the coin toss, if you win, you get to decide whether to kickoff or receive
	the ball first. (Kickoff to give the ball away and play defense first; Receive to get the other team's kicked-off ball and play offense first).
	- When on offense, you will have 3 options:
		- Run
		- Short Pass
		- Long Pass
		--> Each of these options have a different risk level of failing and ruining the drive for the user, but come with different chances at getting rewarded
		with a large amount of yards and a step closer to the endzone.
	- When on defense, you will have 3 options:
		- Zone coverage
		- Man converage
		- Blitz
		--> Like offense, each of these options have a different risk of letting an offensive play slip by and let the opponent gain a massive amount of yards,
		but at the same time there are different chances at getting rewarded with a sack or even with an interception, which can completely turn the game around
		for the user.
	== There will always be constant reminders for the user on what down they are and how many yards to go to convert the 1st down ==
	** Score is also updated every time the user or opponent scores and after every quarter. **

13. Win the game by working your way up to the PandaBowl and beating the hardest team in the division!
