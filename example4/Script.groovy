String name = "JohnDoe"
String encryptedString = "23434Super secret string23434"

use(StringUtils) {
	println name.camelCase
	println encryptedString.removeLeadingAndTrailingToken("23434")
}



