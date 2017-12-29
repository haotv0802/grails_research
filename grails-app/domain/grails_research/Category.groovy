package grails_research

class Category {

    String name
    String url
    String source
    String type
    String propertyType
    String city
    String district
    static hasMany = [items: Item]

    static mapping = {
        table 'crwlr_categories'
        items joinTable: [name: "crwlr_categories_items_details", key: "category_id"]
    }
}
