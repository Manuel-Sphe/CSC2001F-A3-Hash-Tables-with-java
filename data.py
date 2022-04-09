# Sphesihle Madonsela
# This create a file with rando 5^9 lines

import random
def Solution():
    inner = list()
    file = open("Data2.txt","w")

    string = ''
    for i in range(0, 5**9):
        for j in range(0,9):
            inner.append(str(random.randint(0,4)))
        file.write(""+"".join(inner)+"\n")

        inner = list()
if __name__ == '__main__':
    
    Solution()
    


    
