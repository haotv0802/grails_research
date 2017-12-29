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

    static constraints = {
    }

    static mapping = {
        table 'crwlr_items'
        contactName column: "contact_name"
        contactNumber column: "contact_number"
        publishDate column: "publish_date"
        endDate column: "end_date"
    }
}
