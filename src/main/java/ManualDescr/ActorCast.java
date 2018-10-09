package ManualDescr;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author Muflikhunov Roman
 */

@Getter
@Setter
@ToString
@XmlRootElement(name = "ActorCast")
@XmlAccessorType(XmlAccessType.FIELD)
public class ActorCast {

    @XmlElement(name = "Cast")
    protected List<Cast> cast;

}
