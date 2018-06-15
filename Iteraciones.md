# Taller Programacion UNdeC 2018
## Iteraciones

### Iteración 1
**Objetivo:** Entender el proceso de hacer pasar Test sencillos.

**Escenario:** Código fuente con errores intencionales (corregirlos), y Test que deben ser aprobados.

### Iteración 2
**Objetivo:** Entender el proceso de crear código fuente a partir de los Test.

**Escenario:** Test que deben ser aprobados, agregando el código fuente necesario.

               
### Iteración 3
**Objetivo:** Recibir nuevos requerimientos. Escribir Test para las nuevas clases.

**Escenario:** Indicar que por análisis, se sugiere extraer los atributos correspondientes al domicilio en el Estudiante, y los correspondientes a la materia en el Examen, a respectivas nuevas Clases. Escribir los Test que aseguren que:
* El Domicilio aparezca como "San Martín 123 (La Rioja)" (Atributos Calle - Numero - Provincia)
* La Materia aparezca en mayúsculas con formato "MATEMATICA - INGENIERIA EN SISTEMAS (Atributos Materia - Carrera)

### Iteración 4
**Objetivo:** Garantizar que sigan funcionando los Test existentes luego de la incorporacion de nuevas clases.

**Escenario:** Las nuevas clases originan que algunos Test fallen.

### Iteración 5
**Objetivo:** Refactorización del código generado

**Escenario:** Realizar una nueva ronda de refactorización para eliminar lo restante
* Reemplazar condicionales con polimorfismo _(¿Interfaces o clases Abstractas?)_
* Comentarios
* Nombres de variables y métodos no representativos
