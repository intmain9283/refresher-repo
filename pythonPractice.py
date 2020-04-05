import os

#Hello World statements
print("Hello, world")
print("Hello, nurse")

#User input
favFood = input("What's your favorite food?: ")
print("Your favorite food is " + favFood)

#Variable declarations
age = 27
gamer = True
favGame = "XCOM 2"

#Function declarations
def introduction(age1, gamer1, favGame1):
	str = "Hi. I am {} years old."
	print(str.format(age1))
	
	if gamer1 == True:
		print("I am a gamer and my favorite game is " + favGame1)
		
introduction(age, gamer, favGame)
os.system("pause")