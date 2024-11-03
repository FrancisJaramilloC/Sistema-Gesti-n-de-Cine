# Sistema de Gestión de Cine

## Descripción del Proyecto

Este proyecto es un sistema de gestión de cine desarrollado como parte de una asignación en la Universidad Nacional de Loja, en la Facultad de Energía, las Industrias y los Recursos Naturales No Renovables, para la carrera de Computación. Los estudiantes del tercer ciclo, organizados en grupos, recibieron esta tarea con el objetivo de aplicar sus conocimientos en un entorno real. El sistema busca gestionar la cartelera de películas, las reservas y ventas de boletos, así como el control de roles y cuentas de usuario en un cine. 

## Problemática

Al diseñar este sistema, se analizaron y discutieron las principales problemáticas y retos que enfrentaríamos al desarrollar una solución que fuera funcional, intuitiva y eficiente para su implementación en un cine. Esto incluyó definir las funcionalidades de cada módulo y considerar las restricciones de nuestro entorno de trabajo y el alcance académico del proyecto.

## Objetivos

1. Facilitar la administración de la cartelera de películas y la programación de funciones.
2. Implementar un sistema de autenticación y gestión de cuentas para asegurar el acceso adecuado a las funcionalidades.
3. Gestionar las reservas y asignación de asientos para optimizar la experiencia del usuario.
4. Organizar las clases y la estructura del sistema siguiendo el enfoque de TDA (Tipos Abstractos de Datos) para mejorar la modularidad y mantenimiento del código.

## Diseño de Clases (TDA)

El sistema está estructurado en varios módulos, cada uno con una clase específica para representar entidades clave en un cine:

- **Clase `Cuenta`**: Administra las cuentas de usuario, incluyendo autenticación y control de accesos.
- **Clase `Rol`**: Define los roles de los usuarios para diferenciar sus permisos en el sistema.
- **Clase `Persona`**: Clase base de la cual heredan otros roles específicos como `Empleado`.
- **Clase `Empleado`**: Hereda de `Persona` y agrega atributos específicos para los empleados del cine.
- **Clase `Boleto`**: Representa los boletos emitidos, vinculados a una persona que hace la compra.
- **Clase `Reserva`**: Administra la información sobre las reservas de asientos y compra de boletos.
- **Clase `Función`**: Define las funciones de películas que se transmitirán en una sala de cine.
- **Clase `Sala`**: Representa cada sala dentro del cine y se relaciona con las clases `Asiento` y `Función`.
- **Clase `Asiento`**: Define la disposición de asientos en una sala específica.
- **Clase `Pelicula`**: Contiene los atributos de cada película, como duración y clasificación.
- **Clase `Cartelera`**: Agrega todas las películas disponibles para mostrar al público.

Esta estructura modular permite gestionar de manera eficaz cada aspecto operativo del cine, desde la programación de funciones hasta la emisión de boletos y la organización de roles. La organización en clases facilita la escalabilidad y el mantenimiento del código, además de mejorar la claridad y la cohesión del sistema.


                                                                      TDA
                              
                                    ![WhatsApp Image 2024-10-29 at 11 13 19](https://github.com/user-attachments/assets/69ae0e8a-9cee-4f71-8f16-853aac06551e) 
(⁠｡｡⁠)V 1.0.0.0

