import math

def float_to_fraction (x, error=0.000001):
    n = int(math.floor(x))
    x -= n
    if x < error:
        return (n, 1)
    elif 1 - error < x:
        return (n+1, 1)

    # The lower fraction is 0/1
    lower_n = 0
    lower_d = 1
    # The upper fraction is 1/1
    upper_n = 1
    upper_d = 1
    while True:
        # The middle fraction is (lower_n + upper_n) / (lower_d + upper_d)
        middle_n = lower_n + upper_n
        middle_d = lower_d + upper_d
        # If x + error < middle
        if middle_d * (x + error) < middle_n:
            # middle is our new upper
            upper_n = middle_n
            upper_d = middle_d
        # Else If middle < x - error
        elif middle_n < (x - error) * middle_d:
            # middle is our new lower
            lower_n = middle_n
            lower_d = middle_d
        # Else middle is our best fraction
        else:
            return (n * middle_d + middle_n, middle_d)

m = []
m1 = []

for i in range (0,9):
	print('a' + str(i//3 + 1) + str((i%3) + 1) + '?')
	m.append(input())
	try:
		m[i] = float(m[i])
	except:
		m[i] = int(m[i][:m[i].find('/')]) / int(m[i][m[i].find('/') + 1:])
	
	if m[i] == int(m[i]):
		m1.append(int(m[i]))
	else:
		m1.append(str(str(list(float_to_fraction (m[i]))[0]) + "/" + str(list(float_to_fraction (m[i]))[1])))
	
print()

for i in range (0,3):
	print(str(m1[i*3]) + '   ' + str(m1[i*3 + 1]) + '   ' + str(m1[i*3 + 2]))

print()
print(m)
print()
print(m1)

