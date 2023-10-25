package academy.wakanda.wakacop.sessaovotacao.application.api;

import org.springframework.web.bind.annotation.RestController;

import academy.wakanda.wakacop.sessaovotacao.application.service.SessaoVotacaoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class SessaoVotacaoController implements SessaoVotacaoAPI {

	private final SessaoVotacaoService sessaoVotacaoService;

	@Override
	public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
		log.info("[inicia] SessaoVotacaoController - abreSessao");
		SessaoAberturaResponse sessaoVotacaoResponse = sessaoVotacaoService.abreSessao(sessaoAberturaRequest);
		log.info("[finaliza] SessaoVotacaoController - abreSessao");
		return sessaoVotacaoResponse;
	}

}
