package com.cloudnotes



import org.junit.*
import grails.test.mixin.*
import grails.datastore.test.DatastoreUnitTestMixin

@TestFor(ContactController)
@Mixin(DatastoreUnitTestMixin)
@Mock(Contact)
class ContactControllerTests {
    
    void testContactCreation() {        
        def model = controller.contact()
        assert model.contact != null
    }

    
}
