package helloworld

class HelloController {

    def index() {
        render "Hello World!"
    }

    def hello() {
        def recipient = grailsApplication.config.getProperty('foo.bar.hello')
        def max = grailsApplication.config.getProperty('foo.bar.max.hellos', Integer, 10)
        def greeting = grailsApplication.config.getProperty('foo.bar.greeting', 'Hello')
        def path = grailsApplication.config.getProperty('foo.bar.path', 'none')
        def specProp = grailsApplication.config.getProperty('spec.prop');

        render "${greeting} ${recipient}, max ${max} times! ${specProp}. ${path}"
    }
}
