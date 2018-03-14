import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import util.CeasarCipherUtil;

@EnableAutoConfiguration
@RestController
public class CeasarCipherApp {

    CeasarCipherUtil ceasarCipherUtil = new CeasarCipherUtil();

    public static void main(String[] args) {
        SpringApplication.run(CeasarCipherApp.class, args);
    }

    @RequestMapping(value = "/encipher", method = RequestMethod.GET)
    public String encipher(@RequestParam("text") String text, @RequestParam("shift") int shift) {
        return ceasarCipherUtil.encipher(text.toUpperCase(), shift);
    }

    @RequestMapping(value = "/decipher", method = RequestMethod.GET)
    public String decipher(@RequestParam("text") String text, @RequestParam("shift") int shift) {
        return ceasarCipherUtil.decipher(text.toUpperCase(), shift);
    }
}
