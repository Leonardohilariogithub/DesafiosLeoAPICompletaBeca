package br.com.nttdata.desafios.mappers;

import br.com.nttdata.desafios.dtos.request.ProdutoCursosPostRequest;
import br.com.nttdata.desafios.entitys.ProdutoCursos;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoCursosMapper {
    public ProdutoCursos toModel(ProdutoCursosPostRequest produtoCursosPostRequest);
}
