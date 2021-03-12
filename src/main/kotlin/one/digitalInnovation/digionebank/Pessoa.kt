package one.digitalInnovation.digionebank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.123.123-11"
}

fun main() {
    var jether = Pessoa()

    println(jether.nome)
    println(jether.cpf)
}