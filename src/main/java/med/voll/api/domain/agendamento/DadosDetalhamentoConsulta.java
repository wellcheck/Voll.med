package med.voll.api.domain.agendamento;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(Long idMedico, Long idPaciente, LocalDateTime data) {
}
