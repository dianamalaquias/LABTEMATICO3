# Sistema de Control para Rentadora de Autos en Cancún

## Descripción
Este proyecto es una base de datos diseñada para manejar una agencia de renta de autos en Cancún.

El sistema sirve para llevar el registro de los clientes, los carros y los empleados de la agencia.
También permite controlar todo el proceso de alquiler: desde que un cliente hace una reservación,
hasta que se registra la renta por fechas y se guarda su pago. Además, agregamos una parte para llevar el control de los mantenimientos que se le hacen a cada vehículo.

## Alcance y Restricciones ##
Plataforma Web: Sistema exclusivamente web (sin app móvil).

Flujo Reserva vs. Renta: La web solo gestiona reservaciones. Pasa a "renta activa" de forma presencial tras validar la documentación y entregar la unidad.

Modelo de Pago: Requiere un pago parcial (15%) en línea para generar el folio. El 85% restante se liquida en sucursal.

Cierre de Contrato: La renta finaliza al devolver el vehículo, inspeccionarlo y registrar su reingreso (cambiando su estado a "Disponible" o "En Mantenimiento").


## Diagrama Entidad-Relación (DER)
A continuación se muestra el Diagrama Entidad-Relación (DER) de la base de datos generado en MySQL Workbench:
![rentadora_cancun](/docs/DIAGRAMA-RENTADORACANCUN.png)

##Colaboradores
* **Diana Patricia Malaquías Olivares** - GitHub: [@dianamalaquias](https://github.com/dianamalaquias)
* **Alberto Agustín Díaz Jiménez**  - GitHub: [@albertodiaz05](https://github.com/albertodiaz05)