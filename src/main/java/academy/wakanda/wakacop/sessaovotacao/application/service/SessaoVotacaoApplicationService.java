package academy.wakanda.wakacop.sessaovotacao.application.service;

import org.springframework.stereotype.Service;

import academy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaRequest;
import academy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaResponse;
import academy.wakanda.wakacop.sessaovotacao.application.repository.SessaoVotacaoRepository;
import academy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class SessaoVotacaoApplicationService implements SessaoVotacaoService {

	private final SessaoVotacaoRepository sessaoVotacaoRepository;

	@Override
	public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
		log.info("[inicia] SessaoVotacaoApplicationService - abreSessao");
		SessaoVotacao sessaoSalva = sessaoVotacaoRepository.salvaSessao(new SessaoVotacao(sessaoAberturaRequest));
		log.info("[finaliza] SessaoVotacaoApplicationService - abreSessao");
		return new SessaoAberturaResponse(sessaoSalva);
	}

}
