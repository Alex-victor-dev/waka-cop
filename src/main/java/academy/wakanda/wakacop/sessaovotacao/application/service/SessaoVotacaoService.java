package academy.wakanda.wakacop.sessaovotacao.application.service;

import javax.validation.Valid;

import academy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaRequest;
import academy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaResponse;

public interface SessaoVotacaoService {

	SessaoAberturaResponse abreSessao(@Valid SessaoAberturaRequest sessaoAberturaRequest);

}
