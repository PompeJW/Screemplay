# language: es

Característica: realizar la automatizacion de ingreso a youtube y buscar opciones de practica
Antecedentes:
Dado que ya pude ingresar a la pagina de  https://www.youtube.com

  @PracticeYoutube
  Escenario: ya que me encuentro en la pagina deseo encontrar un video en especifico
  luego de que se termine de reproducir dar like y terminar la prueba

    Dado que me encuentro en la pagina y busco el video llamado I Wanna Know
    Cuando se desplegue la lista de opciones escogere uno en especifico
    Entonces despues de esto le dara like y finalizara: nose