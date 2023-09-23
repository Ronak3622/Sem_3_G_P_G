# Practical No. 3: Variables, Operators and Expressions
#   --------------------------------------------------------------------------------------------------
# Write a program to calculate area and volume of Sphere.
#          -----------------------------------------------------------------------------------
#                                               2
#                         Area of Sphere = 4 π r
#          -----------------------------------------------------------------------------------
#                                                   3
#                         Volume of Sphere =  4  π r
#                                            ---
#                                             3
#   --------------------------------------------------------------------------------------------------

import math

def calculate_sphere_area(radius):
    return 4 * math.pi * radius ** 2

def calculate_sphere_volume(radius):
    return (4/3) * math.pi * radius ** 3

# Input radius from the user
radius = float(input("Enter the radius of the sphere: "))

# Calculate area and volume
area = calculate_sphere_area(radius)
volume = calculate_sphere_volume(radius)

# Display the results
print(f"Surface Area of the Sphere: {area:.2f} square units")
print(f"Volume of the Sphere: {volume:.2f} cubic units")