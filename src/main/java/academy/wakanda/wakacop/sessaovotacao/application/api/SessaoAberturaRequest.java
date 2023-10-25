package academy.wakanda.wakacop.sessaovotacao.application.api;

import java.util.Optional;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SessaoAberturaRequest {

	@NotNull
	private UUID idPauta;
	private Integer tempoDuracao;

	public Optional<Integer> getTempoDuracao() {
		return Optional.ofNullable(this.tempoDuracao);
	}
}
