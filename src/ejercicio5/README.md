# Ejercicio 5 PMDM
En un almacén se guardan un conjunto de **bebidas**.

Estas bebidas son: **agua mineral** y **bebidas azucaradas** (coca-cola, fanta, etc). De las bebidas nos interesa saber su identificador (único para cada bebida), cantidad de litros, precio y marca.

Si es agua mineral nos interesa saber también el origen (manantial, un sitio o de donde sea).

Si es una bebida azucarada queremos saber el porcentaje que tiene de azúcar y si tiene o no alguna promoción (si la tiene tendrá un descuento del 10% en el precio).

En el almacén se guardan estas bebidas por estanterías. Tiene forma de matriz de tamaño máximo 5x5.

Las operaciones del almacén son las siguientes:

+ Agregar bebida: agrega la bebida en la primera posición libre. Si el identificador está repetido en alguna de las bebidas, no se agregará.
+ Eliminar bebida: dado un id, eliminar la bebida del almacén.
+ Mostrar bebida: se muestra por pantalla la información de cada bebida.
+ Calcular precio de todas las bebidas: calcula el precio total de todos los productos del almacén.
+ Calcular el precio total de una marca de bebida: dada una marca, calcular el precio total de esas bebidas.
+ Calcular el precio total de una columna de la estantería del almacén: dada una columna calcular el precio total de esas bebidas.

Todos los métodos para 'Calcular el precio' se tienen que llamar igual y sólo variar el número de parámetros que se reciben.