package ntk.group.four;

public class TeamFourDemo {
	
	public static void main(String[] args) {
		System.out.println("Team One ");
		
		
		System.out.println("Hello Everyone");
		
		
		System.out.println("We are Team four ");
		
		
		System.out.println("Team Four Rules");
		
		System.out.println("Team Work");
		
		
		statesInUSA();
		gitHubSteps();

		String countryName = getCountry("Russia");
		System.out.println(countryName);
		
		System.out.println("EyyyyyyHa!");
	}
	
	
	public static void statesInUSA() {
		 
		String str = "New York";
		String str1 = "Texas";
		String str2 = "Connecticut";
		
		

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("I love Git Hub");
		
		swapNumbers(5, 7);

	}
	public static void printText(String message) {
		System.out.println(message);
		
	}

	public static String getCountry(String str) {

		String countryName = " ";

		String[] countries = new String[] { "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola",
				"Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia",
				"Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize",
				"Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island",
				"Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi",
				"Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad",
				"Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo",
				"Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire",
				"Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica",
				"Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea",
				"Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France",
				"France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon",
				"Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe",
				"Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands",
				"Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia",
				"Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan",
				"Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of",
				"Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia",
				"Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau",
				"Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali",
				"Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico",
				"Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat",
				"Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles",
				"New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island",
				"Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea",
				"Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion",
				"Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia",
				"Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia",
				"Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia",
				"Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain",
				"Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname",
				"Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic",
				"Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo",
				"Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan",
				"Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom",
				"United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu",
				"Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)",
				"Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe",
				"Palestine" };
		
		
		
		for(String c: countries) {
			if (c.contains(str)) {
				countryName = "Our Selected country is: " + c;
			}
		}

		return countryName;
	}
	
	public static void gitHubSteps() {
		
		System.out.println("Commit, if it's new project");
		System.out.println("Stash, if you make changes");
		System.out.println("Pull, to get latest update code");
		System.out.println("Stash again to bring back your code");
		System.out.println("Commit then click on commit and push");
		System.out.println("Push Branch Master");
	}

	public static void swapNumbers(int numOne, int numTwo) {
				
		numOne = numOne +numTwo;
		numTwo = numOne-numTwo;
		numOne = numOne -numTwo;
		
		System.out.println(numOne + " : " + numTwo);
		
		
	}
}
