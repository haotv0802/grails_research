package converter

import grails.converters.JSON
import grails_research.Category

class CategoriesController {

    static responseFormats = ['json', 'html']

    def listCategories() {
//        respond Category.list()
        render Category.list() as JSON
    }

    def save() {

        def category = new Category()
        category.name = "new category"
        category.url = "new url" + new Date()
        category.source = "bds.com"
        category.type = "Selling"
        category.propertyType = "House"
        category.city = "HCM"
        category.district = "Quan 7"
        category.save()
        respond Category.list()
    }

}
