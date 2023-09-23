# Practical No. 3: Variables, Operators and Expressions
#   --------------------------------------------------------------------------------------------------
# 4 :-       Write a program to get change values in Quarter, Dimes, Nickels and Pennies, and calculate 
#      the value of change in Dollars. Consider Quarter = 0.25 $, Dimes = 0.10 $, Nickels = 0.05 $, and 
#      Penny = 0.01 $.
#   --------------------------------------------------------------------------------------------------

# Input the number of quarters, dimes, nickels, and pennies
quarters = int(input("Enter the number of quarters: "))
dimes = int(input("Enter the number of dimes: "))
nickels = int(input("Enter the number of nickels: "))
pennies = int(input("Enter the number of pennies: "))

# Calculate the total value in dollars
total_dollars = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01)

# Display the total value in dollars with two decimal places
print(f"The total value of change is ${total_dollars:.2f}")