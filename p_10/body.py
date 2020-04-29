import sys
import os

def checkArg(inputPath):
        print("Input path")
        print(inputPath)
        print(os.environ.get('PATH'))

        print("Currently Looknig for: " + inputPath[1])
        searchValue = inputPath[1]
        PATH = os.environ.get('PATH')
        dirs = PATH.split(';')
        for i in range(0,dirs.__len__()-1):
            testPath = os.path.join(dirs[i],searchValue)
            print(testPath)
            if os.path.exists(testPath):
                print("true")
            #os.chdir(dirs[i])
            #children = os.getcwd()
            #print(children)
            #for j in range(0,children.__len__()-1):
            #    print(children[j])
            #if()
            #print(dirs[i])

pathSearch = sys.argv
checkArg(pathSearch)