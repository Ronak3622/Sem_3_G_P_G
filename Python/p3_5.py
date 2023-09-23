# Practical No. 3: Variables, Operators and Expressions
#   --------------------------------------------------------------------------------------------------
# 5 :- Write a program to find a maximum of given three numbers (Use ternary operator).
#   --------------------------------------------------------------------------------------------------

# Input three numbers
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
num3 = float(input("Enter the third number: "))

# Use ternary operator to find the maximum
max_num = (num1 if (num1 > num2 and num1 > num3) else (num2 if num2 > num3 else num3))

# Display the maximum number
print(f"The maximum number among {num1}, {num2}, and {num3} is {max_num}")