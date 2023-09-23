# Practical No. 3: Variables, Operators and Expressions
#   --------------------------------------------------------------------------------------------------
# 8 :- Write a program to determine the length of ladder required to reach a given height when leaned against
#     the house. The height and the angle of the ladder are given as inputs (Use math Library).
#   --------------------------------------------------------------------------------------------------

import math

# Input the height of the house in feet
height_of_house = float(input("Enter the height of the house (in feet): "))

# Input the angle of the ladder in degrees
angle_of_ladder_degrees = float(input("Enter the angle of the ladder (in degrees): "))

# Convert the angle from degrees to radians
angle_of_ladder_radians = math.radians(angle_of_ladder_degrees)

# Calculate the length of the ladder using trigonometry (hypotenuse of a right triangle)
ladder_length = height_of_house / math.sin(angle_of_ladder_radians)

# Display the length of the ladder required
print(f"The length of the ladder required to reach {height_of_house} feet is {ladder_length:.2f} feet.")
