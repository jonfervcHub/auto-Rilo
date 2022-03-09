#language: es

Característica: Pagina de inicio Rilo

  Antecedentes:
    Cuando se asigna el usuario
    Y se ingresa al portal de home Rilo

  @PortalLoginRilo
  Esquema del escenario: Ingreso al portal de Rilo
    Entonces inicia sesion con <usuario> y <clave>
    #Y el usuario realiza alguna accion

    Ejemplos:
      | usuario    | clave            |
      | "12345678" | "Colombia.2020@" |