package hello;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DefaultSetting {

	@JsonProperty("widget.web")
	private Map<String, String> widgetWeb;

	@JsonProperty("widget.mobile")
	private Map<String, String> widgetMobile;

	public Map<String, String> getWidgetWeb() {
		return widgetWeb;
	}

	public void setWidgetWeb(Map<String, String> widgetWeb) {
		this.widgetWeb = widgetWeb;
	}

	public Map<String, String> getWidgetMobile() {
		return widgetMobile;
	}

	public void setWidgetMobile(Map<String, String> widgetMobile) {
		this.widgetMobile = widgetMobile;
	}

}
