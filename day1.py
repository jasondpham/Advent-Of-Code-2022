
def main():
    file = open('day1in', mode='r')

    currCal = 0
    maxCal = 0

    for line in file.readlines():
        
        if line == "\n":
            maxCal = max(maxCal, currCal)
            currCal = 0
        else:
            currCal += int(line)
    print(maxCal)

if  __name__ == "__main__":
    main()
