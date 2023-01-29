# Artes, Francesca Q.
# BSCpE 1-1
# This program calcuates the Distance Traveled in each hour of the time period.
# PYTHON

def main():
    print("This program calcuates the Distance Traveled in each hour of the time period.")
    print(" ")

    speed = int(input("What is the speed of your vehicle in mph? "))
    time = int(input("How many hours did you traveled? "))

    print(" ")
    showDistanceTraveled(speed, time)

def showDistanceTraveled(speed, time):
    print("Hour\t\tDistance Traveled")
    print("---------------------------------")
    for hours in range(1, time+1):
        distance = speed * (hours)
        print(str(hours), "\t\t", str(distance))

main()