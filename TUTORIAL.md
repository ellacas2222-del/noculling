# Tutorial: subir a GitHub y sacar el .jar automático

## 1. Crear el repositorio
1. Entra a github.com y crea cuenta si no tienes.
2. Arriba a la derecha: **+ → New repository**.
3. Nombre: `noculling`. Déjalo **Public**. Pulsa **Create repository**.

## 2. Subir los archivos
Mejor desde PC.
1. Descomprime `nocull.zip`.
2. En tu repo nuevo pulsa **uploading an existing file**.
3. Arrastra TODO el contenido de la carpeta (incluida la carpeta `.github` y `src`).
   Si no ves `.github`, activa "mostrar archivos ocultos" en tu sistema.
4. Abajo pulsa **Commit changes**.

## 3. Ver cómo compila
1. Pestaña **Actions** del repo. Debe aparecer un trabajo "build" corriendo.
2. Espera 2 a 4 minutos. Si sale con check verde, compiló.
3. Entra al trabajo, baja hasta **Artifacts** y descarga `nocull-jar`.
   Dentro está `nocull-1.0.0.jar`.

## 4. Publicar una versión descargable (para tu página)
1. En el repo: **Releases → Create a new release**.
2. En "Choose a tag" escribe `v1.0.0` y pulsa **Create new tag**. Publica.
3. Actions compila y adjunta el .jar al Release automáticamente.
4. Ese enlace de descarga es el que pones en tu página.

## 5. Actualizar versiones
Todo está en `gradle.properties`. Mira https://fabricmc.net/develop y cambia
`minecraft_version`, `loader_version` y `fabric_version`. Haz commit y vuelve a compilar.

## Si falla
- Abre el trabajo fallido en Actions y copia las últimas líneas rojas.
- Error con `smartCull`: el campo cambió de nombre en esa versión.
- Error de versión de Loom o Gradle: revisa fabricmc.net/develop y ajusta `loom_version`.
