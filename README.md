# NICESTART
<img src="imagenes/logo_nicestart.jpg" alt="Logo" width="300"/>

## Descripción del Proyecto
Nicestart es una aplicación Android simple que incluye distintas pantallas principales, como Login, Registro y Main además de diferentes menús o barras de navegación, fragments, etc. El propósito principal es ofrecer una estructura básica para el desarrollo de aplicaciones Android.

El proyecto está organizado en ramas.

## Su Funcionamiento

### Pantalla Splash
<img src="imagenes/Splash.png" alt="Pantalla de Carga" width="300"/>

Al iniciar la app, lo primero en aparecer es esta pantalla. En ella, el logo de la aplicación parpadea por unos segundos.

### Pantalla de Login
<img src="imagenes/Login.png" alt="Pantalla de Login" width="300"/>

Permite a los usuarios ingresar sus credenciales de inicio de sesión.
- Contiene campos de texto para el usuario y la contraseña.
- Incluye un botón para iniciar sesión.

### Pantalla de Registro
<img src="imagenes/SignUp.png" alt="Pantalla de Registro" width="300"/>

Permite a los usuarios crear una nueva cuenta.
- Incluye campos para el nombre de usuario, correo electrónico y contraseña.
- Contiene botones para registrarse y volver a la pantalla de login.

### Pantalla Principal (Main)
<img src="imagenes/Main.png" alt="Pantalla Principal" width="300"/>

Se accede desde el login o desde la pantalla de registro.
- No permite regresar a la pantalla de Login.

### Cuadro de Diálogo
<img src="imagenes/menu1.png" alt="Cuadro de diálogo" width="300"/>

Menú que abre una ventana emergente. Entre las 2 opciones, si seleccionamos "Scrolling", nos enviará a otra pantalla (en mi caso, envía de vuelta al Login).

### Menú Appbar: Perfil, Ajustes y Copiar
<img src="imagenes/menu2.png" alt="Menu con 3 opciones" width="300"/>

El segundo menú nos da a elegir 3 opciones:
1. **Perfil**: Nos enviará a la pantalla "Profile".
2. **Ajustes**: Muestra un mensaje emergente en la parte inferior.
3. **Copiar**: Muestra un mensaje emergente en la parte inferior.
4. **Menú Fragments**: Nos envía al activity donde se muestran las 4 páginas distintas que hicimos.

### Menú Contextual
<img src="imagenes/contextual.jpg" alt="Menu contextual" width="300"/>

Menú idéntico al anterior, con la diferencia de que este no tiene los logos que le pusimos a las opciones del primero.

### Pantalla Profile
<img src="imagenes/profile.png" alt="Perfil" width="300"/>

Esta pantalla muestra la foto de perfil de manera circular, nombre, descripción y correo. Se accede a ella desde el menú del appbar, en el apartado de "Perfil".

### Refresh
<img src="imagenes/refresh.jpg" alt="Refrescar" width="300"/>

Desde la pantalla del Main, si se arrastra hacia abajo, tiene la opción de refrescar la página.

### Modo Noche
<img src="imagenes/modoNoche.jpg" alt="Modo noche" width="300"/>

He añadido un modo noche, que cambia el fondo a negro y los colores a unos más suaves.

### Fragments
<img src="imagenes/fragments.jpg" alt="Fragments" width="300"/>

En Nicestart he introducido Fragments, que funcionan como pequeñas piezas dentro de un Activity. Cada página se relaciona con un apartado distinto del BottomNavigationMenu.

### Bottom Navigation Menu
<img src="imagenes/bottom_navigation_menu.jpg" alt="Menu en modo noche" width="300"/>

El Bottom Navigation Menu nos permite avanzar entre diferentes pantallas (que no Activities) gracias al uso de fragments, los cuales, al igual que los activity, tienen su propio XML.

### Section Pager Adapter
Se define un adaptador que gestiona la navegación entre fragments. En el método `getItem()` retorna el fragment adecuado (Page1, Page2...) dependiendo del índice `position`.

### Idiomas
La aplicación tiene traducción al Francés de Francia.