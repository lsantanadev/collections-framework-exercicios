package Set.agendadeeventos.dominio;

import java.time.LocalDateTime;
import java.util.Objects;

public class Evento implements Comparable<Evento> {
    private String nome;
    private LocalDateTime dataHora;

    public Evento(String nome, LocalDateTime dataHora) {
        this.nome = nome;
        this.dataHora = dataHora;
    }

    public Evento() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(nome, evento.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public int compareTo(Evento evento) {
        return this.dataHora.compareTo(evento.dataHora);
    }
}
