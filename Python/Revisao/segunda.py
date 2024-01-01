import matplotlib.pyplot as plt

x = int(input('digite o X: '))
y = int(input('digite o Y:'))

plt.grid()
plt.plot(x, y, marker='o')
plt.show()