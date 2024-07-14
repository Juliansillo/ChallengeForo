package med.voll.api.domain.topicos;
import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion, String curso, String autor) {
    public DatosRespuestaTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getCurso(), topico.getAutor());
    }
}