

CREATE DATABASE IF NOT EXISTS rentadora_cancun
    CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE rentadora_cancun;

CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    telefono VARCHAR(15),
    correo VARCHAR(100),
    numero_licencia VARCHAR(30) NOT NULL
);

CREATE TABLE vehiculos (
    id_vehiculo INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(30) NOT NULL,
    modelo VARCHAR(30) NOT NULL,
    anio INT NOT NULL,
    placas VARCHAR(10) NOT NULL UNIQUE,
    tipo VARCHAR(20) NOT NULL,
    transmision VARCHAR(20) NOT NULL,
    capacidad_pasajeros INT NOT NULL,
    precio_dia DECIMAL(10,2) NOT NULL,
    estado VARCHAR(20) NOT NULL
);

CREATE TABLE empleados (
    id_empleado INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    puesto VARCHAR(30) NOT NULL,
    telefono VARCHAR(15),
    usuario VARCHAR(50) NOT NULL UNIQUE,
    contrasena_hash VARCHAR(255) NOT NULL
);

-- Una reservacion solo se guarda despues de confirmar el anticipo.
CREATE TABLE reservaciones (
    id_reservacion INT AUTO_INCREMENT PRIMARY KEY,
    folio VARCHAR(20) NOT NULL UNIQUE,
    id_cliente INT NOT NULL,
    id_vehiculo INT NOT NULL,
    fecha_reservacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    costo_total DECIMAL(10,2) NOT NULL,
    monto_anticipo DECIMAL(10,2) NOT NULL,
    estado VARCHAR(20) NOT NULL DEFAULT 'confirmada',
    fecha_cancelacion DATETIME NULL,
    motivo_cancelacion VARCHAR(255) NULL,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
    FOREIGN KEY (id_vehiculo) REFERENCES vehiculos(id_vehiculo)
);

-- Se crea el dia de entrega, cuando el cliente paga el resto.
CREATE TABLE rentas (
    id_renta INT AUTO_INCREMENT PRIMARY KEY,
    id_reservacion INT NOT NULL UNIQUE,
    id_cliente INT NOT NULL,
    id_vehiculo INT NOT NULL,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    fecha_devolucion DATE NULL,
    costo_total DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (id_reservacion) REFERENCES reservaciones(id_reservacion),
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
    FOREIGN KEY (id_vehiculo) REFERENCES vehiculos(id_vehiculo)
);

-- Solo se registran pagos ya confirmados.
CREATE TABLE pagos (
    id_pago INT AUTO_INCREMENT PRIMARY KEY,
    id_reservacion INT NOT NULL,
    fecha_pago DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    monto DECIMAL(10,2) NOT NULL,
    tipo_pago ENUM('anticipo', 'liquidacion') NOT NULL,
    metodo_pago VARCHAR(20) NOT NULL,
    FOREIGN KEY (id_reservacion) REFERENCES reservaciones(id_reservacion),
    UNIQUE (id_reservacion, tipo_pago)
);

CREATE TABLE mantenimientos (
    id_mantenimiento INT AUTO_INCREMENT PRIMARY KEY,
    id_vehiculo INT NOT NULL,
    fecha DATE NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    costo DECIMAL(10,2) NOT NULL,
    estado VARCHAR(20) NOT NULL DEFAULT 'pendiente',
    FOREIGN KEY (id_vehiculo) REFERENCES vehiculos(id_vehiculo)
);
