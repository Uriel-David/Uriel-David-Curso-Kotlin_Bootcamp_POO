package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Cliente
import one.digitalInnovation.digionebank.ClienteTipo

fun main() {
    val juvenal = Cliente(
        nome = "Juvenal silva",
        cpf = "123.123.123-99",
        clienteTipo = ClienteTipo.PF,
        senha = "123456")

    println(juvenal)
    TesteAutenticacao().autentica(juvenal)
}