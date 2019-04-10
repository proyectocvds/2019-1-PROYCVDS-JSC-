--Tablas


--Tabla novedad

CREATE TABLE public.novedad (
	id varchar NOT NULL,
	"fecha " date NOT NULL,
	"titulo " varchar NOT NULL,
	usuario varchar NOT NULL,
	detalle varchar NOT NULL,
	equipo varchar NOT NULL,
	elemento varchar NOT NULL,
	CONSTRAINT novedad_pk PRIMARY KEY (id),
	CONSTRAINT novedad_elemento_fk FOREIGN KEY (id) REFERENCES elemento(id),
	CONSTRAINT novedad_equipo_fk FOREIGN KEY (id) REFERENCES equipo(id),
	CONSTRAINT novedad_usuario_fk FOREIGN KEY (id) REFERENCES usuario(username)
);


--Tabla equipo

CREATE TABLE public.equipo (
	id varchar NOT NULL,
	disponible bool NOT NULL,
	CONSTRAINT equipo_pk PRIMARY KEY (id)
);



--Tabla elemento

CREATE TABLE public.elemento (
	id varchar NOT NULL,
	disponible bool NOT NULL,
	tipo varchar NOT NULL,
	CONSTRAINT elemento_pk PRIMARY KEY (id)
);


--Tabla usuario


CREATE TABLE public.usuario (
	estado bool NOT NULL,
	correo varchar NOT NULL,
	contrasena varchar NOT NULL,
	informacion varchar NOT NULL,
	username varchar NOT NULL,
	CONSTRAINT usuario_pk PRIMARY KEY (username),
	CONSTRAINT usuario_un UNIQUE (correo)
);






