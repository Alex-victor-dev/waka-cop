package academy.wakanda.wakacop.pauta.application.api;

import java.util.UUID;

import academy.wakanda.wakacop.pauta.domain.Pauta;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PautaCadastradaResponse {

	private UUID idPauta;

	public PautaCadastradaResponse(Pauta pauta) {
		this.idPauta = pauta.getIdPauta();
	}
}
