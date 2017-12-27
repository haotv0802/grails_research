package converter

import grails_research.Person

class PersonController {
    static responseFormats = ['json', 'html']

    static allowedMethods = [save: "POST", list: "GET"]

    def save() {

        def p = new Person(name: "Fred", age: 45, lastVisit: new Date())
        p.save()

//        def list = new ArrayList()
//        def book = new Book()
//        book.name = "new book"
//        book.year = "1234"
//        list.add(book)
//
//        book = new Book()
//        book.name = "new book1"
//        book.year = "1232224"
//        list.add(book)
//        respond list

        p.save()
        respond p
    }

    def list() {
        respond Person.list()
    }
}
