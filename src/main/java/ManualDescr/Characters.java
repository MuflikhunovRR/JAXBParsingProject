package ManualDescr;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author Muflikhunov Roman
 */

@Getter
@Setter
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
public class Characters {

    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;


}
