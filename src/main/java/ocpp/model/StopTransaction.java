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
import ocpp.essential.Type;
import ocpp.essential.Type.Reason;
@Entity
@Table(name="StopTransaction")
public class StopTransaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idTag")
	private int idTag1;
	
	@Column(name="meterStop")
	private String meterStop1;
	
	@Column(name="Date")
	private Date timestamp1;

	@ManyToMany
	@JoinColumn(name="reason")
	private Type.Reason reason1;
	
	@Column(name="TansactionId")
	private int transactionId1;
	
	@ManyToMany
	@JoinColumn(name="idTagInfo")
	private  IdTagInfo idTagInfo1; // hello its an object and you typecasted me.
	/*req()*/
	String idTag; /*Optional. This contains	the identifier which requested to stop the charging. It is optional
				 because a Charge Point may terminate charging without the presence of an idTag, e.g. in case of a
				 reset. A Charge Point	SHALL send the idTag if	known. Length<20.*/

	int meterStop; //Required. This contains the meter value in Wh for the connector at end	of the transaction.

	Date timestamp; //Required. This contains the date and time on which the transaction is stopped.

	int transactionId; //Required. This contains the transaction-id as received by the StartTransaction.conf.

	Type.Reason reason; /*Optional. This contains the reason why the transcation was stopped. MAY only be omitted
	                      when Reason is "Local"*/

	//MeterValue transactionData; //Optional. This contains transaction usage details relevvant for billing purposes.

	/*conf()*/
	IdTagInfo idTagInfo; /*Optional. This contains information about authorization status,expiry and parent id. It
						is optional because a transaction may have been stopped without an identifier.*/

	StopTransaction(){
		idTag="";
		meterStop=0;
		timestamp = new Date();
		transactionId = 0;
		reason = Type.Reason.Local;
		//transactionData = new MeterValue();
	}
	
	public StopTransaction(String idTag, int meterStop, Date timestamp, int transactionId, Reason reason,
			IdTagInfo idTagInfo) {
		super();
		this.idTag = idTag;
		this.meterStop = meterStop;
		this.timestamp = timestamp;
		this.transactionId = transactionId;
		this.reason = reason;
		this.idTagInfo = idTagInfo;
	}
   
}
