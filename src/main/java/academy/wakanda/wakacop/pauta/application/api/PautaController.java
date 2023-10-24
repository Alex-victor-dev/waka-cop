package academy.wakanda.wakacop.pauta.application.api;

import org.springframework.web.bind.annotation.RestController;

import academy.wakanda.wakacop.pauta.application.service.PautaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class PautaController implements PautaAPI {

	private final PautaService pautaService;

	@Override
	public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
		log.info("[Start] PautaController - cadastraPauta");
		PautaCadastradaResponse pautaResponse = pautaService.cadastraPauta(novaPauta);
		log.info("[finish] PautaController - cadastraPauta");
		return pautaResponse;
	}

}
