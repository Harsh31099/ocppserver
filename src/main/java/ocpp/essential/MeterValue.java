package ocpp.essential;

import java.util.Date;

public class MeterValue {
	Date timestamp;
	SampledValue sampledValue;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public SampledValue getSampledValue() {
		return sampledValue;
	}
	public void setSampledValue(SampledValue sampledValue) {
		this.sampledValue = sampledValue;
	}
	public MeterValue(Date timestamp, SampledValue sampledValue) {
		super();
		this.timestamp = timestamp;
		this.sampledValue = sampledValue;
	}
	@Override
	public String toString() {
		return "MeterValue [timestamp=" + timestamp + ", sampledValue=" + sampledValue + "]";
	}
}
