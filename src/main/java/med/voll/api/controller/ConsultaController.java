package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.agendamento.DadosAgendamentoConsulta;
import med.voll.api.domain.agendamento.DadosDetalhamentoConsulta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consultas")
public class ConsultaController {

    @PostMapping
    public ResponseEntity agendar(@RequestBody @Valid DadosAgendamentoConsulta dados){
        return ResponseEntity.ok(new DadosDetalhamentoConsulta(null, null, null));

    }
}