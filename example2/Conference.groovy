class Conference {
	
	static List cfps = []
	
	static def cfp(@DelegatesTo(strategy=Closure.DELEGATE_ONLY, value=CFP) Closure cl) {
		CFP cfp = new CFP()
		cl.delegate = cfp
		cl.call()
		cfps.add cfp
	}
	
	static void display() {
		cfps.each { cfp->
			println "$cfp.title by $cfp.owner"
		}
	}
}

class CFP {
	String title
	String description
	Level level
	String owner
	String duration
	List<String> tags
	
	void title(String title) {
		this.title = title
	}
	
	void description(String description) {
		this.description = description
	}
	
	void level(Level level) {
		this.level = level
	}
	
	void owner(String owner) {
		this.owner = owner
	}
	
	void duration(String duration) {
		this.duration = duration
	}
	
	void tags(List<String> tags) {
		this.tags = tags
	}
}