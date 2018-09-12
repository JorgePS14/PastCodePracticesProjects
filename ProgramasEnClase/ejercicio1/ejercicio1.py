

#Dados dos strings, checar si son anagramas; "Clint Eastwood" "Old west action"
def checkAnagram(sen1, sen2):

    sen1 = sen1.lower()
    sen2 = sen2.lower()

    sen1 = sen1.replace(' ', '')
    sen2 = sen2.replace(' ', '')
    
    print(sen1)
    print(sen2)
    
    list1 = list(sen1)
    list2 = list(sen2)
    
    list1.sort()
    list2.sort()
    
    
    print(list1)
    print(list2)
    
    pos = 0
    igual = True
    while (pos<len(list1) & igual):
            if list1[pos] == list2[pos]:
                pos+=1
            else:
                    igual = False
    print (igual)
    
checkAnagram("abcde", "bcDa e")