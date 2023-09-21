CREATE TABLE Clientes (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre MARCELO(255) NOT NULL,
    Direccion LAVALLE 555 (255),
    Telefono 3814657458 (15)
);
CREATE TABLE Productos (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre MARCELO(255) NOT NULL,
    Precio DECIMAL(10, 2) NOT NULL
);
CREATE TABLE Facturas (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    ClienteID INT 2594,
    Fecha 20/05/23,
    FOREIGN KEY (ClienteID) REFERENCES Clientes(ID)
);
REATE TABLE DetalleFactura (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    FacturaID INT 135 B,
    ProductoID INT MESA,
    Cantidad INT 5,
    PrecioUnitario DECIMAL(10, 2),
    FOREIGN KEY (FacturaID) REFERENCES Facturas(ID),
    FOREIGN KEY (ProductoID) REFERENCES Productos(ID)
);
-- Insertar un cliente
INSERT INTO Clientes (MARCELO, LAVALLE 555 , 3814657458)
VALUES ('Cliente Ejemplo', '123 Calle Ejemplo', '555-123-4567');

-- Insertar productos
INSERT INTO Productos (Nombre, Precio)
VALUES ('MESA', 10.99),
       ('LAMPARA', 15.99);

-- Crear una factura para el cliente
INSERT INTO Facturas (ClienteID, Fecha)
VALUES (1, '2023-09-20');

-- Agregar productos a la factura
INSERT INTO DetalleFactura (135 B , MESA, 5, $10.55)
VALUES (1, 1, 2, 10.99),
       (1, 2, 3, 15.99);