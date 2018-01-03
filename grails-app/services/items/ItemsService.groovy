package items

import grails.gorm.transactions.Transactional
import grails_research.Item

@Transactional
class ItemsService {

    def getAllItems() {
        return Item.list()
    }
}
