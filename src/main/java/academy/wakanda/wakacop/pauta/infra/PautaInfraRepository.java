package academy.wakanda.wakacop.pauta.infra;

import org.springframework.stereotype.Repository;

import academy.wakanda.wakacop.pauta.domain.Pauta;
import academy.wakanda.wakacop.pauta.domain.application.repository.PautaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
@RequiredArgsConstructor
public class PautaInfraRepository implements PautaRepository {

	private final PautaInfraJpaRepository pautaInfraJpaRepository;

	@Override
	public Pauta salvaNovaPauta(Pauta pauta) {
		log.info("[start] PautaInfraRepository - salvaNovaPauta");
		pautaInfraJpaRepository.save(pauta);
		log.info("[finish] PautaInfraRepository - salvaNovaPauta");
		return pauta;
	}

}
