import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

////В классе AppConfig, по аналогии, создайте бин с именем “cat”.
//Настройте этот бин так, чтобы он создавался новым при каждом запросе.
// нужно, чтобы бин создавался не один раз во время старта приложения,
// а каждый раз во время вызова бина. Для этого нужно указать Scope для бина, в вашем случае - это prototype
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
