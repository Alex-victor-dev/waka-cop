package academy.wakanda.wakacop.pauta.application.api;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NovaPautaRequest {

	@NotBlank
	private String titulo;
	@NotBlank
	private String descricao;
	@NotNull
	private UUID idAssociadoAutor;

}
