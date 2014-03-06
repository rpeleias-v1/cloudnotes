modules = {
    application {
        resource url:'js/application.js'
    }

    custom {
        resource url:'css/jumbotron.css'
    }

    jquerygrails {
    	dependsOn 'jquery, jquery-ui'
    }
}