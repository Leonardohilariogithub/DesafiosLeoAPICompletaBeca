package br.com.nttdata.desafios.mappers;

import br.com.nttdata.desafios.dtos.request.AlunoPostRequest;
import br.com.nttdata.desafios.entitys.Aluno;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AlunoUpdate {

    public void atualizar(AlunoPostRequest alunoPostRequest, @MappingTarget Aluno aluno);
}
