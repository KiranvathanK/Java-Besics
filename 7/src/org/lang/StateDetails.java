package org.lang;

public class StateDetails {
	
	public void southIndia() {
		System.out.println("Please enter SouthIndia places");
	}
	
	public void northIndia() {
		System.out.println("Please enter NorthIndia places");
	}
	
public static void main(String[] args) {
	StateDetails sobj = new StateDetails();
	sobj.southIndia();
	sobj.northIndia();
	LanguageInfo linfo = new LanguageInfo();
	linfo.kannadaLang();
	linfo.englishLang();
	linfo.hindiLang();
	
}

}
