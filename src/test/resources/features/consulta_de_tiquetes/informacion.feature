# language: es



Característica: Buscar información bíblica.
  deseo iniciar mi primer automatización.
  como programador deseo buscar información sobre la familia en jw.org.

  Antecedentes:
  Dado el usuario fue capaz de abrir la pagina https://www.jw.org/es/

  @BusquedaFamilia
  Esquema del escenario: s: deseo ingresar a la pagina jw.org y buscar ayuda bíblica.
  la información debería ser sobre la familia.
  y encontrar específicamente sobre familias felices.

    Cuando que me encuentro en la pagina y escribo la palabra familia
    Entonces me comparara con el link del ejemplo: <Titulo>

    Ejemplos:
      | Titulo                                        |
      | Familias felices: Más ayuda para las familias |


  @Revistas
  Esquema del escenario: deseo encontrar revistas de la organizacion en jw.org
  la idea es que pueda encontrar cualquier tipo de revista que el sistema arroje primero

    Dado que me encuentro en la pagina principal busco en la biblioteca la opcion de revistas
    Cuando de click en revistas seleccionara todos los tipos escribira Atalaya y seleccionara antiguedad
    Entonces me deberia arrojar un resultado como el ejemplo: <titulo>

    Ejemplos:
      | titulo                                                |
      |  ¿Cómo puede asegurarse un buen futuro? |