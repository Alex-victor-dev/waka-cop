package academy.wakanda.wakacop.pauta.domain.application.service;

import academy.wakanda.wakacop.pauta.domain.application.api.NovaPautaRequest;
import academy.wakanda.wakacop.pauta.domain.application.api.PautaResponse;

public interface PautaService {

	PautaResponse cadastraPauta(NovaPautaRequest novaPauta);

}
