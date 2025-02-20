

-- COLEGIOS
insert into colegios (tipo, nro_cuotas) values ('municipal', 10);
insert into colegios (tipo, nro_cuotas) values ('subvencionado', 7);
insert into colegios (tipo, nro_cuotas) values ('privado', 4);

--select * from colegios;

-- ESTUDIANTES
insert into estudiantes (rut, nombre, apellido, fecha_nacimiento, nombre_colegio, anio_egreso, fk_colegio) values ('21090869-2', 'Aracely', 'Castro', '2002/08/16', 'colegio 1', 2021,  1);
insert into estudiantes (rut, nombre, apellido, fecha_nacimiento, nombre_colegio, anio_egreso, fk_colegio) values ('21090856-0', 'Paz', 'Castro', '2002/08/16', 'colegio 2', 2021, 3);

--select * from estudiantes;