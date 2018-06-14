# Taller Programacion UNdeC 2018
## Iteraciones

### Iteración 1
**Objetivo:** Entender el proceso de hacer pasar Test sencillos.

**Escenario:** Código fuente con errores intencionales, y Test que deben ser aprobados.

### Iteración 2
**Objetivo:** Entender el proceso de crear código fuente a partir de los Test.

**Escenario:** Test que deben ser aprobados, agregando el código fuente necesario.

//TO-DO: Hacer mas test para darles en la segunda iteración
               
### Iteración 3
**Objetivo:** Recibir nuevos requerimientos, e incorporarlos al código.

**Escenario:** Indicar que por análisis, se sugiere extraer los atributos correspondientes al domicilio en el Estudiante, y los correspondientes a la materia en el Examen, a respectivas nuevas Clases.
Garantizar que sigan funcionando los Test con las modificaciones necesarias.

**_Nota:_** Intentar que lo hagan desde el Test, y no desde el código fuente.

### Iteración 4
**Objetivo:** Escribir Test para las nuevas clases.

**Escenario:** Escribir los Test que aseguren que:
* El Domicilio aparezca como "San Martín 123 (La Rioja)"
* La Materia aparezca en mayúsculas con formato "MATEMATICA - ING. EN SISTEMAS".

### Iteración 4
**Objetivo:** Refactorización del código generado

**Escenario:** Realizar una nueva ronda de refactorización para eliminar lo restante
* Reemplazar condicionales con polimorfismo _(¿Interfaces o clases Abstractas?)_
* Comentarios
* Nombres de variables y métodos no representativos
