CREATE TABLE `clientes` (
  `id` BIGINT NOT NULL,
  `nombre` VARCHAR(50),
  `apellido` VARCHAR(50),
  `email` VARCHAR(50),
  CONSTRAINT `pk_clientes` PRIMARY KEY (`id`)
);

CREATE TABLE `productos` (
  `productoid` BIGINT NOT NULL,
  `nombre` VARCHAR(50),
  `precio` BIGINT,
  `stock` BIGINT,
  CONSTRAINT `pk_productos` PRIMARY KEY (`productoid`)
);

CREATE TABLE `pedidos` (
  `pedidoid` BIGINT NOT NULL,
  `clienteid` BIGINT,
  `productoid` BIGINT,
  `cantidad` BIGINT,
  `fecha` DATETIME,
  CONSTRAINT `pk_pedidos` PRIMARY KEY (`pedidoid`)
);

CREATE TABLE `tablapivot` (
  `categor_a` VARCHAR(50) NOT NULL,
  `enero` BIGINT,
  `febrero` BIGINT,
  `marzo` BIGINT,
  CONSTRAINT `pk_tablapivot` PRIMARY KEY (`categor_a`)
);

INSERT INTO `clientes` (`id`, `nombre`, `apellido`, `email`) VALUES (1, 'Juan', 'Pérez', 'juan@email.com');
INSERT INTO `clientes` (`id`, `nombre`, `apellido`, `email`) VALUES (2, 'Ana', 'López', 'ana@email.com');
INSERT INTO `clientes` (`id`, `nombre`, `apellido`, `email`) VALUES (3, 'Carlos', 'Ramírez', 'carlos@email.com');

INSERT INTO `productos` (`productoid`, `nombre`, `precio`, `stock`) VALUES (101, 'Camisa', 250, 50);
INSERT INTO `productos` (`productoid`, `nombre`, `precio`, `stock`) VALUES (102, 'Pantalón', 400, 30);
INSERT INTO `productos` (`productoid`, `nombre`, `precio`, `stock`) VALUES (103, 'Zapatos', 600, 20);

INSERT INTO `pedidos` (`pedidoid`, `clienteid`, `productoid`, `cantidad`, `fecha`) VALUES (1001, 1, 101, 2, '2025-08-01 00:00:00');
INSERT INTO `pedidos` (`pedidoid`, `clienteid`, `productoid`, `cantidad`, `fecha`) VALUES (1002, 2, 103, 1, '2025-08-02 00:00:00');
INSERT INTO `pedidos` (`pedidoid`, `clienteid`, `productoid`, `cantidad`, `fecha`) VALUES (1003, 3, 102, 3, '2025-08-03 00:00:00');

INSERT INTO `tablapivot` (`categor_a`, `enero`, `febrero`, `marzo`) VALUES ('Camisas', 10, 12, 8);
INSERT INTO `tablapivot` (`categor_a`, `enero`, `febrero`, `marzo`) VALUES ('Pantalón', 5, 7, 6);
INSERT INTO `tablapivot` (`categor_a`, `enero`, `febrero`, `marzo`) VALUES ('Zapatos', 3, 2, 4);

