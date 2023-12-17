# Keyword Argument :- 
def greet(name, greeting="Hello"):
    print(greeting, name)

greet(name="John") # This will print: Hello John
greet(greeting="Hi", name="John") # This will print: Hi John
