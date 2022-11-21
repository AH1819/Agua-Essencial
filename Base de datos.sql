create table usuario (
id_usuario serial primary key,
nombre varchar,
apellido_p varchar,
apellido_m varchar,
usuario varchar,
password varchar,
telefono varchar,
status varchar
)
create table empleados(
id_empleado serial primary key,
rol varchar,
nombre varchar,
apellido_p varchar,
apellido_m varchar,
int edad
)
create table clientes(
id_cliente serial primary key,
nombre varchar,
apellido_p varchar,
apellido_m varchar,
colonia varchar,
calle varchar,
manzana varchar,
lote varchar
)
create table dias(
id_dia serial,
dia varchar
)
create table mes(
id_mes serial,
mes varchar
)
create table agenda(
id_agenda serial,
id_cliente int,
id_dia int,
id_mes int
)
create table proveedores(
id_proveedor serial primary key,
nombre varchar,
razon_social varchar,
telefono varchar,
email varchar,
direccion varchar,
categoria vrachar
);
create table materia_prima(
id_materia serial primary key not null,
id_proveedor int references proveedores not null,
descripcion varchar not null,
estado varchar default 'En stock'
);
create table productos(
id_producto serial primary key not null,
id_proveedor int references proveedores not null,
descripcion varchar not null,
estado varchar default 'En stock'
);
create table entrada_productos(
id_entrada serial primary key not null,
id_producto int references productos not null,
id_factura varchar default 'Sin factura',
fecha date not null,
cantidad int not null,
precio_compra float not null,
);
create table salida_productos(
id_salida serial primary key not null,
id_producto int references productos not null,
fecha date not null,
concepto varchar not null,
cantidad int not null
);
create table entrada_materiaprim(
id_entrada_mat serial primary key not null,
id_materia int references materia_prima not null,
id_factura_mat varchar default 'Sin factura',
fecha date not null,
cantidad float not null,
precio_compra_mat float not null
);
create table salida_materiaprim(
id_salida_mat serial primary key not null,
id_materia int references materia_prima not null,
fecha date not null,
concepto varchar not null,
cantidad float not null
);
create table inventario_productos(
inv_prod_codigo int primary key not null,
inv_entradas int default 0,
inv_salidas int default 0,
inv_stock int default 0
);
create table inventario_materiaprim(
inv_prod_codigoint primary key not null,
inv_entradas int default 0,
inv_salidas int default 0,
inv_stock int default 0
);

-----
CREATE OR REPLACE FUNCTION inv_productos() RETURNS TRIGGER AS $inv_productos$
BEGIN
UPDATE inventario_productos 
SET inv_stock = inv_stock+NEW.cantidad, inv_entradas = inv_entradas+NEW.cantidad 
where inv_prod_codigo = NEW.id_producto;
RETURN new;
END;
$inv_productos$ LANGUAGE plpgsql;
CREATE TRIGGER INVENTARIO_AI AFTER INSERT ON entrada_productos 
FOR EACH ROW EXECUTE PROCEDURE inv_productos();
-----

-----
CREATE OR REPLACE FUNCTION inv_materiaprim() RETURNS TRIGGER AS $inv_materiaprim$
BEGIN
UPDATE inventario_materiaprim 
SET inv_stock = inv_stock+NEW.cantidad, inv_entradas = inv_entradas+NEW.cantidad 
where inv_prod_codigo = NEW.id_producto;
RETURN new;
END;
$inv_materiaprim$ LANGUAGE plpgsql;
CREATE TRIGGER INVENTARIO_MP AFTER INSERT ON entrada_materiaprim 
FOR EACH ROW EXECUTE PROCEDURE inv_materiaprim();
-----
--PROCEDURE 'NUEVO_PRODUCTO' ('CODIGO' varchar  INSERT INTO inventario_productos (inv_pro_codigo) VALUES (CODIGO)
CREATE PROCEDURE NUEVO_PRODUCTO (CODIGO int) 
LANGUAGE SQL
AS $$
INSERT INTO inventario_productos (inv_prod_codigo) VALUES (CODIGO);
$$;
-----
--PROCEDURE 'NUEVA_MATERIA' ('CODIGO' varchar  INSERT INTO inventario_materiaprim (inv_pro_codigo) VALUES (CODIGO)
CREATE PROCEDURE NUEVA_MATERIA (CODIGO int)
LANGUAGE SQL
AS $$
INSERT INTO inventario_materiaprim (inv_prod_codigo) VALUES (CODIGO)
$$;
-----

-----
CREATE OR REPLACE FUNCTION inv_productos_s() RETURNS TRIGGER AS $inv_productos_s$
BEGIN
UPDATE inventario_productos 
SET inv_stock = inv_stock-NEW.cantidad, inv_salidas = inv_salidas+NEW.cantidad 
where inv_prod_codigo = NEW.id_producto;
RETURN new;
END;
$inv_productos_s$ LANGUAGE plpgsql;
CREATE TRIGGER INVENTARIO_S_AI AFTER INSERT ON salida_productos 
FOR EACH ROW EXECUTE PROCEDURE inv_productos_s();
-----

-----
CREATE OR REPLACE FUNCTION inv_materiaprim_s() RETURNS TRIGGER AS $inv_materiaprim_s$
BEGIN
UPDATE inventario_materiaprim
SET inv_stock = inv_stock-NEW.cantidad, inv_salidas = inv_salidas+NEW.cantidad 
where inv_prod_codigo = NEW.id_producto;
RETURN new;
END;
$inv_materiaprim_s$ LANGUAGE plpgsql;
CREATE TRIGGER INVENTARIO_S_MP AFTER INSERT ON entrada_materiaprim 
FOR EACH ROW EXECUTE PROCEDURE inv_materiaprim_s();