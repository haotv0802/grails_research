package converter

import grails_research.Item

class ItemsController {
    static responseFormats = ['json']

    def list() {
        respond Item.list()
    }

    def getItemById() {
        respond Item.findById(params.id).categories
    }
}
