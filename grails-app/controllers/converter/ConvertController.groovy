package converter

import grails.converters.JSON
import grails.converters.XML
import grails_research.Person

class ConvertController {
    static responseFormats = ['json', 'html']

    def index() { }

    def list() {
        def list = new ArrayList()
        def book = new Book()
        book.name = "new book"
        book.year = "1234"
        list.add(book)

        book = new Book()
        book.name = "new book1"
        book.year = "1232224"
        list.add(book)

        render list as JSON
    }

    def renderString() {
        def hello = "Hao Ho"

        render hello
    }

    def result() {
        def euros = params.usValue.toInteger() * 0.75
        render(view: "result", model: [euros: euros])
    }
}