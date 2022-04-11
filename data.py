# Sphesihle Madonsela
# This create a file with rando 5^9 lines
        
def main():
    
    data = [0,1,2,3,4]
    
    file = open("InputFile.txt",'w')
    
    string = ''
    for n1 in data:
        for n2 in data:
            for n3 in data:
                for n4 in data:
                    for n5 in data:
                        for n6 in data:
                            for n7 in data:
                                for n8 in data:
                                    for n9 in data:
                                        string += str(n1) +str(n2) + str(n3) + str(n4)+ str(n5) + str(n6)+str(n7) + str(n8) + str(n9) 
                                        file.write(string+'\n') # write doesn't have a newline char
                                        string =''
                                        
    print("All Possible combinations are in the InputFile.txt")
 
                                        
if __name__ == '__main__':
    
    # stores the data in a text file 
    main()    
    


    
