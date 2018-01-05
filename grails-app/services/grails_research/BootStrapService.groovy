package grails_research

import auth.Role
import auth.User
import auth.UserRole
import grails.gorm.transactions.Transactional

@Transactional
class BootStrapService {

  def init = { servletContext ->
    User admin = new User(username: 'admin', password: 'secret', enabled: true).save()
    User john = new User(username: 'john', password: 'secret', enabled: true).save()
    User jane = new User(username: 'jane', password: 'secret', enabled: true).save()
    Role royalty = new Role(authority: 'ROLE_ROYALTY').save()
    Role common = new Role(authority: 'ROLE_COMMON').save()
    UserRole.create(admin, royalty)
    UserRole.create(admin, common)
    UserRole.create(john, common)
  }
  def destroy = {
  }
}
