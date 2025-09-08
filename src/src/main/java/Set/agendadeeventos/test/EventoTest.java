package Set.agendadeeventos.test;

import Set.agendadeeventos.dominio.Evento;

import java.time.LocalDateTime;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class EventoTest {
    public static void main(String[] args) {
        NavigableSet<Evento> eventos = new TreeSet<>();

        Evento ev1 = new Evento("Evento soujava", LocalDateTime.of(2025, 10, 22, 8, 30));
        Evento ev2 = new Evento("Palestra SoftSkills", LocalDateTime.of(2025, 10, 28, 17, 0));
        Evento ev3 = new Evento("Hackaton Java", LocalDateTime.of(2025, 12, 10, 20, 30));
        Evento ev4 = new Evento("Evento de Tecnologia", LocalDateTime.of(2025, 9, 8, 14, 0));
        Evento ev5 = new Evento("Palestra CyberSec", LocalDateTime.of(2026, 1, 17, 15, 45));
        Evento ev6 = new Evento("Aulão Prof. Isidro", LocalDateTime.of(2025, 11, 1, 13, 0));

        eventos.add(ev1);
        eventos.add(ev2);
        eventos.add(ev3);
        eventos.add(ev4);
        eventos.add(ev5);
        eventos.add(ev6);

        LocalDateTime inicioIntervalo = LocalDateTime.of(2025, 9, 1, 13, 0);
        LocalDateTime fimIntervalo = LocalDateTime.of(2025, 12, 1, 15, 0);

        Evento marcaInicio = new Evento(null, inicioIntervalo);
        Evento marcaFim = new Evento(null, fimIntervalo);

        NavigableSet<Evento> eventosIntervalo = eventos.subSet(marcaInicio, true, marcaFim, true);

        for (Evento evento : eventosIntervalo) {
            System.out.println(evento);
        }
    }
}
