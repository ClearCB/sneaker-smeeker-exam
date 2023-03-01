# Errores examen 20 02 2023 (Sneaker Raffle)

Esta es la solucion que he considerado para el examen realizado el dia 20-03-2023. Después de finalizarlo, quiero corregirlo, finalizarlo y explicar el por qué creo que podría haber entregado un examen mucho mejor estructurado. La causa de que no haya podido realizarlo de manera "cómoda" es por la presión del tiempo y por no haber sabido tomarme un poco más con calma el mismo.

Estas "pegas" las escribo antes de corregir mi propio examen, con un vago recuerdo del mismo en mi cabeza...recuerdo qué cosas me habría gustado mejorar o hacer de otra manera, para en el momento que corrija el examen, ver si realmente estaba tan equivocado o simplemente me autosugestioné.

Mi miedo antes de hacer el examen era perder el tiempo en alguna tontería o no llegar a completarlo. Desde hace mucho tiempo sabía que el "tiempo" era mi mayor enemigo en este ejercicio...y así fue.

## Objetivo

Con esta segunda vista al examen, voy a hacerlo de la siguiente manera:

* Primero voy a corregir todos los "errores" que identifique en una primera instancia
* Después voy a finalizar el examen
* Por último voy a actualizar los errores que escribiré a continuación para finalizar este ejercicio.

## A mejorar

### Gestión del tiempo / nervios

Lo que considero que peor hice el día del examen, fue la gestión de mi tiempo, de la presión y de los nervios. A pesar de ser una persona que suele tener todo esto bajo control, me dejé llevar demasiado por la tensión del momento...queriendo demostrar de lo que era capaz y consiguiendo así un resultado contraproducente para mi examen.

### Maven / gitignore

Normalmente siempre que empezaba un nuevo examen, lo primero que hacía era configurar el proyecto, gitignore y pom. En cambio, por lo comentado anteriormente (nervios) no lo hice en este orden, quería completar el examen lo antes posible para poder concentrarme en otras cosas... y fue un error por mi parte.

### Git

En primer lugar, me habría gustado trabajar en dos ramas. Por si en algun momento, tengo algun error, poder hacer un "back-up" de manera más accesible.

Los commits, a pesar de estar en mi opinión bien realizados, o al menos eso creo. Si que es cierto que los dos ultimos, ya que había prisa y estaba nervioso...decidí escribir cualquier cosa.

También me habría gustado, indicar cada caso test y la nueva funcionalidad por separado. Pero debido a que un día se nos indicó que no era "necesario" los hice en el mismo commit. Intenté seguir la TDD en todo momento, y si en algun punto no fui 100% fiel... fue por los nervios.

### Visibilidad

En todo momento en el examen, estuve pensando en la visibilidad de los atributos. Sin embargo, por la manera en la cual trabajé en según que ocasiones en el examen... decidí sacrificar dicha caracteristica para poder avanzar más rapido sin tener que pararme a valorar qué era "private", "protected"...

Por ejemplo, para la clase "Entry" decidí mantener todos los métodos con visibilidad "public" para evitar que en algún momento me de error de falta de visibilidad.

### Paquetes

Si bien es cierto que no creo que esten del todo mal organizados. Si que me habría poder haber dedicado más tiempo a organizar los paquetes de manera adecuada.

### Estructura de datos

En un principio, consideré que lo más adecuado para poder realizar la clase "bucket" era utilizar un HashMap porque no permite duplicados, pero nos ayuda a acceder de manera rápida a los datos. Debido a un comentario que encontré en el main, decidí guardar "email" como clave y "payment" como valor, ya que esta era la manera de identificar a cada "entry" de manera independiente...

Sin embargo, complicaba un poco más el acceso a todos los datos de una "entry" en concreto.

Pero posteriormente analizando un poco si que creo que un HashSet o algo similar se habría adaptado mejor a las necesidades de la aplicación, facilitando así al acceso a los datos y pudiendo realizar más cómodamente el resto del examen.

### Código limpio

Respecto a la "limpieza" del código, he revisado y hay algun import que no pude quitar, porque en la entrega del examen tuve que comentar una parte incompleta...y debido al tiempo, y los nervios...no pude quitarlos.

Además de esto, también me habría gustado añadir algun comentario, para facilitar la lectura y "estructurar" mejor el código.

### Streams

Me faltó el uso de streams ya que mi principal "miedo" al usarlos era perder demasiado tiempo en intentar implementarlos... los intenté dejar para una vez resuelto el examen, poder cambiar los bucles por los mismo y consiguiendo así gracias a la TDD, el mismo resultado refactorizando el código sin problema.

No por la falta de entendimiento de los mismos, pero si por falta de práctica y familiarización con esta estructura de datos.

### Optional

El uso de Optional me quedó nada para poder completarlo, ya que en la penúltima historia de usuario era "necesario" para continuar, pero por falta de tiempo no conseguí el resultado esperado y tuve que comentar lo que tenía para poder entregar un producto viable.

### Operador ternario

También dejé a medias el uso de un operador ternario, con el cual poder demostrar que entiendo el uso del mismo y que lo tenía presente.

### HashCode

El "@override" que hice sobre el método "hashcode" y "equals" fue incorrecto, ya que debería de haber enfocado el método hashcode que comparase "email" y "payment" consiguiendo así simplificar ambos métodos.

### TDD

Considero que esta parte lo hice correctamente, pero si que podría haber eliminado el test base que Maven crea por nosotros. Así como poder variar y extenderme un poco más en los casos ejemplo que utilicé para comprobar que las funcionalidades de mi aplicación estaban correctas.