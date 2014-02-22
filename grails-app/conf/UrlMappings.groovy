class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/$code?"(controller: "note", action: "index")
		"500"(view:'/error')
	}
}
