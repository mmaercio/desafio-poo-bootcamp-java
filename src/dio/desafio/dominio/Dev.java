package dio.desafio.dominio;

import java.util.HashSet;
import java.util.Set;

public class Dev {

    private String nome;

    private Set<Conteudo> conteudosInscritos = new HashSet<>();
    private Set<Conteudo> conteudosConcluidos = new HashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        if (!conteudosInscritos.isEmpty()) {
            Conteudo conteudo = conteudosInscritos.iterator().next();
            conteudosConcluidos.add(conteudo);
            conteudosInscritos.remove(conteudo);
        } else {
            System.out.println("Nenhum conteúdo para progredir");
        }
    }

    public double calcularXp() {
        double total = 0;
        for (Conteudo c : conteudosConcluidos) {
            total += c.calcularXp();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}