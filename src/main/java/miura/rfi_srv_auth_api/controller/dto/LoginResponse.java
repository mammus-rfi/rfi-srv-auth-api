package miura.rfi_srv_auth_api.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}