package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ocpp.essential.Status;
import ocpp.essential.Type;
@Entity
@Table(name="Reset")
public class Reset {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Type")
	private String type1;
	
	@Column(name="Status")
	private String status1;
	
	
	@Override
	public String toString() {
		return "Reset [type1=" + type1 + ", status1=" + status1 + ", type=" + type + ", status=" + status + "]";
	}

	Type.Reset type; //Required. This contains the type of reset that the Charge Point should perform.

    /*conf()*/
    Status.Reset status; //Required. This indicates whether the Charge Point is able to perform the reset.

    /*default constructor*/
    Reset(){
        type = Type.Reset.Soft;
        status = Status.Reset.Accepted;
    }

    public Reset(ocpp.essential.Type.Reset type, ocpp.essential.Status.Reset status) {
		super();
		this.type = type;
		this.status = status;
	}
}
