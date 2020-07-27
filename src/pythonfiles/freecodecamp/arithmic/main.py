# This entrypoint file to be used in development. Start by reading README.md
from pythonfiles.freecodecamp.arithmic.arithmetic_arranger import arithmetic_arranger
from unittest import main


#print(arithmetic_arranger(["32 + 698", "3801 - 2", "45 + 43", "123 + 49"]))

def calc(val1, val2, math):

    if (math == '-'):
        return int(val1)- int(val2)
    elif (math == '+'):
        return int(val1)+ int(val2)
    elif (math == '/'):
        return int(val1)  / int(val2)
    elif (math == '*'):
        return int(val1) * int(val2)

v = ["32 + 698", "3801 - 2", "45 + 43", "123 + 49"]

x = v[0].split(' ')

if (x[0] > x[2]):
    print (x[0])
    print (x[1] + ' ' + x[2])
    print ('____' )
    print ( calc(x[0], x[2], x[1]))
elif (x[2] > x[0]):
    print (' ' + x[2])
    print (x[1] + ' ' + x[0])
    print ('____')
    print ( calc(x[0], x[2], x[1]))


# Run unit tests automatically
#main(module='test_module', exit=False)