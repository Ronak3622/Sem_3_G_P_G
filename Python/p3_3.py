# Practical No. 3: Variables, Operators and Expressions
#   --------------------------------------------------------------------------------------------------
# 3 :- Write a program to calculate simple and compound interest.
#        -------------------------------------------------------------------------------------
#      Simple interest = P*R*T
#                       -------
#                         100
#        -------------------------------------------------------------------------------------
#                                         n*T
#      Compound Interest = P * ( 1 +  R  )
#                                   -----
#                                   100*n
#   --------------------------------------------------------------------------------------------------

P = float(input("Enter P: "))
R = float(input("Enter R: "))
T = float(input("Enter T: "))
Slope = (P*R*T) / 100
print('ans',Slope)