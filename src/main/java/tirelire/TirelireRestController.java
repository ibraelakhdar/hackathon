package tirelire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tirelire.job.CompteJob;

/**
 * Created by sleroy on 19/05/17.
 */
@RestController
public class TirelireRestController {

    @Autowired
    CompteJob compteJob;

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello";
    }


    @RequestMapping(value = "/api/solde", method = RequestMethod.GET)
    public Double getSolde(@RequestParam(required = true, value="login") final String login) {
        //return compteJob.getSold(login);
        return new Double(500);
    }
    @RequestMapping(value = "/api/addSolde", method = RequestMethod.GET)
    public Double add(@RequestParam(required = true, value="login") final String login,
                      @RequestParam(required = true, value="login") final Double solde) {
        //return compteJob.getSold(login);
        return new Double(500+solde);
    }



}
