package converter

import auth.Role
import auth.User
import auth.UserRole
import grails.plugin.springsecurity.annotation.Secured
import grails_research.Item

class ItemsController {
  static responseFormats = ['json', 'html']

  def itemsService

  def list() {
    User admin = new User(username: 'admin', password: 'secret', enabled: true).save()
    User john = new User(username: 'john', password: 'secret', enabled: true).save()
    User jane = new User(username: 'jane', password: 'secret', enabled: true).save()
    Role royalty = new Role(authority: 'ROLE_ROYALTY').save()
    Role common = new Role(authority: 'ROLE_COMMON').save()
    UserRole.create(admin, royalty)
    UserRole.create(admin, common)
    UserRole.create(john, common)
    respond itemsService.getAllItems()
  }

  @Secured(['ROLE_ROYALTY'])
  def getItemsByCriterion() {
    respond itemsService.getAllItemsByCriterion(params.contactName, params.contactEmail)
    render params.contactName
  }

  def getItemById() {
    respond Item.findById(params.id).categories
  }
}
