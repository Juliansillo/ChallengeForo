package med.voll.api.domain.topicos;
import java.time.LocalDateTime;

public record DatosListadoTopico(Long id, String titulo, String mensaje, String curso, LocalDateTime fechaCreacion, String autor) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getCurso(), topico.getFechaCreacion(), topico.getAutor());
    }
}