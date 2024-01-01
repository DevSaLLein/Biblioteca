import matplotlib.pyplot as plt
import numpy
import csv

file = open('file.csv');
reader = csv.reader(file);
array = ['','','', '','','','','',''];

i = 0

for x in reader:
    array[i] = numpy.array_split(x, 1)
    i += 1
   #x.array_split(x, 2);

i = 0
for x in array:
    print(array[i])

    i+= 1
#plt.grid();
#plt.scatter(x, y);
#plt.show();