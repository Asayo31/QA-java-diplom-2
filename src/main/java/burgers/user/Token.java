package burgers.user;

import io.qameta.allure.Step;
import lombok.Data;

@Data
public class Token {
    private String accessToken;
    private String refreshToken;

    public Token(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }
}
