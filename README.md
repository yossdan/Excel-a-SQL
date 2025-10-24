Cómo compilar y ejecutar ExcelToSQLUltimate

1-  Compilar el programa
Antes de ejecutar el programa, necesitamos compilar el archivo .java y generar los archivos .class que Java puede ejecutar.
Abre la terminal en la carpeta del proyecto y escribe:

javac -cp "lib/*" -d out src/main/java/ExcelToSQLUltimate.java

Explicación de cada parte:
javac → el comando de Java para compilar código.
-cp "lib/*" → le dice a Java que incluya todas las librerías externas que están en la carpeta lib.
-d out → indica que los archivos compilados (.class) se guardarán en la carpeta out.
src/main/java/ExcelToSQLUltimate.java → ruta del archivo que queremos compilar.
Después de este paso, en la carpeta out tendrás todos los archivos .class necesarios para ejecutar el programa.

Una vez compilado, ejecuta el programa con este comando:

java -cp ".:lib/*" ExcelToSQLUltimate

Explicación:
java → el comando para ejecutar programas Java.
-cp ".:lib/*" → indica a Java dónde buscar las clases necesarias:
. → la carpeta actual (donde están los .class).
lib/* → todas las librerías externas necesarias para el programa.
ExcelToSQLUltimate → el nombre de la clase principal que contiene el main.
Si todo está correcto, el programa se ejecutará y podrás usarlo normalmente.
