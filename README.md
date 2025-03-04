# NICESTART
![NiceStart](imagenes/logo_nicestart.jpg "Logo")

## Descripción del Proyecto
Nicestart es una aplicación Android simple que incluye distintas pantallas principales, como Login, Registro y Main además de diferentes menús o barras de navegación, fragments, etc... El propósito del proyecto es ofrecer un ejemplo básico de navegación entre actividades, manejo de temas y estilos, y la integración con Git para controlar versiones.

El proyecto también está organizado en ramas.

## Su funcionamiento

### Pantalla Splash
![Splash](imagenes/Splash.png "Pantalla de Carga")

Al iniciar la app, ya sea en el emulador o desde el móvil, lo primero en aparecer es esta pantalla. En ella el logo de la aplicación aparece con un parpadeo por unos segundos.



### Pantalla de Login
![Login](imagenes/Login.png "Pantalla de Login")

Permite a los usuarios ingresar sus credenciales de inicio de sesión.
- Contiene campos de texto para el usuario y la contraseña, así como un botón para iniciar sesión.



### Pantalla de Registro
![Sign Up](imagenes/SignUp.png "Pantalla de Registro")

Permite a los usuarios crear una nueva cuenta.
- Incluye campos para el nombre de usuario, correo electrónico y contraseña.
- Contiene botones para registrarse y volver a la pantalla de login.



### Pantalla Principal (Main)
![Principal](imagenes/Main.png "Pantalla Principal")

Se accede entrando desde el login, o bien desde la pantalla de Sign Up.
- No permite regresar a la pantalla de Login.



### Cuadro de diálogo
![Profile](imagenes/menu1.png "Cuadro de diálogo")

Menú que abrirá una ventana emergente. Entre las 2 opciones, si damos a "Scrolling", nos enviará a otra pantalla (en mi caso, envía de vuelta al Login).



### Menú appbar: Perfil, ajustes y copiar
![Profile](imagenes/menu2.png "Menu con 3 opciones")

El 2º menú nos da a elegir 3 opciones.
- 1ª opción: Perfil. Si clicamos nos enviará a la pantalla "Profile"
- 2ª y 3ª opción: Ajustes y Copiar: Al clicar nos pone un mensaje emergente en la parte inferior.



### Pantalla Profile
![Profile](imagenes/profile.png "Perfil")

Esta pantalla muestra la foto de perfil de manera circular, nombre, descripción y correo. Se accede a ella desde el menú del appbar, en el apartado de "Perfil"



### Refresh
![Profile](imagenes/refresh.jpg "Refrescar")

Desde la pantalla del Main, si se arrastra hacia abajo, tiene la opción de refrescar la página.



### Modo noche
![Night Profile](imagenes/modoNoche.jpg "Modo noche")

He añadido un modo noche, que cambia el fondo a negro y que cambia los colores a unos más suaves



### Fragments
![Bottom Navigation Menu](imagenes/fragments.jpg "Fragments")

En mi Nicestart he introducido Fragments, que funcionan como pequeñas piezas dentro de un Activity. Cada pagina se relaciona con un apartado distinto del BottomNavigationMenu.



### Bottom Navigation Menu
![Bottom Navigation Menu](imagenes/bottom_navigation_menu.jpg "Menu en modo noche")

Como menciono antes, el Bottom Navigation Menu nos permite avanzar entre diferentes pantallas (que no Activities) gracias al uso de fragments los cuales, al igual que los activity, tienen su propio xml y su propio codigo Java.



### Section Pager Adapter

Se define un adaptador que gestiona la navegacion entre fragments.
En el metodo "getItem()" retorna el fragment adecuado (Page1, Page2...) dependiendo del indice "position"



### Idiomas

La aplicación tiene traducción al Francés de Francia
