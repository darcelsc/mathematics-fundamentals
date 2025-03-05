import math

def calculate_area(shape):
    if shape == 'circle':
        radius = float(input('Enter the radius of the circle: '))
        area = math.pi * radius ** 2
    elif shape == 'square':
        side = float(input('Enter the length of a side of the square: '))
        area = side ** 2
    else:
        print('Invalid shape')
        return
    print(f'The area of the {shape} is {area}')

calculate_area('circle')