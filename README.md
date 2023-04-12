# Web Api Rest My Activity
Esta Api esta hecha en Spring Boot, esta conectada a una base de datos, el motor
que utilizo es MySQL, cuenta con medidas de seguridad o autentificación con JWT, 
utilizando uno de los proyectos de Spring llamado Spring Security.

### Introducción
Esta Api rest nos sirve para poder subir mis actividades del dia a dia,
como tambien, mis hobbies, como programar, leer, escuchar musica, etc, otras personas tambien podran subir
sus actividades, o bueno, esa es la idea.

### Autentificación
URL: http://localhost:3000/api/v1/auth/authenticate
<br>
BODY: `{
"username": "edwin",
"password": "admin123"
}`
<br>
RESPONSE: `{
"jws": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZHdpbiIsImlhdCI6MTY4MTI3MDczNywiZXhwIjoxNjgxMzA2NzM3fQ.4ANvefrTv5WThm_9sYXyFpN1aYJUHEIqe9BtEAp555E"
}`
<br>
<br>
Para poder hacer peticiones ell token obtenido lo usaremos en cada request
de la siguiente forma.
<br>
En el Header de cada request pondremos lo siguiente:<br>
<strong>Authentification: Bearer el_web_token_obtenido_anteriorment</strong>











