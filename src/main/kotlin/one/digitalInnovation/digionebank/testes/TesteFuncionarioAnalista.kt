package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Analista
import one.digitalInnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val joca = Analista("Joca Silva", "123456789",2000.0)

    imprimeRelatorioFuncionario.imprime(joca)
}
