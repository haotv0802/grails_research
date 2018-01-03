package converter

import grails_research.Item
import items.ItemsService

class ItemsController {
    static responseFormats = ['json']

    def itemsService

    def list() {
        respond itemsService.getAllItems()
    }

    def getItemById() {
        respond Item.findById(params.id).categories
    }
}
