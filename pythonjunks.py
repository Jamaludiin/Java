

def greet(name):  # Subprogram definition (header + body)
    print(f"Hello, {name}!")  # Actions

greet("Alice")  # Subprogram call (explicit request)
print("Program continues...")  # Control resumes here after the function finishes



def pass_by_value_result(params):
    params[0] += 10  # Modify local copy
    params[1] += 20  # Modify local copy

values = [1, 2]  # Mimic variables passed by value
pass_by_value_result(values)
print(values)  # Output: [11, 22]

