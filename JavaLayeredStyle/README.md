Descripción del caso de uso

Para esta aplicaci[on se realiza la simulaci[on de un caso en donde se requiere realizar el pago de de una hipoteca

Modelo (PagoHipoteca.java): Representa un pago de hipoteca, con propiedades como ID, cuenta y monto.
Repositorio (PagoHipotecaRepository.java): Almacena y recuperar los pagos de hipoteca en una base de datos simulada.
Servicio (PagoHipotecaService.java): Contiene la lógica de negocio y se comunica con el repositorio.
Controlador (PagoHipotecaController.java): Maneja las solicitudes del cliente y utiliza el servicio para realizar operaciones.
Main.java: Permite al usuario ingresar los datos de un pago de hipoteca por consola, guarda el pago y luego lo recupera para mostrar la información.
