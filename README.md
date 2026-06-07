<h1 align="center">Bienvenid@ a Llanquihue Tour 👋</h1>
<p>
</p>

> Gestión de personal para Llanquihue Tour, siguiendo principios de Programación orientada a objetos, encapsulamiento,
> herencia, composición y excepciones personalizadas

## Estructura de Paquetes

**App**: Contiene la clase principal `Main` que instancia los objetos `Persona`, `Dirección`, `Empleado` y `RUT`.

**Model**: Contiene las clases `Persona`, `Dirección`, `Empleado` y `RUT`

* `Dirección` es una clase que representa la dirección de una `Persona` mediante composición en esta.
* `RUT` es la clase que representa la identidad gubernamental de `Persona` mediante composición en esta y aplica lógica
  para asegurarse que tenga el formato requerido, este debe
  ser escrito 7 a 8 caracteres, con guión y dígito verificador.
* `Persona` Clase base que alberga los datos de una persona.
* `Empleado` Clase hija de `Persona`, Si una persona es empleada en Llanquihue Tour se agrega su puesto y turno.

## Ejecución

Para ejecución del proyecto se recomienda usar el comando de ejecución `Ctrl + F5` y requiere tener instalado Java JDK y
un IDE compatible.

## Author

👤 **Matías Rivas Gallardo**

* Github: [@Dageti](https://github.com/Dageti)
* LinkedIn: [@Matias Rivas Gallardo](https://linkedin.com/in/matias-rivas-gallardo\/)

***
_This README was generated with ❤️ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_