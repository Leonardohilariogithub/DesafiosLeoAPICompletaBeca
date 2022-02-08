package br.com.nttdata.desafios.exceptions.handle;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
public class DefaultExeption {

    private Integer status;

    @NotBlank(message = "Name is mandatory")
    @Size(min = 5, max = 50)
    private String mensagem;

    private LocalDateTime dataHora;

}
