# 2019-1-PROYCVDS-JSC-

2019-1

# CICLOS DE VIDA DEL DESARROLLO DEL SOFTWARE

# INTEGRANTES:


• Juliana Garzón Duque 

• Rubian Camilo Saenz
 
• Sarah Camila Vieda


# PROFESORES: 

• Julián Velasco Briceño

• Santiago Alzate


# ROLES ASIGNADOS:

• Julian Velasco Briceño - Product Owner

• Santiago Alzate - Product Owner

• Camilo Saenz - UX 

• Juliana Garzón - Design

• Sarah Vieda - Front 



# DESCRIPCION DEL PRODUCTO 

• Descripción General 

El producto que desarrollo nuestro equipo es una herramienta donde el personal de Laboratorio de Informática que pertenece a la decanatura de Ingeniería de Sistemas de la Escuela Colombiana de Ingeniería Julio Garavito, puedan registrar los laboratorios, equipos y elementos de cada equipo junto con las novedades que realizan cada uno de los usuarios que tienen permitido acceder al sistema. 

• Manual de Usuario

La plataforma Historial de Equipos cuenta con permisos para los usuarios que se encuentran registrados en la base de datos como    administradores, algunos de estos permisos son:
   1.  Registrar un elemento que fue adquirido en el Laboratorio de Informática y tener el control de cada uno de ellos. Hay cuatro        tipos de elementos: Torre, Pantalla, Mouse y Teclado.
   2. Registrar un nuevo equipo perteneciente al departamento, con todos sus elementos esto quiere decir que debe contener todos  
       los elementos necesarios para su funcionamiento.
   3.  Registrar una novedad sobre un elemento o un equipo para obtener un reporte historico de cada una de las novedades                  asociadas y asi conocer cuales han sido las tareas, cambios o mantenimientos realizados a los equipos y elementos.
   4.  Consultar el reporte de equipos en el que puedo ver cada uno de los equipos con los que cuenta el Laboratorio.
   5.  Asociar los elementos que se encuentran disponibles a un equipo en específico con el fin de controlar que cada equipo activo        se encuentre completo.
   6.  Consultar el reporte de elementos en el que puedo tener un control de los elementos que tengo disponibles con su respectiva        información.
   7.  Registrar un laboratorio perteneciente al departamento con todos sus equipos.
   8.  Asociar los equipos a un laboratorio con el fin de controlar que equipos se encuentran en cada uno de los laboratorios.
   9.  Dar de baja a un equipo para indicar que ya no estará en uso y no es posible asignar más elementos a este.
   10.  Consultar el reporte de laboratorio para tener un control de que laboratorios se encuentran disponibles con su información          mas relevante.
   
   • Imágenes y descripcion de las funcionalidades más importantes 
  
    

     
ARQUITECTURA Y DISEÑO DETALLADO

•Modelo E-R

# Link Heroku
https://cvds-pro.herokuapp.com/ 


•Diagrama de clases

![Diagrama](https://user-images.githubusercontent.com/48154086/57622319-efa75600-7552-11e9-960c-7ba1d88d6d7b.PNG)


# Comandos de Despliegue

> Para hacer el despliegue se deben seguir los siguientes pasos

1) mvn package
2) heroku login
3) heroku war:deploy target/Proyectocvds-1.0.war --app cvds-pro
4) heroku open





