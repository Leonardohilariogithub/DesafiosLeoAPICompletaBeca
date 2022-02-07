package br.com.nttdata.desafios.mappers;

import br.com.nttdata.desafios.dtos.response.ProdutoCursosResponse;
import br.com.nttdata.desafios.entitys.ProdutoCursos;
import org.mapstruct.Mapper;

@Mapper
public interface ProdutoCursosToProdutoCursoResponse {

    public ProdutoCursosResponse toResponse(ProdutoCursos produtoCursos);
}
