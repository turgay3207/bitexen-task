package pojo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Root {
    public HashMap<String,String> spec;
    public Options options;
    public String swaggerUrl;
    public AuthorizationValue authorizationValue;
    public boolean usingFlattenSpec;
    public SecurityDefinition securityDefinition;
}
