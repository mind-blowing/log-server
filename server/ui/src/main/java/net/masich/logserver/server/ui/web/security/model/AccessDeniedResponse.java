package net.masich.logserver.server.ui.web.security.model;

public class AccessDeniedResponse {

    private String message;

    public AccessDeniedResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
