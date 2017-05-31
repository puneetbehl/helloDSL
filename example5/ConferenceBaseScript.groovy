import static Level.INTERMEDIATE
import static Level.BEGINER

abstract class ConferenceBaseScript extends Script {
	static List cfps = []
	
	abstract void scriptBody()                              
	
	static def cfp(@DelegatesTo(strategy=Closure.DELEGATE_ONLY, value=CFP) Closure cl) {
		CFP cfp = new CFP()
		cl.delegate = cfp
		cl.call()
		cfps.add cfp
	}
	
    def run() {
        scriptBody()                                        
        display()                                               
    }
	
	static void display() {
		cfps.each { cfp->
			println "$cfp.title by $cfp.owner"
		}
	}
}