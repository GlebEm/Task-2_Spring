import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class Cat {
    private String message;

    public String getVoice() {
        return message;
    }

    public void setVoice(String message) {
        this.message = message;
    }

}
