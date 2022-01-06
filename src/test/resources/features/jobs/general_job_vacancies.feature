# language: es
Característica: Información general de todas las ofertas de empleo en Tribal por departamento y oficina
  Como usuario, quiero conocer todas las ofertas de empleo disponibles por departamento y oficina en tribal

  Antecedentes:
    Dado que se ingresó a la página de ofertas de trabajo actuales de Tribal Credit
    Y que se valida que se cargue la información de la página

   Esquema del escenario: Verificar las opciones disponibles para cada departamento y cada oficina
     Cuando en el campo Department filtro por <department>
     Y en el campo Office por <Office>
     Entonces se muestran las opciones seleccionadas

     Ejemplos:
       |   department    |    Office   |
       | All Departments | All Offices |
       | All Departments | Brazil |
       | All Departments | Chile |
       | All Departments | Colombia |
       | All Departments | Mexico |
       | All Departments | United Arab Emirates |
       | All Departments | United States |
       | Communications and Culture | All Offices |
       | Communications and Culture | Brazil |
       | Communications and Culture | Chile |
       | Communications and Culture | Colombia |
       | Communications and Culture | Mexico |
       | Communications and Culture | United Arab Emirates |
       | Communications and Culture | United States |
       | Credit Success | All Offices |
       | Credit Success | Brazil |
       | Credit Success | Chile |
       | Credit Success | Colombia |
       | Credit Success | Mexico |
       | Credit Success | United Arab Emirates |
       | Credit Success | United States |
       | Customer Success | All Offices |
       | Customer Success | Brazil |
       | Customer Success | Chile |
       | Customer Success | Colombia |
       | Customer Success | Mexico |
       | Customer Success | United Arab Emirates |
       | Customer Success | United States |
       | Data Science and Research | All Offices |
       | Data Science and Research | Brazil |
       | Data Science and Research | Chile |
       | Data Science and Research | Colombia |
       | Data Science and Research | Mexico |
       | Data Science and Research | United Arab Emirates |
       | Data Science and Research | United States |
       | Engineering | All Offices |
       | Engineering | Brazil |
       | Engineering | Chile |
       | Engineering | Colombia |
       | Engineering | Mexico |
       | Engineering | United Arab Emirates |
       | Engineering | United States |
       | Finance and Accounting | All Offices |
       | Finance and Accounting | Brazil |
       | Finance and Accounting | Chile |
       | Finance and Accounting | Colombia |
       | Finance and Accounting | Mexico |
       | Finance and Accounting | United Arab Emirates |
       | Finance and Accounting | United States |
       | Legal and Compliance | All Offices |
       | Legal and Compliance | Brazil |
       | Legal and Compliance | Chile |
       | Legal and Compliance | Colombia |
       | Legal and Compliance | Mexico |
       | Legal and Compliance | United Arab Emirates |
       | Legal and Compliance | United States |
       | Marketing | All Offices |
       | Marketing | Brazil |
       | Marketing | Chile |
       | Marketing | Colombia |
       | Marketing | Mexico |
       | Marketing | United Arab Emirates |
       | Marketing | United States |
       | Operations | All Offices |
       | Operations | Brazil |
       | Operations | Chile |
       | Operations | Colombia |
       | Operations | Mexico |
       | Operations | United Arab Emirates |
       | Operations | United States |
       | People Ops and Talent Acquisition | All Offices |
       | People Ops and Talent Acquisition | Brazil |
       | People Ops and Talent Acquisition | Chile |
       | People Ops and Talent Acquisition | Colombia |
       | People Ops and Talent Acquisition | Mexico |
       | People Ops and Talent Acquisition | United Arab Emirates |
       | People Ops and Talent Acquisition | United States |
       | Product | All Offices |
       | Product | Brazil |
       | Product | Chile |
       | Product | Colombia |
       | Product | Mexico |
       | Product | United Arab Emirates |
       | Product | United States |
       | Product Marketing | All Offices |
       | Product Marketing | Brazil |
       | Product Marketing | Chile |
       | Product Marketing | Colombia |
       | Product Marketing | Mexico |
       | Product Marketing | United Arab Emirates |
       | Product Marketing | United States |
       | Sales and Business Development | All Offices |
       | Sales and Business Development | Brazil |
       | Sales and Business Development | Chile |
       | Sales and Business Development | Colombia |
       | Sales and Business Development | Mexico |
       | Sales and Business Development | United Arab Emirates |
       | Sales and Business Development | United States |
       | You Don't See a Role You're Interested In? | All Offices |
       | You Don't See a Role You're Interested In? | Brazil |
       | You Don't See a Role You're Interested In? | Chile |
       | You Don't See a Role You're Interested In? | Colombia |
       | You Don't See a Role You're Interested In? | Mexico |
       | You Don't See a Role You're Interested In? | United Arab Emirates |
       | You Don't See a Role You're Interested In? | United States |