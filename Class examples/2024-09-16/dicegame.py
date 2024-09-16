import random

def main():
    print("To win you must roll a 7")
    randNum = random.randint(1, 6) + random.randint(1, 6)
    print("You rolled a", randNum)
    if randNum == 7:
        print("You win!")
    else:
        print("Do you want to play again?")
        if input("Enter 'y' for yes: ") == 'y':
            main()
        else:
            print("Goodbye!")
            
main()
            
            