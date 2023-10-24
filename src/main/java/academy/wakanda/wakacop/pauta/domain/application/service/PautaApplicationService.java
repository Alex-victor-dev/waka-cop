package academy.wakanda.wakacop.pauta.domain.application.service;

import org.springframework.web.bind.annotation.RestController;

import academy.wakanda.wakacop.pauta.domain.Pauta;
import academy.wakanda.wakacop.pauta.domain.application.api.NovaPautaRequest;
import academy.wakanda.wakacop.pauta.domain.application.api.PautaCadastradaResponse;
import academy.wakanda.wakacop.pauta.domain.application.repository.PautaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class PautaApplicationService implements PautaService {

	private final PautaRepository pautaRepository;

	@Override
	public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
		log.info("[Start] PautaApplicationService - cadastraPauta");
		log.info("[novaPauta] {}", novaPauta);		
		Pauta pauta = pautaRepository.salvaNovaPauta(new Pauta(novaPauta));
		log.info("[finish] PautaApplicationService - cadastraPauta");
		return new PautaCadastradaResponse(pauta);
	}

}
