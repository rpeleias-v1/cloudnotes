class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/$code?"(controller: "note", action: "index")
		//"/contact/$code?"(controller: "contact", action: "contact")
		"500"(view:'/error')
	}
}
