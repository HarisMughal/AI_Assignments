import copy

import numpy
from random import randint, seed, sample, shuffle
#
# print("hello bilal")
# x = 10
# print(x)
# x = "hi"
# print(x)
#
# for i in range(0,50):
#     if i % 2 == 0:
#         print(i)
#     elif i% 2 != 0:
#         print("odd")
#     else:
#         print("Unknown")
#
# list1 = list()

list1 = [6,7,1,2,4]
# print(list1)
#
# list1.sort()
print(list1)

index = numpy.argsort(list1)

print(index)

for i in index:
    print(list1[i])



