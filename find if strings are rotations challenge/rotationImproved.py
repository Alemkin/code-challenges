#Alexander Lemkin
string1 = raw_input('Enter the first String: ')
string2 = raw_input('Enter the second String: ')

check = 0
#first check to make sure strings are same length
if (len(string1) == len(string2)):
	#iterating through every letter of the first string
	for i in range(0, len(string1)):
		#word wrap search, check from index to end 
		if (string2.startswith(string1[i:])):
			#if that matched, check the final part of string2 from end and up string1
			if (string2.endswith(string1[:i])):
				check = 1;
				break;

#if all the criteria was met, they are rotations
if (check == 1):
    print("Strings " + string1 + " and "+ string2 + " are rotations of each other")
    #if not the they aren't rotations
else:
    print("Strings " + string1 + " and "+ string2 + " are not rotations of each other")