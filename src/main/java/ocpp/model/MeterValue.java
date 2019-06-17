package ocpp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import ocpp.essential.SampledValue;

@Entity
@Table(name= "MeterValue")
public class MeterValue {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TimeStamp")
	private Date timeStamp;
	@ManyToMany
	@JoinColumn(name="SampledValue")
	private SampledValue sampledValue;
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public SampledValue getSampledValue() {
		return sampledValue;
	}
	public void setSampledValue(SampledValue sampledValue) {
		this.sampledValue = sampledValue;
	}
	@Override
	public String toString() {
		return "MeterValue [timeStamp=" + timeStamp + ", sampledValue=" + sampledValue + "]";
	}
	public MeterValue(Date timeStamp, SampledValue sampledValue) {
		super();
		this.timeStamp = timeStamp;
		this.sampledValue = sampledValue;
	}
	
}
