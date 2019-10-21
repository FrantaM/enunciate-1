package com.github.frantam.enunciate1

import spock.lang.Specification
import static org.hamcrest.Matchers.*
import static spock.util.matcher.HamcrestSupport.that

class Enunciate1Spec extends Specification {

    void "should generate type info for operation 1"() {
        given:
        File docsDir = new File(System.getProperty("enunciate-dir"), "docs")
        List<String> docs = docsDir.list().toList()

        expect:
        verifyAll {
            that docs, hasItems("json_Operation1.html", "json_Operation1A.html", "json_Operation1B.html")
            that docs, hasItems("json_Operation2.html", "json_Operation2A.html", "json_Operation2B.html")
        }
    }

}
