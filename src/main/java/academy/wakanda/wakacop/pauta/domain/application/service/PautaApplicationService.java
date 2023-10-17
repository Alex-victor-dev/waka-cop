package academy.wakanda.wakacop.pauta.domain.application.service;

import org.springframework.web.bind.annotation.RestController;

import academy.wakanda.wakacop.pauta.domain.application.api.NovaPautaRequest;
import academy.wakanda.wakacop.pauta.domain.application.api.PautaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class PautaApplicationService implements PautaService {

	@Override
	public PautaResponse cadastraPauta(NovaPautaRequest novaPauta) {
		log.info("[Start] PautaApplicationService - cadastraPauta");
		return null;
	}

}
