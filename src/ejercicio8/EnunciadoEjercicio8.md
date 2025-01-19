# Enunciado ejercicio 8
Escribe un programa que evalúe si un/a atleta ha superado correctamente una carrera de obstáculos:

+ La función recibirá dos parámetros:
    + Un array que sólo puede contener String con las palabras “correr" o “saltar“
    + Un String que represente la pista y sólo puede contener "_" (suelo) o "|" (valla)
+ La función imprimirá cómo ha finalizado la carrera:
    + Si el/a atleta hace “correr" en "_" (suelo) y “saltar" en "|" (valla) será correcto y no variará el símbolo de esa parte de la pista.
    + Si hace “saltar" en "_" (suelo), se variará el símbolo de la pista por "x".
    + Si hace “correr" en "|" (valla), se variará el símbolo de la pista por "/".
    + Cualquier otra combinación, se variará el símbolo de la pista por "?".
+ La función retornará un Boolean que indique si ha superado la carrera. Para ello tiene que realizar la opción correcta en cada tramo de la pista.

Probar con las siguientes expresiones:

    ["correr", "saltar", "correr", "saltar", "correr"] y "_|_|_"
    ["correr", "correr", "correr", "saltar", "correr"] y "_|_|_"
    ["correr", "correr", "saltar", "saltar", "correr"] y "_|_|_"
    ["correr", "correr", "saltar", "saltar", "correr"] y "_|_|_|_"
    ["correr", "saltar", "correr", "saltar"] y "_|_|_"
    ["correr", "saltar", "correr", "saltar", "correr", "saltar", "correr"] y "_|_|_"
    ["saltar", "saltar", "saltar", "saltar", "saltar"] y "|||||"
    ["saltar", "saltar", "saltar", "saltar", "saltar"] y "||_||"