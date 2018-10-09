package ManualDescr;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author Muflikhunov Roman
 */

@Getter
@Setter
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
public class Cast {

    @XmlElement(name = "Character")
    protected List<Characters> character;
    @XmlElement(name = "Actor")
    protected List<Actor> actor;
    @XmlAttribute(name = "id")
    protected Byte id;
}
