# language: es
 Característica: Información de las ofertas de empleo en Tribal para posición especifica
   Como usuario, quiero conocer la ofertas de empleo disponibles en la página de Tribal para una posición especifica

   Antecedentes:
     Dado que se ingresó a la página de ofertas de trabajo actuales de Tribal Credit
     Y que se valida que se cargue la información de la página

   Escenario: busqueda especifica de vacantes disponibles por departamento y oficina
      Cuando selecciono Engineering en el campo Department
      Y en el campo Office selecciono Mexico
      Entonces se muestra por pantalla la posición Senior QA Engineer

