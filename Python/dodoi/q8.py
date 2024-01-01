nums = [0, 0, 0, 0, 0]

count = 0
while count < 5:
    nums[count] = int(input('Digite um número: '))
    count += 1

print('O maior número informado é igual à: ', max(nums))