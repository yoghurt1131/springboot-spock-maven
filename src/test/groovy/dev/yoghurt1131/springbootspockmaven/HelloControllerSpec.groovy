package dev.yoghurt1131.springbootspockmaven

import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

class HelloControllerSpec extends Specification {

    MockMvc mockMvc

    def setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build()
    }

    def "test"() {
        def actual
        when:
        actual = mockMvc.perform(get("/greet"))
                        .andReturn().getResponse()
        then:
        actual.getStatus() == 200
        actual.getContentAsString() == "Hello, Spock"
    }
}
