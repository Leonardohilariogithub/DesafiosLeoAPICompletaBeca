package br.com.nttdata.desafios.dtos.response;

public class AlunoPostResponse {

     private Long matricula;
     private String mensagem;

     public AlunoPostResponse() {
     }

     public AlunoPostResponse(Long matricula, String mensagem) {
          this.matricula = matricula;
          this.mensagem = mensagem;
     }

     public Long getMatricula() {
          return matricula;
     }

     public void setMatricula(Long matricula) {
          this.matricula = matricula;
     }

     public String getMensagem() {
          return mensagem;
     }

     public void setMensagem(String mensagem) {
          this.mensagem = mensagem;
     }
}
