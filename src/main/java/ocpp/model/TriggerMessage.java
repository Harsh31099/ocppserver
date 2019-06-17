package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import ocpp.essential.Status;
import ocpp.essential.Status.MessageTrigger;
@Entity
@Table(name="triggerMessage")
public class TriggerMessage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ConnectorId")
	private int connectorID1;
	
	@ManyToMany
	@JoinColumn(name="Status")
	private Status.TriggerMessage status1; // object h babua
	
	@ManyToMany
	@JoinColumn(name="RequestedMessage")
	
	private Status.MessageTrigger  requestedMessage1;
	
	 /*req()*/
    Status.MessageTrigger requestedMessage; //Required.
    int connectorID; //Optional. Only filled in when reqeuest applies to a specific connector

    /*conf()*/
    Status.TriggerMessage status; //Required. Indicates whether the charge point will send the requested
                                        //notification or not.

    /*default constructor*/
    TriggerMessage(){
        requestedMessage = Status.MessageTrigger.BootNotification;
        connectorID = 0;
        status = Status.TriggerMessage.Accepted;
    }

    /*parameterized constructor*/
    

    	public TriggerMessage(MessageTrigger requestedMessage, int connectorID,
			ocpp.essential.Status.TriggerMessage status) {
		super();
		this.requestedMessage = requestedMessage;
		this.connectorID = connectorID;
		this.status = status;
	}
}
