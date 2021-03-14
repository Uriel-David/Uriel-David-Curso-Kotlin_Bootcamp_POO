package one.digitalInnovation.digionebank.testes


import one.digitalInnovation.digionebank.Funcionario
import one.digitalInnovation.digionebank.Gerente

fun main() {
    val jana = Gerente("Janaina", "123456789", 5000.0)

    imprimeRelatorioFuncionario.imprime(jana)
}
