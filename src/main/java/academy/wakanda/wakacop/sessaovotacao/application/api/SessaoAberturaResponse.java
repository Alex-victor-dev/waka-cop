package academy.wakanda.wakacop.sessaovotacao.application.api;

import java.util.UUID;

import academy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SessaoAberturaResponse {

	private UUID idSessao;

	public SessaoAberturaResponse(SessaoVotacao sessaoSalva) {
		this.idSessao = sessaoSalva.getId();
	}

}
