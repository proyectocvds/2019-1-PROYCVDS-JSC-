# CICLOS DE VIDA DEL DESARROLLO DEL SOFTWARE
2019-1

Grupo:

# 2019-1-PROYCVDS-JSC-

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


# Link Heroku
https://cvds-pro.herokuapp.com/ 

• Username: rubian.saenz

• Password: proyectoCVDS1234



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
    1. La aplicacion cuenta con un menu para que el administrador seleccione la acción que desea realizar.
        ![Menu](https://user-images.githubusercontent.com/48154086/57624255-3008d300-7557-11e9-9316-6fef881344d6.PNG)
        
   2. Al entrar en la opción de "Registrar Elemento", el administrador puede registrar un nuevo elemento el cual aparecera en el           reporte que se encuentra en la parte inferior de la página y cuenta con la opción de exportarlo en Excel. 
        
        ![registrarElem](https://user-images.githubusercontent.com/48154086/57633050-7d417080-7568-11e9-92d0-2e1e8dc3313c.PNG)
        ![exportar](https://user-images.githubusercontent.com/48154086/57633028-7581cc00-7568-11e9-8af3-666a90e8cc5b.PNG)
        
        
  3. En la opción "Registrar Equipo", el administrador puede registrar uno nuevo y aparecerá en el reporte de equipos que se               encuentra dentro de la misma página y tiene la opción de exportar el reporte en Excel. 
     
        ![registrarEqui](https://user-images.githubusercontent.com/48154086/57633061-7f0b3400-7568-11e9-804d-30142363c26c.PNG)
        ![exportar](https://user-images.githubusercontent.com/48154086/57633028-7581cc00-7568-11e9-8af3-666a90e8cc5b.PNG)
        ![reporteEquip](https://user-images.githubusercontent.com/48154086/57633199-ca254700-7568-11e9-9ad7-9d06362d6199.PNG)
        
        
  4. En "Registrar Novedad" existen tres opciones para registrar una novedad a un Laboratorio a un elemento o a un equipo.
     
   Para los Laboratorios:
     ![registrarNovMenu](https://user-images.githubusercontent.com/48154086/57633188-c4c7fc80-7568-11e9-9a70-3ba2a0aa7ac7.PNG)
     ![registrarNovLab1](https://user-images.githubusercontent.com/48154086/57633171-bed21b80-7568-11e9-8c0b-9b81e6b0a435.PNG)
     ![registrarNovLab2](https://user-images.githubusercontent.com/48154086/57633183-c265a280-7568-11e9-9ab2-38eb66495715.PNG)
        
   Para los Elementos:
    ![reporteNovedadElem](https://user-images.githubusercontent.com/48154086/57633289-f2ad4100-7568-11e9-97d6-d06426e91875.PNG)
    ![registrarNovElem2](https://user-images.githubusercontent.com/48154086/57633101-98ac7b80-7568-11e9-8996-0623981bbc71.PNG)
    ![NovedadElementoReporte](https://user-images.githubusercontent.com/48154086/57633769-a7dff900-7569-11e9-8201-8f3eec6e7b5b.PNG)
    
   Para los Equipos:
   ![novedadEquipo1](https://user-images.githubusercontent.com/48154086/57634871-c1824000-756b-11e9-839a-5c90c632544c.PNG)
   ![novedadEquipo2](https://user-images.githubusercontent.com/48154086/57634869-c0e9a980-756b-11e9-99f6-6ab913581f03.PNG)
   
      
     
     
  5. En la opcion "Registrar Laboratorio" el usuario tiene permisos para registrar un Laboratorio y este aparecerá en el reporte           que se encuentra en la página y tiene la opción de exportar a Excel el reporte.
  
  ![registrarLab1](https://user-images.githubusercontent.com/48154086/57634864-bf1fe600-756b-11e9-9849-48fe75fcf42d.PNG)
  ![registrarLab2](https://user-images.githubusercontent.com/48154086/57634860-bd562280-756b-11e9-8f10-910f95bca644.PNG)
  
  
    
     
  6. La opcion "Log Out" permite al usuario cerrar sesión.
  
  
     ![logout](https://user-images.githubusercontent.com/48154086/57635163-41a8a580-756c-11e9-8156-4be60cfdee2e.PNG)

   
# ARQUITECTURA Y DISEÑO DETALLADO

•Modelo E-R

![Diagrama](https://user-images.githubusercontent.com/48154086/57622319-efa75600-7552-11e9-960c-7ba1d88d6d7b.PNG)


•Diagrama de clases 


![Diagrama de Clases](https://github.com/proyectocvds/2019-1-PROYCVDS-JSC-/blob/master/Diagrama%20de%20Clases.PNG)


# STACK DE TECNOLOGIAS

• MyBatis: Es un framework de persistencia que soporta SQL, procedimientos almacenados y mapeos avanzados. 
• PrimeFaces: Es una biblioteca de componentes para JavaServer Faces(JSF) de código abierto que cuenta con un conjunto de componentes enriquecidos que facilitan la creación de las aplicaciones web.
• Boostrap: Es una biblioteca multiplataforma o conjunto de herramientas de codigo abierto para diseno de sistios y aplicaciones web.
• Guice: Es un framework de inyeccion de dependencias que puede ser utilizado en aplicaciones hechas con Java en donde la relación o dependencia entre objetos de negocio necesita ser administrada o mantenida.
• PostgreSQL: Es un sistema de gestión de bases de datos relacional orientado a objetos y de código abierto.


# ENLACE A TAIGA

https://tree.taiga.io/project/camilosaenz-historial-de-equipos-labinfo/backlog

# RETROSPECTIVA

https://github.com/proyectocvds/2019-1-PROYCVDS-JSC-/tree/master/Retrospectiva


# Comandos de Despliegue

> Para hacer el despliegue se deben seguir los siguientes pasos

1) heroku plugins:install heroku-cli-deploy
2) mvn package
3) heroku login
4) heroku war:deploy target/Proyectocvds-1.0.war --app cvds-pro
5) heroku open
