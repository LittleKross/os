# P-10

## CSCI - P436 | _Brandon Young_

### Source Code

```python
import sys
import os


def checkArg(inputPath):
    # print("Input path")
    # print(inputPath)
    # print(os.environ.get('PATH'))

    print("Currently Looknig for: " + inputPath[1])
    searchValue = inputPath[1]
    PATH = os.environ.get("PATH")
    dirs = PATH.split(";")
    for i in range(0, dirs.__len__() - 2):
        testPath = dirs[i]
        for folderName,subFolder,filenames in os.walk(testPath):
            # print('The current folder is ' + folderName)
            for filename in filenames:
                # print('FILE INSIDE ' + folderName + ': '+ filename)
                if filename == searchValue and folderName in PATH:#or (filename.split(".")[0])
                    print(folderName)
                    #print('')
        # os.chdir(dirs[i])
        # children = os.getcwd()
        # print(children)
        # for j in range(0,children.__len__()-1):
        #    print(children[j])
        # if()
        # print(dirs[i])

pathSearch = sys.argv
checkArg(pathSearch)
```

### Running the code

`python <filename>.py pwsh.exe`

### Program Output


>Currently Looknig for: pwsh.exe  
 C:\Program Files\PowerShell\7  
 C:\Program Files\PowerShell\7\

