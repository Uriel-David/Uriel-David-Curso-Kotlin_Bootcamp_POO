package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Funcionario

class imprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}