package br.com.nttdata.desafios.mappers;

import br.com.nttdata.desafios.dtos.response.AlunoPostResponse;
import br.com.nttdata.desafios.entitys.Aluno;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AlunoToResponseMapper {

    public AlunoPostResponse toResponse(Aluno aluno);
}
