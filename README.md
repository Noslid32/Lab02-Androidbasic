Lab02 – Android Basics

Descripción
Este repositorio contiene dos aplicaciones desarrolladas en Android Studio utilizando Kotlin y Jetpack Compose como parte del laboratorio del módulo Android Basics. Los proyectos permiten aplicar conceptos fundamentales del desarrollo Android moderno, como manejo de estado, coroutines, interfaces declarativas y buenas prácticas de arquitectura.

Proyectos incluidos

Parte 1: RPG Character Sheet
Aplicación que simula la creación de un personaje de rol (RPG), donde el usuario puede generar estadísticas básicas y evaluar la calidad del personaje según el puntaje total.

Parte 2: Traffic Light Simulator
Aplicación que simula el funcionamiento de un semáforo, cambiando automáticamente entre luces de forma continua y sin interacción del usuario.

Objetivo del laboratorio
El objetivo principal del laboratorio es reforzar el uso de Kotlin y Jetpack Compose para construir interfaces modernas y reactivas, así como aplicar coroutines para ejecutar lógica no bloqueante respetando el ciclo de vida de la aplicación.

Tecnologías utilizadas
Lenguaje: Kotlin
Framework de interfaz: Jetpack Compose
IDE: Android Studio
Sistema de construcción: Gradle
Plataforma: Android

Estructura del proyecto
MainActivity.kt: contiene la lógica principal de cada aplicación
res/: recursos del proyecto (temas, colores y strings)
AndroidManifest.xml: configuración general de la aplicación
gradle/: archivos de configuración y dependencias

Parte 1: RPG Character Sheet

Descripción
Esta aplicación permite generar un personaje RPG mediante el lanzamiento aleatorio de estadísticas. Se muestran tres atributos principales: Vitality, Dexterity y Wisdom, cada uno con un botón para generar un valor aleatorio.

Funcionamiento
Cada estadística puede generarse de manera independiente. El sistema calcula automáticamente el puntaje total del personaje y muestra un mensaje de evaluación según el resultado obtenido.
Si el total es menor a 30, el personaje es considerado débil y se recomienda volver a generar los valores.
Si el total es mayor o igual a 50, el personaje es considerado fuerte o sobresaliente.

Conceptos aplicados
Manejo de estado con remember y mutableStateOf
Funciones reutilizables mediante composables
Flujo unidireccional de datos
Interfaz de usuario declarativa con Jetpack Compose

Parte 2: Traffic Light Simulator

Descripción
Esta aplicación simula un semáforo utilizando tres luces (rojo, amarillo y verde) organizadas verticalmente.

Funcionamiento
El cambio de luces se realiza automáticamente utilizando LaunchedEffect y coroutines, sin bloquear el hilo principal. Los tiempos definidos para cada luz son los siguientes:
Rojo: 2 segundos
Verde: 2 segundos
Amarillo: 1 segundo

La luz activa se muestra con su color correspondiente, mientras que las luces inactivas se muestran en color gris. El ciclo se repite de forma continua sin necesidad de interacción del usuario.

Conceptos aplicados
Uso de enum class para representar estados
Manejo de estado y recomposición en Compose
Uso de coroutines y delay para tareas no bloqueantes
Layouts Column, Box y uso de Modifier

---Clonar el repositorio----
Para obtener el proyecto desde GitHub se deben seguir los siguientes pasos:

1. Abrir una terminal (Command Prompt, PowerShell o Terminal).
2. Ubicarse en el directorio donde se desea guardar el proyecto.
3. Ejecutar el siguiente comando:

git clone https://github.com/Noslid32/Lab02-Androidbasic.git

4. Ingresar a la carpeta del proyecto clonado:

cd Lab02-Androidbasic

5. Abrir el proyecto en Android Studio y esperar a que Gradle sincronice.

Ejecución
Abrir el proyecto en Android Studio, esperar la sincronización de Gradle y ejecutar las aplicaciones en un emulador o en un dispositivo físico Android.

Video demostración
Link del video: https://drive.google.com/drive/folders/1Po22EIpoFIRwraegMT0PnUYn9SeUOFZW?usp=drive_link
(Utilizar correo Galileo para poder aceder)
