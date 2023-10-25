package academy.wakanda.wakacop.sessaovotacao.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import academy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;

public interface SessaoVotacaoInfraJpaRepository extends JpaRepository<SessaoVotacao, UUID> {

}
