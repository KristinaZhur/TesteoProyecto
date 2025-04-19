Feature: Sistema de la frontera

  Scenario: Viajero desea cruzar la frontera
    Given que el viajero tiene un pasaporte valido
    When el viajero intenta pasar la frontera
    Then el viajero deberia ser autorizado y entrar al pais

  Scenario: Viajero no esta autorizado y intenta pasar la frontera
    Given que el viajero tiene un pasaporte no valido
    When el viajero intenta pasar la frontera
    Then el viajero deberia haber sido rechazado y no haber podido entrar al país