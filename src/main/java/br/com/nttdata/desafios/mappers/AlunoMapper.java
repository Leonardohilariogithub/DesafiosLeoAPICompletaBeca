package br.com.nttdata.desafios.mappers;

import br.com.nttdata.desafios.dtos.request.AlunoPostRequest;
import br.com.nttdata.desafios.entitys.Aluno;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AlunoMapper { //Entra alunoResquest e sai ALUNO

   public Aluno toModel(AlunoPostRequest alunoPostRequest);
}
