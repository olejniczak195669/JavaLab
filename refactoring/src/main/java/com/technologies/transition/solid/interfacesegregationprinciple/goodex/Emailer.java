package com.technologies.transition.solid.interfacesegregationprinciple.goodex;

class Emailer {
	
	
	public void sendMessage(Emailable emailable, String subject, String body) {
		
		String emailAddress = emailable.getEmailAddress();
		
		sendEmail(emailAddress, subject, body);
	}

	
	
	
	
	private void sendEmail(String emailAddress, String subject, String body) {
		// TODO Auto-generated method stub
		
	}
}