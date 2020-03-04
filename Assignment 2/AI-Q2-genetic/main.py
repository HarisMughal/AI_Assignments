import copy

import numpy
from random import randint, seed, sample, shuffle

list1 = list()
list0 = list()


from numpy import argsort


def fitness(l0,l1,num):
    attackingPair = [0] *4
    for v in range(0,4 ):
        for i in range(0,num):
            for j in range(i+1,num):
                if(l0[v][i] == l0[v][j]):
                    l1[v][i] += 1
                    attackingPair[v] +=1
            k = i +1
            l = 1
            while(k < num and l < num ):
                if(l0[v][k] == l0[v][i]+l):
                    l1[v][i] += 1
                    attackingPair[v] += 1
                l+=1
                k+=1
            k=i+1
            l = 1
            while (k < num  and l < num):
                if (l0[v][k] == l0[v][i] -l ):
                    l1[v][i] += 1
                    attackingPair[v] += 1
                l += 1
                k += 1

    return l1 ,attackingPair

def crossOver(l0,l1,num):
    i = 0
    j = num -1
    newChrome1 = [0]*num
    newChrome2 = [0]*num
    if(num % 2 ==0):
        while i < j :
            newChrome1[i]= l0[i] # placing first elements of parent 1 in new gen
            newChrome1[j] = l1[j] # placing last elements of parent 2 in new gen

            newChrome2[j] = l0[j]
            newChrome2[i] = l1[i]
            j-=1
            i+=1
    else:
        while i < j:
            newChrome1[i] = l0[i]
            newChrome1[j] = l1[j]

            newChrome2[j] = l0[j]
            newChrome2[i] = l1[i]
            j -= 1
            i += 1
        newChrome1.insert(int(num/2), l0[int(num/2)])
        # newChrome1.insert(num/2, l1[num/2])

        # newChrome2.insert(num/2, l0[i])
        newChrome2.insert(int(num/2), l1[int(num/2)])

    ## fitness
    rang = [0]*8
    rang1 = [0] * 8
    newChrome1[randint(0, num-1)] = randint(0, num-1);
    newChrome2[randint(0, num - 1)] = randint(0, num - 1);
    for i in range(0,num):
        if( newChrome1[i] < 9):
            rang[newChrome1[i]] += 1
            if rang[newChrome1[i]] >= 2:
                newChrome1[i] = randint(0,num-1)
                break
    for i in range(0, 4):
        if (newChrome1[i] < 9):
            rang1[newChrome2[i]] += 1
            if rang1[newChrome2[i]] >= 2:
                newChrome2[i] = randint(0, num-1)
                break
        # if(newChrome2 == newChrome1):
        #     shuffle(newChrome1)
    return newChrome1 , newChrome2


numberOfQueen = int (input("Input number of Queens ")) # input number
if (numberOfQueen > 3):
    # list2 = list()
    # list3 = list()
    for i in range(0,4): # radom numbers
        list0.insert(i,sample(range(0, numberOfQueen),numberOfQueen))
        list1.insert(i,[0]*numberOfQueen)
        # list1.append(randint(0,numberOfQueen - 1))
        # list2.append(randint(0, numberOfQueen - 1))
        # list3.append(randint(0, numberOfQueen - 1))
    # list0 = [[3, 2, 1, 0], [2, 3, 0, 1], [2, 0, 3, 1], [2, 1, 0, 3]]
    print("Printing initial gens----------\n",list0)
    temp = copy.deepcopy(list1)

    # list1[0][1] = 1
    # list1[1][2]= 3
    # print(list1)
    # print(list2)
    # print(list3)
    # [ 1,2,3] , [1,2,4] }
    while(True):
        # for z in range (0,10):
        attackinPairs ,attackingList = fitness(list0,temp,numberOfQueen)
        index = numpy.argsort(attackingList)
        print("Posible attacks in gens--------\n",attackingList)
        print("Number of attacking in each gen  -----:")
        for x in range(0,4):
            print(attackinPairs[index[x]])

        if 0 in attackingList :
            break
        # print(index)
        list0[index[0]], list0[index[3]] = crossOver(list0[index[0]],list0[index[1]],numberOfQueen)
        list0[index[1]], list0[index[2]] = crossOver(list0[index[1]],list0[index[2]],numberOfQueen)
        # for x in range (0,4):
        #     for y in range(i+1 , 4):
        #         if(list0[i] == list0[y]):
        #             list0[i] = shuffle(list0[i])
        print("After crossover---",list0)
        temp = copy.deepcopy(list1)
        # list1.clear()
    print("Possible solutions--------")
    for i in range (0,4):
        if(0 == attackingList[i] ):
            print(list0[i])

    # print("-------\n\n",crossOver([1,2,3,0],[2,3,4,0],numberOfQueen))
else:
    print("invalid number of queens")




