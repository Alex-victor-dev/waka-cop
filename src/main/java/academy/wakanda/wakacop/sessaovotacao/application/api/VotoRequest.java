package academy.wakanda.wakacop.sessaovotacao.application.api;

import academy.wakanda.wakacop.sessaovotacao.domain.OpcaoVoto;
import lombok.Getter;

@Getter
public class VotoRequest {

	private String cpfAssociado;
	private OpcaoVoto opcaoVoto;

}
