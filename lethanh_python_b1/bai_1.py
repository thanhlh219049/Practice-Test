try:
    n = int(input("Nhap n: "))
    if n <= 0:
        exit()
except:
    print("Nhap so tu nhien")
    exit()
a = []
for i in range(n):
    a.append(input("Nhap so thu %d: " % (i+1)))
print(a)
max = a[0]
for i in range(len(a)):
    if max < a[i]:
        max = a[i]
print("so lon nhat trong day la: ",max)
