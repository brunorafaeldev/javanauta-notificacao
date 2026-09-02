package javanauta_notificacao.business.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;

import javanauta_notificacao.business.enums.StatusNotificacaoEnum;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TarefasDTO {



        private String id;
        private String nomeTarefa;
        private String descricaoTarefa;
        @JsonFormat(shape =  JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
        private LocalDateTime dataCriacaoTarefa;
        @JsonFormat(shape =  JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
        private LocalDateTime dataEvento;
        private String emailUsuario;
        @JsonFormat(shape =  JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
        private LocalDateTime dataAlteracaoTarefa;
        private StatusNotificacaoEnum statusNotificacaoEnum;



    }

