package academy.wakanda.wakacop.pauta.infra;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import academy.wakanda.wakacop.pauta.application.repository.PautaRepository;
import academy.wakanda.wakacop.pauta.domain.Pauta;
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

	@Override
	public Pauta buscaPautaPorId(UUID idPauta) {
		log.info("[start] PautaInfraRepository - buscaPautaPorId");
		Pauta pautaId = pautaInfraJpaRepository.findById(idPauta).orElseThrow(
				() -> new RuntimeException());
		log.info("[finish] PautaInfraRepository - buscaPautaPorId");
		return pautaId;
	}

}
