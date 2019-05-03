CREATE TABLE public.laboratorio (
	id varchar NOT NULL,
	nombre varchar NOT NULL,
	cupos int4 NOT NULL,
	CONSTRAINT laboratorio_pk PRIMARY KEY (id)
);

CREATE TABLE public.equipo (
	id varchar NOT NULL,
	disponible bool NOT NULL,
	fecha date NULL,
	laboratorio varchar NULL,
	CONSTRAINT equipo_pk PRIMARY KEY (id),
	CONSTRAINT equipo_laboratorio_fk FOREIGN KEY (laboratorio) REFERENCES laboratorio(id)
);

CREATE TABLE public.elemento (
	id varchar NOT NULL,
	disponible bool NOT NULL,
	tipo varchar NOT NULL,
	equipo varchar NULL,
	marca varchar NULL,
	fecha date NULL,
	CONSTRAINT elemento_pk PRIMARY KEY (id),
	CONSTRAINT elemento_equipo_fk FOREIGN KEY (equipo) REFERENCES equipo(id)
);




CREATE TABLE public.usuario (
	estado bool NOT NULL,
	correo varchar NOT NULL,
	contrasena varchar NOT NULL,
	informacion varchar NOT NULL,
	username varchar NOT NULL,
	nombre varchar NULL,
	apellido varchar NULL,
	CONSTRAINT usuario_pk PRIMARY KEY (username),
	CONSTRAINT usuario_un UNIQUE (correo)
);




CREATE TABLE public.novedad (
	id varchar NOT NULL,
	fecha date NOT NULL,
	titulo varchar NOT NULL,
	detalle varchar NOT NULL,
	usuario varchar NOT NULL,
	elemento varchar NOT NULL,
	equipo varchar NOT NULL,
	laboratorio varchar NULL,
	CONSTRAINT novedad_pk PRIMARY KEY (id),
	CONSTRAINT novedad_elemento_fk FOREIGN KEY (elemento) REFERENCES elemento(id),
	CONSTRAINT novedad_equipo_fk FOREIGN KEY (equipo) REFERENCES equipo(id),
	CONSTRAINT novedad_laboratorio_fk FOREIGN KEY (laboratorio) REFERENCES laboratorio(id),
	CONSTRAINT novedad_usuario_fk FOREIGN KEY (usuario) REFERENCES usuario(username)
);



