package ocpp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import ocpp.essential.IdTagInfo;
@Entity
@Table(name="StartTransaction")
public class StartTransaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Connectorid")
	private int connectorid;
	
	@Column(name="IdTag")
	private String idTag1;
	
	@Column(name="MeterStart")
	private int meterStart1;
	
	@Column(name="ReservationId")
	private int reservationId;
	
	@Column(name="TansactionId")
	private String transactionId1;
	
	@Column(name="TimeStamp")
	private Date timeStamp1;
	
	@ManyToMany
	@JoinColumn(name = "IdtagInfo")
	private IdTagInfo idTagInfo1;

	@Override
	public String toString() {
		return "StartTransaction [connectorid=" + connectorid + ", idTag1=" + idTag1 + ", meterStart1=" + meterStart1
				+ ", reservationId=" + reservationId + ", transactionId1=" + transactionId1 + ", timeStamp1="
				+ timeStamp1 + ", idTagInfo1=" + idTagInfo1 + ", timestamp1=" + timestamp1 + ", IdTagInfo1="
				+ IdTagInfo1 + ", connectorID=" + connectorID + ", idTag=" + idTag + ", meterStart=" + meterStart
				+ ", reservationID=" + reservationID + ", timestamp=" + timestamp + ", idTagInfo=" + idTagInfo
				+ ", transactionId=" + transactionId + "]";
	}

	@Column(name="Date")
	private String timestamp1;
	
	@Column(name="IdTagInfo")
	private String IdTagInfo1;
	
	int connectorID; //Required. This identifies which connector of the charge point is used.

	String idTag; //Required. This contains identifier for which a transaction has to be started. Length<20

	int meterStart; //Required. This contains the meter value in Wh for the connector at start of the transaction.

	int reservationID; //Optional. This contains the id of the reservation that terminates as a result of
					  // this transaction

	Date timestamp; //Required. This contains the date and time on which the transaction is started.

	/*conf()*/
	IdTagInfo idTagInfo; //Required. This contains info about authorization status,expiry and parent ID

	int transactionId; //Required. This contains the transaction ID supplied by Central System.

	StartTransaction(){
		connectorID = 0;
		idTag = "";
		meterStart = 0;
		reservationID = 0;
		timestamp = new Date();
		idTagInfo = new IdTagInfo();
	}

	public StartTransaction(int connectorID, String idTag, int meterStart, int reservationID, Date timestamp,
							IdTagInfo idTagInfo, int transactionId) {
		this.connectorID = connectorID;
		this.idTag = idTag;
		this.meterStart = meterStart;
		this.reservationID = reservationID;
		this.timestamp = timestamp;
		this.idTagInfo = idTagInfo;
		this.transactionId = transactionId;
	}
}
