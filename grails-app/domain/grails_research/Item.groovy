package grails_research

class Item {

    String name
    String address
    String description
    String contactName
    String contactNumber
    String contactEmail
    BigDecimal acreage
    BigDecimal price
    String district
    String city
    Date publishDate
    Date endDate
    String url
    static hasMany = [categories: Category]

    static constraints = {
    }

    static mapping = {
        table 'crwlr_items'
        contactName column: "contact_name"
        contactNumber column: "contact_number"
        publishDate column: "publish_date"
        endDate column: "end_date"
        categories joinTable: [name: "crwlr_categories_items_details", key: "item_id"]
        categories lazy: false
    }
}
