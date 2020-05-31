import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {

    // use command "spring run HelloController.groovy" to run
    @RequestMapping("/")
    def hello() {
        return "Hello Zhang";
    }
}