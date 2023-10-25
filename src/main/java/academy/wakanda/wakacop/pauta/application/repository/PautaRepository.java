package academy.wakanda.wakacop.pauta.application.repository;

import java.util.UUID;

import academy.wakanda.wakacop.pauta.domain.Pauta;

public interface PautaRepository {

	Pauta salvaNovaPauta(Pauta pauta);

	Pauta buscaPautaPorId(UUID idPauta);

}
