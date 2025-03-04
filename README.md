# NICESTART

<img src="imagenes/logo_nicestart.jpg" alt="Logo" width="300"/>

## Descripción del Proyecto
Nicestart es una aplicación Android sencilla que proporciona una estructura básica para el desarrollo de aplicaciones móviles. Incluye pantallas principales como **Login**, **Registro** y **Main**, además de diversos menús, barras de navegación y fragments.

El proyecto está organizado en **ramas** para facilitar su desarrollo y mantenimiento.

---

## Funcionamiento

### 🖥️ Pantalla Splash
<img src="imagenes/Splash.png" alt="Pantalla de Carga" width="300"/>

Al iniciar la app, aparece esta pantalla con el logo de la aplicación parpadeando durante unos segundos.

---

### 🔐 Pantalla de Login
<img src="imagenes/Login.png" alt="Pantalla de Login" width="300"/>

Permite a los usuarios ingresar sus credenciales de acceso.
- Contiene campos de texto para **usuario** y **contraseña**.
- Incluye un botón para **iniciar sesión**.

---

### 🆕 Pantalla de Registro
<img src="imagenes/SignUp.png" alt="Pantalla de Registro" width="300"/>

Permite la creación de una nueva cuenta.
- Campos para **nombre de usuario**, **correo electrónico** y **contraseña**.
- Botones para **registrarse** y **volver a la pantalla de login**.

---

### 🏠 Pantalla Principal (Main)
<img src="imagenes/Main.png" alt="Pantalla Principal" width="300"/>

Accesible desde la pantalla de login o registro.
- **No permite regresar a la pantalla de Login**.

---

### 📋 Menús y Navegación

#### 📑 Cuadro de Diálogo
<img src="imagenes/menu1.png" alt="Cuadro de diálogo" width="300"/>

Este menú abre una ventana emergente con dos opciones:
- **Scrolling**: Redirige a otra pantalla (por defecto, regresa al Login).

#### 📌 Menú Appbar
<img src="imagenes/menu2.png" alt="Menú con 3 opciones" width="300"/>

Opciones disponibles:
1. **Perfil** → Accede a la pantalla "Profile".
2. **Ajustes** → Muestra un mensaje emergente.
3. **Copiar** → Muestra un mensaje emergente.
4. **Menú Fragments** → Redirige al activity con las cuatro páginas.

#### 📂 Menú Contextual
<img src="imagenes/contextual.jpg" alt="Menú contextual" width="300"/>

Similar al menú Appbar, pero sin los íconos en las opciones.

---

### 👤 Pantalla Profile
<img src="imagenes/profile.png" alt="Perfil" width="300"/>

Muestra la información del usuario:
- **Foto de perfil (circular)**
- **Nombre**
- **Descripción**
- **Correo electrónico**

Se accede desde el menú Appbar en la opción **"Perfil"**.

---

### 🔄 Funcionalidades Adicionales

#### 🔄 Refresh
<img src="imagenes/refresh.jpg" alt="Refrescar" width="300"/>

En la pantalla Main, al arrastrar hacia abajo se refresca la página.

#### 🌙 Modo Noche
<img src="imagenes/modoNoche.jpg" alt="Modo noche" width="300"/>

Modo oscuro que cambia el fondo a negro y ajusta los colores para una mejor visualización nocturna.

#### 🧩 Fragments
<div style="display: flex; justify-content: space-between;">
    <img src="imagenes/fragments.jpg" alt="Fragments" width="24%"/>
    <img src="imagenes/fragment2.jpg" alt="Fragments" width="24%"/>
    <img src="imagenes/fragment3.jpg" alt="Fragments" width="24%"/>
    <img src="imagenes/fragment4.jpg" alt="Fragments" width="24%"/>
</div>

Los fragments son pequeñas piezas dentro de un Activity. En Nicestart, cada fragment se relaciona con un apartado del **Bottom Navigation Menu**.

#### 📌 Bottom Navigation Menu
<img src="imagenes/bottom_navigation_menu.jpg" alt="Menú en modo noche" width="300"/>

Este menú permite la navegación entre diferentes fragments sin necesidad de cambiar de Activity.

#### 🔄 Section Pager Adapter
Este adaptador gestiona la navegación entre fragments. En el método `getItem()`, retorna el fragment correspondiente (Page1, Page2, etc.) según la posición.

---

### 🌍 Idiomas
La aplicación está disponible en **Francés de Francia**, además del idioma predeterminado.

---

📌 **Nicestart ofrece una base sólida para el desarrollo de aplicaciones Android, facilitando la integración de elementos esenciales como login, navegación y personalización visual.** 🚀
