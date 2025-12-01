package models

import util.Nivel

data class Formacao(
    val nome: String,
    val nivel: Nivel,
    val conteudos: List<ConteudoEducacional>
) {
    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("✔ ${usuario.nome} matriculado na formação \"$nome\".")
    }

    fun listarInscritos() {
        println("👥 Alunos matriculados em $nome:")
        if (inscritos.isEmpty()) {
            println("Nenhum aluno matriculado ainda.")
        } else {
            inscritos.forEach { println("- ${it.nome}") }
        }
    }
}
