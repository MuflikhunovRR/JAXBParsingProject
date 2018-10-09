
package mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cast" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Character">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Actor">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="BirthDay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cast"
})
@XmlRootElement(name = "ActorCast")
public class ActorCast {

    @XmlElement(name = "Cast")
    protected List<ActorCast.Cast> cast;

    /**
     * Gets the value of the cast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActorCast.Cast }
     * 
     * 
     */
    public List<ActorCast.Cast> getCast() {
        if (cast == null) {
            cast = new ArrayList<ActorCast.Cast>();
        }
        return this.cast;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Character">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Actor">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="BirthDay" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "character",
        "actor"
    })
    public static class Cast {

        @XmlElement(name = "Character", required = true)
        protected ActorCast.Cast.Character character;
        @XmlElement(name = "Actor", required = true)
        protected ActorCast.Cast.Actor actor;
        @XmlAttribute(name = "id")
        protected Byte id;

        /**
         * Gets the value of the character property.
         * 
         * @return
         *     possible object is
         *     {@link ActorCast.Cast.Character }
         *     
         */
        public ActorCast.Cast.Character getCharacter() {
            return character;
        }

        /**
         * Sets the value of the character property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActorCast.Cast.Character }
         *     
         */
        public void setCharacter(ActorCast.Cast.Character value) {
            this.character = value;
        }

        /**
         * Gets the value of the actor property.
         * 
         * @return
         *     possible object is
         *     {@link ActorCast.Cast.Actor }
         *     
         */
        public ActorCast.Cast.Actor getActor() {
            return actor;
        }

        /**
         * Sets the value of the actor property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActorCast.Cast.Actor }
         *     
         */
        public void setActor(ActorCast.Cast.Actor value) {
            this.actor = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setId(Byte value) {
            this.id = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="BirthDay" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "firstName",
            "lastName",
            "birthDay"
        })
        public static class Actor {

            @XmlElement(name = "FirstName", required = true)
            protected String firstName;
            @XmlElement(name = "LastName", required = true)
            protected String lastName;
            @XmlElement(name = "BirthDay", required = true)
            protected String birthDay;

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Sets the value of the firstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Gets the value of the lastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * Sets the value of the lastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

            /**
             * Gets the value of the birthDay property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBirthDay() {
                return birthDay;
            }

            /**
             * Sets the value of the birthDay property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBirthDay(String value) {
                this.birthDay = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "firstName",
            "lastName"
        })
        public static class Character {

            @XmlElement(name = "FirstName", required = true)
            protected String firstName;
            @XmlElement(name = "LastName", required = true)
            protected String lastName;

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Sets the value of the firstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Gets the value of the lastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * Sets the value of the lastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

        }

    }

}
