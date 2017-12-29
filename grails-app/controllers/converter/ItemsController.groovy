package converter

import grails_research.Item

class ItemsController {
    static responseFormats = ['json']

    def listItems() {
        respond Item.list()
    }
}
