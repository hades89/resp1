package hello;

import java.io.File;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurationSupport {

	@Bean
	public DefaultSetting fileReader() {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		try {
			DefaultSetting defaultSetting = mapper.readValue(
					new File(
							"C:/Users/QJ/Documents/workspace-sts-3.8.3.RELEASE/gs-rest-service-initial/src/main/java/hello/abc.yaml"),
					DefaultSetting.class);
			return defaultSetting;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Bean
	public MappingJackson2HttpMessageConverter customJackson2HttpMessageConverter() {
		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		jsonConverter.setObjectMapper(objectMapper);
		return jsonConverter;
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(customJackson2HttpMessageConverter());
		super.addDefaultHttpMessageConverters(converters);
	}
}
