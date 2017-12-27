package converter

import grails_research.Person

class PersonController {
    static responseFormats = ['json', 'html']

    static allowedMethods = [save: "POST", list: "GET"]

    def save() {

//        def p = new Person(params.person)
//        p.save(flush: true)
//        respond p
        System.out.println(request.JSON)
//        respond Person.list()
        def p = new Person(request.JSON)
        p.save()
        respond p
    }

    def list() {
        respond Person.list()
    }
}
