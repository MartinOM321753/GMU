package utez.edu.mx.gmuback.utils;

import org.springframework.http.HttpStatus;

public class APIResponse {
    public String message;
    public Object data;
    public  boolean error;
    public HttpStatus status;

    //Mandar un mensaje

    public APIResponse(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }

    //mandar un mensaje y un objeto
    public APIResponse(String message, Object data, HttpStatus status) {
        this.message = message;
        this.data = data;
        this.status = status;
    }
    //mandar un mensaje de error
    public APIResponse(String message, boolean error, HttpStatus status) {
        this.message = message;
        this.error = error;
        this.status = status;
    }

}
