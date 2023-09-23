# Practical No. 3: Variables, Operators and Expressions
#   --------------------------------------------------------------------------------------------------
# 2 :- Write a program to compute the slope of a line between two points (x1,y1) and (x2,y2).
#        ---------------------------------------------------------------------------------------
#                                        Slope = y2-y1
#                                               -------
#                                                x2-x1
#   --------------------------------------------------------------------------------------------------

x1 = float(input("Enter x1: "))
y1 = float(input("Enter y1: "))
x2 = float(input("Enter x2: "))
y2 = float(input("Enter y2: "))
slope = (y2 - y1) / (x2 - x1)
print(f"The slope of the line between ({x1}, {y1}) and ({x2}, {y2}) is {slope}")