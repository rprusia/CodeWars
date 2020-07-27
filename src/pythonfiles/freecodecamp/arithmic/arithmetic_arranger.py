def arithmetic_arranger(problems):



    # first put all problems into list, using split
    for problem in problems:

        if (len(problems) > 5):
            return 'Error: Too many problems.'

        currentList = problem.split(' ')
        if (not(str(currentList[0]).isdigit() and str(currentList[2]).isdigit())):

            return 'Error: Numbers must only contain digits'

        if not(currentList[1] == '+' or currentList[1] == '-'):
            return "Error: Operator must be '+' or '-' ."

        if (currentList[1] == '-'):
            currentList.append(int(currentList[0]) - int(currentList[2]))
        elif (currentList[1] == '+'):
            currentList.append(int(currentList[0]) + int(currentList[2]))

    # for problem in v:
    #
    #     if (problem.isdigit())
    #         listOfProblems = problem.split(' ')
    #         print (listOfProblems[0])
    #         print (listOfProblems[1] + ' ' + listOfProblems[2])
    #         print ('_____' )
    #         print ( calc(listOfProblems[0], listOfProblems[2], listOfProblems[1]))
    #         print('\n')


    arranged_problems = ' asldkfj'
    return arranged_problems