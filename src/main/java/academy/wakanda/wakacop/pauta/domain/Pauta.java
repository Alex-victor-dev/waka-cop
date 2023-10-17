package academy.wakanda.wakacop.pauta.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Pauta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
	private UUID idPauta;
	@NotBlank
	private String titulo;
	@NotBlank
	private String descricao;
	@NotNull
	private UUID idAssociadoAutor;
	private LocalDateTime dataCriacao;
}
