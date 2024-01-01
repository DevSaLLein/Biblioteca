nums = [0, 0, 0, 0, 0]

count = 0
while count < 5:
    nums[count] = int(input('Digite um número: '))
    count += 1

soma = 0;
for x in range(0, len(nums), 1):
    soma += nums[x];

print('A soma é igual à:', soma)
print('A média é igual à: ', soma / len(nums))