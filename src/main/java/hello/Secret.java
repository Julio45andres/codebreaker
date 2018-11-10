package hello;

public class Secret {
    private String secret;


    @Override
    public String toString() {
        return "Secret{" +
                "secret='" + secret + '\'' +
                '}';
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
