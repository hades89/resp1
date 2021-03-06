package hello;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import Service.TicketService;

@RestController
public class GreetingController {

	private TicketService ticketService;

	@Autowired
	public GreetingController(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	@RequestMapping(value = "/greetings/{greetingId}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public GreetingRequest greeting(@PathVariable int greetingId, @RequestBody GreetingRequest request,  HttpServletRequest a) {
		UriComponents uri = UriComponentsBuilder
				.fromHttpUrl("http://localhost:8585/app/images/{a}/{b}/{c}")
				.buildAndExpand("someId", "somePublicUrl", "someFilename");
		String urlString = uri.toUriString();
		
		System.err.println(a.getScheme() + "://"+a.getServerName() +":"+a.getServerPort()+a.getContextPath());
		return request;
	}

}
