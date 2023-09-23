# Practical No. 3: Variables, Operators and Expressions
#   --------------------------------------------------------------------------------------------------
# 1 :- Write a program to convert temperature from Celsius to Fahrenheit. Equaton to convert Celsius 
#      to Fahrenheit:
#        --------------------------------------------------------------------------------------
# F = (9/5) * C + 32
#   --------------------------------------------------------------------------------------------------

celsius = float(input("Enter temperature in Celsius: "))
fahrenheit = (celsius * 9/5) + 32
print(f"{celsius} degrees Celsius is equal to {fahrenheit} degrees Fahrenheit.")