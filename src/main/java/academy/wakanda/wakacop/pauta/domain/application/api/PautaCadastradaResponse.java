package academy.wakanda.wakacop.pauta.domain.application.api;

import java.util.UUID;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PautaCadastradaResponse {

	private UUID idPauta;

}
