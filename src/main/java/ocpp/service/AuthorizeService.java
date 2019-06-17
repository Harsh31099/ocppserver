package ocpp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ocpp.essential.IdTagInfo;
import ocpp.essential.Status.Authorization;
@Service
public class AuthorizeService {
	@Autowired
	private IdTagInfo idTagInfo;
	public IdTagInfo authorizeUser(String idTag) {
		// TODO Auto-generated method stub
		idTagInfo.setStatus("Accepted");
		return idTagInfo;
	}
}
