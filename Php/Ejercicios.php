<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Ejercicios PHP</title>
</head>
<body>

<?php

echo "<h2>Ejercicio 1: Muestra “hola a todos los alumnos de ciberseguridad” por pantalla.</h2>";
echo "Hola a todos los alumnos de ciberseguridad<br><br>";

echo "<h2>Ejercicio 2: Crea dos variables y sumarlas y muestra el resultado.</h2>";
$a = 10;
$b = 5;
$suma = $a + $b;
echo "La suma de $a + $b es: $suma<br><br>";

echo "<h2>Ejercicio 3: Muestra los números del 1 al 10 en línea.</h2>";
for ($i = 1; $i <= 10; $i++) {
    echo $i . " ";
}
echo "<br><br>";

echo "<h2>Ejercicio 4: Meter cualquier texto dentro de una estructura HTML.</h2>";
echo "<p style='color:blue;'>Este es un texto dentro de una etiqueta HTML generada con PHP.</p><br>";

echo "<h2>Ejercicio 5: Cógete cualquier imagen y pon un img con la ruta de la imagen con PHP.</h2>";
$ruta_imagen = "/Php/imagen/foto-ejercicio-5.webp";
echo "<img src='$ruta_imagen' alt='Imagen' width='250'><br><br>";

echo "<h2>Ejercicio 6: Create un select en HTML y mételo los números del 1 al 10 como opciones.</h2>";
echo "<select name='numeros'>";
for ($i = 1; $i <= 10; $i++) {
    echo "<option value='$i'>$i</option>";
}
echo "</select><br><br>";

echo "<h2>Ejercicio 7: Hacer la tabla de multiplicar.</h2>";
echo "<table border='1' cellpadding='5' cellspacing='0'>";
for ($i = 1; $i <= 10; $i++) {
    echo "<tr>";
    for ($j = 1; $j <= 10; $j++) {
        $resultado = $i * $j;
        echo "<td>$i × $j = $resultado</td>";
    }
    echo "</tr>";
}
echo "</table>";
?>

</body>
</html>