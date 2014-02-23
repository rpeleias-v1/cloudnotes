package com.cloudnotes



import grails.test.mixin.*
import org.junit.*
import grails.datastore.test.DatastoreUnitTestMixin

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(ContactController)
@Mixin(DatastoreUnitTestMixin)
@Mock(Contact)
class ContactControllerTests {

    void testContactRedirect() {
       def model = controller.contact()
       assert model.contact instanceof Contact
    }
}
