# Taller Programacion UNdeC 2018
## Iteraciones

### Iteraci�n 1
**Objetivo:** Entender el proceso de hacer pasar Test sencillos.

**Escenario:** C�digo fuente con errores intencionales (corregirlos), y Test que deben ser aprobados.

### Iteraci�n 2
**Objetivo:** Entender el proceso de crear c�digo fuente a partir de los Test.

**Escenario:** Test que deben ser aprobados, agregando el c�digo fuente necesario.

               
### Iteraci�n 3
**Objetivo:** Recibir nuevos requerimientos. Escribir Test para las nuevas clases.

**Escenario:** Indicar que por an�lisis, se sugiere extraer los atributos correspondientes al domicilio en el Estudiante, y los correspondientes a la materia en el Examen, a respectivas nuevas Clases. Escribir los Test que aseguren que:
* El Domicilio aparezca como "San Mart�n 123 (La Rioja)" (Atributos Calle - Numero - Provincia)
* La Materia aparezca en may�sculas con formato "MATEMATICA - INGENIERIA EN SISTEMAS (Atributos Materia - Carrera)

### Iteraci�n 4
**Objetivo:** Garantizar que sigan funcionando los Test existentes luego de la incorporacion de nuevas clases.

**Escenario:** Las nuevas clases originan que algunos Test fallen.

### Iteraci�n 5
**Objetivo:** Refactorizaci�n del c�digo generado

**Escenario:** Realizar una nueva ronda de refactorizaci�n para eliminar lo restante
* Reemplazar condicionales con polimorfismo _(�Interfaces o clases Abstractas?)_
* Comentarios
* Nombres de variables y m�todos no representativos
