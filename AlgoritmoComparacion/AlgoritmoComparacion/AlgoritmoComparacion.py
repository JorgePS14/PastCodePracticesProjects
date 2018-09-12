def comp(lista, elemento):
    for element in lista:
        if elemento == element:
            return True

    return False


lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

print(comp(lista, 15))
