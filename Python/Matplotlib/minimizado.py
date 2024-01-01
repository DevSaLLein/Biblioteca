import numpy as np
import matplotlib.pyplot as plt

x = int(input('Digite um número:'))
y = int(input('Digite outro número:'))


plt.grid()
plt.scatter(x, y);
plt.show();

from pylab import *

x = [0,2,-3,-1.5]
y = [0,3,1,-2.5]
color=['m','g','r','b']

grid()
scatter(x,y, s=100 ,marker='o', c=color)

show()