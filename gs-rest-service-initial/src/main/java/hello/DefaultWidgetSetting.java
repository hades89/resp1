package hello;

import java.util.Map;

import javax.validation.constraints.Pattern;

public class DefaultWidgetSetting {

	private Map<String, String> layout;
	
	private Map<String, String> icon;
	
	private Map<String, String> title;
	
	private Map<String, String> position;
	
	@Pattern(regexp="#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$",
            message="{invalid.colour}")
	private Map<String, String> colour;

	public Map<String, String> getLayout() {
		return layout;
	}

	public void setLayout(Map<String, String> layout) {
		this.layout = layout;
	}

	public Map<String, String> getIcon() {
		return icon;
	}

	public void setIcon(Map<String, String> icon) {
		this.icon = icon;
	}

	public Map<String, String> getTitle() {
		return title;
	}

	public void setTitle(Map<String, String> title) {
		this.title = title;
	}

	public Map<String, String> getPosition() {
		return position;
	}

	public void setPosition(Map<String, String> position) {
		this.position = position;
	}

	public Map<String, String> getColour() {
		return colour;
	}

	public void setColour(Map<String, String> colour) {
		this.colour = colour;
	}
	
	
}
