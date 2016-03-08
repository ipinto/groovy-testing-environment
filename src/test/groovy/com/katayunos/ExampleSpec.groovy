package com.katayunos

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Example class to delete before the kata starts
 */
class ExampleSpec extends Specification {

    def setup() {}

    def cleanup() {}

    @Unroll
    def "Multiply two numbers: #a * #b == #expectedResult"() {
        given:
        Example example = new Example()

        when:
        def result = example.multiply(a, b)

        then:
        result == expectedResult

        where:
        a   | b || expectedResult
        1   | 1 || 1
        -3  | 2 || -6
        0   | 8 || 0
        1.5 | 3 || 4.5
    }

}
