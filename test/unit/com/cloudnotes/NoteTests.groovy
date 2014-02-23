package com.cloudnotes


import grails.test.mixin.*
import org.junit.*
import grails.datastore.test.DatastoreUnitTestMixin

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Note)
@Mixin(DatastoreUnitTestMixin)
@Mock(Note)
class NoteTests {

    void testSuccessNodeCreation() {
       Note note = new Note()
       note.userCode = "testCode"
       note.content = "Test content"
       note.save()

       assert note.id != null
    }

    void testNodeWithoutCodeCreation() {
       Note note = new Note()
       note.userCode = null
       note.content = "Test content"
       note.save()

       assert note.id == null
    }

    void testUniqueUserCode() {
       Note note = new Note()
       note.userCode = "testDouble"
       note.content = "Test content"
       note.save()

       assert note.id != null

       // note with duplicated userCode
       Note duplicatedNote = new Note()
       duplicatedNote.userCode = "testDouble"
       duplicatedNote.content = "Test content"
       duplicatedNote.save()

       assert duplicatedNote.id == null
    }
}
