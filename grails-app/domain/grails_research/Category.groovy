package grails_research

class Category {

    String name
    String url
    String source
    String type
    String propertyType
    String city
    String district

    static mapping = {
        table 'crwlr_categories'
    }
}
