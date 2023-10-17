package academy.wakanda.wakacop.pauta.domain.application.api;

import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NovaPautaRequest {

	@NotNull
	private String titulo;
	@NotNull
	private String descricao;

}
