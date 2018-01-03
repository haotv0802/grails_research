package items

import grails.gorm.transactions.Transactional
import grails_research.Item

@Transactional
class ItemsService {

    def getAllItems() {
        return Item.list()
    }

    def getAllItemsByCriterion(String name, String email) {
        return Item.findAll("from Item as i where i.contactName like ? and i.contactEmail like ?"
            , name == null ? "%" : "%" + name + "%"
            , email == null ? "%" : "%" + email + "%")
    }

}
