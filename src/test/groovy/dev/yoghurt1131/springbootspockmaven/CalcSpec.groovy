package dev.yoghurt1131.springbootspockmaven

import spock.lang.Specification

class CalcSpec extends Specification {

    def "assert 1"() {
        when:
        def answer = 1+1
        then:
        answer == 2
    }

    def "assert 2"() {
        when:
        def answer = 1+2
        then:
        answer == 3
    }
}
