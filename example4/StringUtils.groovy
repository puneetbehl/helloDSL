class StringUtils {
	
	static String getCamelCase(String self) {
		self.replaceFirst(self?.charAt(0)?.toString(), self?.charAt(0)?.toString()?.toLowerCase())
	}
	
    static String removeLeadingAndTrailingToken(String self, String token){
        String returnValue = self
        if(returnValue && token){
            returnValue = returnValue?.startsWith(token) ? returnValue?.substring(token?.length()) : returnValue
            returnValue = returnValue?.endsWith(token) ? returnValue?.substring(0, returnValue?.length() - token?.length()) : returnValue
        }
        returnValue
    } 
}