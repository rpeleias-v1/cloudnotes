package com.cloudnotes



import grails.test.mixin.*
import org.junit.*
import grails.datastore.test.DatastoreUnitTestMixin

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(NoteController)
@Mixin(DatastoreUnitTestMixin)
@Mock(Note)
class NoteControllerTests {

    void testNoteCreation() {
       controller.params.userCode = "testController"
       def model = controller.index()

       assert model.note.id != null
    }

    void testNullableNotereation() {
       controller.params.userCode = null
       def model = controller.index()

       assert model.note.id != null
    }

    void testSaveNotes() {
    	Note note = new Note(userCode: 'testController')
    	note.save()

    	controller.params.code = 'testController'
    	def searchedNote = controller.saveNotes()

    	assert searchedNote.id != null
    }

    void testUnsavedNotes() {    	
    	controller.params.code = null
    	def searchedNote = controller.saveNotes()

    	assert searchedNote.id == null
    }

    void testUpdateNotes() {
    	Note note = new Note(userCode: 'testController')
    	note.save()
        println note.id
    	controller.params.id = "testController"
    	controller.params.content = "Test Content"
    	def updatedNote = controller.updateNote()

    	assert updatedNote.id != null
    	assert updatedNote.userCode == "testController"
    	assert updatedNote.content == "Test Content"
    }

    void testCodeChanged() {
        Note note = new Note(userCode: 'testController')
        note.save()

        controller.params.userCode = "testController"
        controller.params.newCode = "newCode"
        controller.changeCode()
        assert response.text.contains('/newCode')       
    }

    void testExistedCode() {
        Note note = new Note(userCode: 'testController')
        note.save()

        Note existedCode = new Note(userCode: 'existedCode')
        existedCode.save()

        controller.params.userCode = "testController"
        controller.params.newCode = "existedCode"
        controller.changeCode()
        assert response.text.contains('default.message.existedCode')
    }
}
