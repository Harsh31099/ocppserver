package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ocpp.essential.Status.Authorization;
import ocpp.model.User;
import ocpp.service.AuthorizeService;
import ocpp.service.BootNotificationService;

@RestController("authorizeController")
public class AuthorizeController {

	@Autowired
	private AuthorizeService authorizeService;
	@RequestMapping(value="/authorizeService",method=RequestMethod.GET)
	@ResponseBody
	public Authorization authorization(@RequestParam("idTag") String idTag) {
		System.out.println(authorizeService);
		return authorizeService.authorizeUser(idTag);
	}
}
