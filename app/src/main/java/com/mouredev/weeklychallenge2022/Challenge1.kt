package com.mouredev.weeklychallenge2022

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */

"""solucion  del reto 1 con el lenguaje python"""

def Anagrama(string1 , string2):
    return sorted(string1)==sorted(string2)

string1= input("escribe una primera palabra : ")
string2= input("escribe una segunda palabra : ")
string3= string1.lower()
string4= string2.lower()
print(Anagrama(string3, string4))
