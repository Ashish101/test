package sampleapp

class SampleController {

    def index() {

		withHttp(uri: "http://www.google.com") {
			def html = get(path : '/search', query : [q:'Groovy'])
			println html.HEAD.size()
			println html.BODY.size()
		}
		render "Hiiii..."
	}
}
