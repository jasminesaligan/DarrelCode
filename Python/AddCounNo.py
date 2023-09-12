a = int (input("Enter number: "))
b = 0

for sum in range(1, a) :
    b += sum
    total = b + a
if a > 0 :
    print ("the sum is:", total)
elif a == 0 :
    print("Zero")
else:
    print("Please input a positive number")