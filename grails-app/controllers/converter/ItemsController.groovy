package converter

import grails.converters.JSON
import grails_research.Item

class ItemsController {
  static responseFormats = ['json', 'html']

  def itemsService

  def list() {
    respond itemsService.getAllItems()
  }

  def getItemsByCriterion() {
    respond itemsService.getAllItemsByCriterion(params.contactName, params.contactEmail)
    render params.contactName
  }

  def getItemById() {
    respond Item.findById(params.id).categories
  }
}
