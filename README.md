# ServerChat-Spring

## Pasos a seguir

- Ejecutar el Script de Mysql que puedes encontrar en la carpeta de Scripts.
- Ejecutar proyecto desde tu IDE de Java preferido.

</br>

Ejemplo de body de respuesta GET **http://localhost:8080/api/v1/msg**

```json
[
  {
    "msgId": 0,
    "userIdFk": 1,
    "text": "Hola, ¿cómo te va?",
    "date": "22/12/2021"
  },
  {
    "msgId": 2,
    "userIdFk": 1,
    "text": "BorpaSpinBorpaSpinBorpaSpinBorpaSpinBorpaSpinBorpaSpinBn",
    "date": "22/12/2021"
  }
]
```

</br>

Ejemplo de body de respuesta GET **http://localhost:8080/api/v1/user**

```json
[
  { "userId": 0, "name": "Usuario" },
  { "userId": 1, "name": "Francisca" },
  { "userId": 2, "name": "Roberto" }
]
```
