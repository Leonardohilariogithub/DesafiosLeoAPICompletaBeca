package br.com.nttdata.desafios.exceptions.handle;

import br.com.nttdata.desafios.exceptions.TamanhoNaoValidoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class TramentoDeErrosDefaultAplication {

    @ExceptionHandler(TamanhoNaoValidoException.class)
    public ResponseEntity <DefaultExeption> handle(TamanhoNaoValidoException e){
        DefaultExeption defaultExeption = new DefaultExeption();
        defaultExeption.setMensagem(e.getMessage());
        defaultExeption.setDataHora(LocalDateTime.now());
        defaultExeption.setStatus(HttpStatus.NOT_ACCEPTABLE.value());

       return ResponseEntity.status(defaultExeption.getStatus()).body(defaultExeption);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity <DefaultExeption> handle(MethodArgumentNotValidException e){
        DefaultExeption defaultExeption = new DefaultExeption();
        defaultExeption.setMensagem("Campo nulo ou negativo não permitido!");
        defaultExeption.setDataHora(LocalDateTime.now());
        defaultExeption.setStatus(HttpStatus.BAD_REQUEST.value());

        return ResponseEntity.status(defaultExeption.getStatus()).body(defaultExeption);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity <DefaultExeption> handle(HttpMessageNotReadableException e){
        DefaultExeption defaultExeption = new DefaultExeption();
        defaultExeption.setMensagem("Coloque um valor agora!");
        defaultExeption.setDataHora(LocalDateTime.now());
        defaultExeption.setStatus(HttpStatus.BAD_REQUEST.value());

        return ResponseEntity.status(defaultExeption.getStatus()).body(defaultExeption);
    }


}
