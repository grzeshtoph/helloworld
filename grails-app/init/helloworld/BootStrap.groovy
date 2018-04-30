package helloworld

class BootStrap {

    def init = { servletContext ->
        environments {
            production {
                System.out.println("Bootstrap for prod")
            }
            development {
                System.out.println("Bootstrap for dev")
            }
        }
    }
    def destroy = {
    }
}
