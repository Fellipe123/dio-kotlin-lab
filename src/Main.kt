import models.ConteudoEducacional
import models.Formacao
import models.Usuario
import util.Nivel

fun main() {

    val kotlinBasico = ConteudoEducacional("Introdução ao Kotlin", 60)
    val poo = ConteudoEducacional("Programação Orientada a Objetos", 90)
    val colecoes = ConteudoEducacional("Coleções em Kotlin", 45)

    val formacaoKotlin = Formacao(
        nome = "Formação Kotlin Developer",
        nivel = Nivel.INTERMEDIARIO,
        conteudos = listOf(kotlinBasico, poo, colecoes)
    )

    val aluno1 = Usuario("Maria")
    val aluno2 = Usuario("João")

    formacaoKotlin.matricular(aluno1)
    formacaoKotlin.matricular(aluno2)

    println()
    formacaoKotlin.listarInscritos()

    println("\n📘 Conteúdos da formação:")
    formacaoKotlin.conteudos.forEach {
        println("- ${it.nome} (${it.duracao} minutos)")
    }
}