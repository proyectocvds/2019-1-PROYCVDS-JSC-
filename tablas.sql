
--Tablas


CREATE TABLE public.elemento (
	id varchar NOT NULL,
	disponible bool NOT NULL,
	tipo varchar NOT NULL,
	CONSTRAINT elemento_pk PRIMARY KEY (id)
);


CREATE TABLE public.equipo (
	id varchar NOT NULL,
	disponible bool NOT NULL,
	CONSTRAINT equipo_pk PRIMARY KEY (id)
);



CREATE TABLE public.usuario (
	username varchar(50) NOT NULL,
	estado bool NOT NULL,
	correo varchar NOT NULL,
	contrasena varchar NOT NULL,
	informacion varchar NULL,
	CONSTRAINT usuario_pk PRIMARY KEY (username),
	CONSTRAINT usuario_un UNIQUE (correo)
);

-- Drop table

-- DROP TABLE public.novedad;

CREATE TABLE public.novedad (
	id varchar NOT NULL,
	fecha date NOT NULL,
	titulo varchar NOT NULL,
	detalle varchar NOT NULL,
	usuario varchar NOT NULL,
	elemento varchar NOT NULL,
	equipo varchar NOT NULL,
	CONSTRAINT novedad_pk PRIMARY KEY (id)
);


