package academy.wakanda.wakacop.sessaovotacao.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import academy.wakanda.wakacop.sessaovotacao.application.api.VotoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VotoPauta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
	private UUID idVoto;
	private String cpfAssociado;
	private OpcaoVoto opcaoVoto;
	private LocalDateTime momentoVoto;
	@ManyToOne
	@JoinColumn(name = "sessao_votacao_id")
	private SessaoVotacao sessaoVotacao;

	public VotoPauta(SessaoVotacao sessaoVotacao, VotoRequest votoRequest) {
		this.cpfAssociado = votoRequest.getCpfAssociado();
		this.opcaoVoto = votoRequest.getOpcaoVoto();
		this.momentoVoto = LocalDateTime.now();
		this.sessaoVotacao = sessaoVotacao;
	}

}
