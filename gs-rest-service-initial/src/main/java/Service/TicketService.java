package Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.DefaultSetting;
import hello.Option;
import hello.Ticket;

@Service
public class TicketService {
//	private static final Map<String, Map<String, String>> DEFAULT_SETTINGS = new HashMap<>();
//
//	 @Autowired
//	public TicketService(DefaultSetting defaultSetting) {
//		DEFAULT_SETTINGS.put("web", defaultSetting.getWidgetWeb());
//		DEFAULT_SETTINGS.put("mobile", defaultSetting.getWidgetMobile());
//		System.err.println("called once");
//	}
//
//	public Ticket getTicket(int ticketId) {
//		System.err.println(DEFAULT_SETTINGS.get("mobile"));
//		Ticket ticket = new Ticket();
//		ticket.setId(ticketId);
//		ticket.setDescription("Description");
//
//		return ticket;
//	}
}
