package academy.wakanda.wakacop.sessaovotacao.infra;

import org.springframework.stereotype.Repository;

import academy.wakanda.wakacop.sessaovotacao.application.repository.SessaoVotacaoRepository;
import academy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
@RequiredArgsConstructor
public class SessaoVotacaoInfraRepository implements SessaoVotacaoRepository {

	private final SessaoVotacaoInfraJpaRepository sessaoVotacaoInfraJpaRepository;

	@Override
	public SessaoVotacao salvaSessao(SessaoVotacao sessaoVotacao) {
		log.info("[inicia] SessaoVotacaoInfraRepository - salvaSessao");
		sessaoVotacaoInfraJpaRepository.save(sessaoVotacao);
		log.info("[finaliza] SessaoVotacaoInfraRepository - salvaSessao");
		return sessaoVotacao;
	}

}
