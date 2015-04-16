string1 = raw_input('Enter the first String: ')
string2 = raw_input('Enter the second String: ')

check = 0
final = 0
#first check to make sure strings are same length
if (len(string1) == len(string2)):
	#iterating through every letter of the first string
	for i in range(0, len(string1)):
		#got a match,
		if(string1[i] == string2[0]):
			final = i
			temp = 0
			check = 1
			#now check from this spot to end of first string
			for j in range(i, len(string1)-1):
				if(string1[j] != string2[temp]):
					check = 0
					break
				temp = temp + 1
			#All chars from beginning of second to # and spot to end of first match
			if(check == 1):
				temp2 = temp + 1
				#Check rest of second string against beginng to spot of first string
				for k in range(0, final-1):
					if (string1[k] != string2[temp2]):
						check = 0
						break
					temp2 = temp2 + 1

#if all the criteria was met, they are rotations
if (check == 1):
    print("Strings " + string1 + " and "+ string2 + " are rotations of each other")
    #if not the they aren't rotations
else:
    print("Strings " + string1 + " and "+ string2 + " are not rotations of each other")
