package br.com.nttdata.desafios.mappers;

import br.com.nttdata.desafios.dtos.request.ProdutoCursosPostRequest;
import br.com.nttdata.desafios.entitys.ProdutoCursos;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProdutoCursosUpdate {

    public void atualizar( ProdutoCursosPostRequest produtoCursosPostRequest,@MappingTarget ProdutoCursos produtoCursos);
}
