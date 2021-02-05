package dev.yoghurt1131.springbootspockmaven


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class SpockBeanSpec extends Specification {

    @Autowired(required=false)
    private HelloController controller

    def "when context is loaded then all expected beans are created"() {
        expect: "the HelloController is created"
        controller
    }
}
