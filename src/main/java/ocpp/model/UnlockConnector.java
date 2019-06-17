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
@Entity
@Table(name="UnlockConnector")

public class UnlockConnector {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ConnectorId")
    private String connectorId;
	@ManyToMany
	@JoinColumn(name="Status")
	private Status.Unlock status1;
    /*req()*/
    int connectorID; //Required. This contains the identifier of the connector to be unlocked.
    /*conf()*/
    Status.Unlock status; //Required. This indicates whether the Charge Point has unlocked the connector.

    /*default constructor*/
    UnlockConnector() {
        connectorID = 0;
        status = Status.Unlock.Unlocked;
    }

    /*parameterized constructor*/
    public UnlockConnector(int connectorID, Status.Unlock status) {
        this.connectorID = connectorID;
        this.status = status;
    }

	@Override
	public String toString() {
		return "UnlockConnector [connectorID=" + connectorID + ", status=" + status + "]";
	}
}