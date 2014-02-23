package com.cloudnotes



import grails.test.mixin.*
import org.junit.*
import grails.datastore.test.DatastoreUnitTestMixin

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Contact)
@Mixin(DatastoreUnitTestMixin)
@Mock(Contact)
class ContactTests {

    void testContactCreation() {
       Contact contact = new Contact()
       contact.email = 'teste@guiato.com.br'
       contact.userName = "Matutinho"
       contact.content = "Help me!!"
       contact.save()

       assert contact.id != null
    }

     void testWrongEmailContactCreation() {
       Contact contact = new Contact()
       contact.email = 'rodrigotesteguiato.com.br'
       contact.userName = "Matutinho"
       contact.content = "Help me!!"
       contact.save()

       assert contact.id == null
    }
}
