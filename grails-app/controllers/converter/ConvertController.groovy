package converter

import grails_research.Person

class ConvertController {
    static responseFormats = ['json', 'html']

    def index() { }

    def result() {
        def euros = params.usValue.toInteger() * 0.75
        render(view: "result", model: [euros: euros])
    }
}