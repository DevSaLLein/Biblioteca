import csv as csv
import numpy
import matplotlib.pyplot as plt

file = open('text.csv')
reader = csv.reader(file)

dicionario = {}

count = 0

for x in reader:
    dicionario[count] = numpy.array_split(x, 1)
    count += 1

print(dicionario)