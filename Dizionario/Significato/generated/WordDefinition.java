//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.12.12 alle 11:53:41 AM CET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Word" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Definitions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Definition">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Word" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Dictionary">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="WordDefinition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
    "word",
    "definitions"
})
@XmlRootElement(name = "WordDefinition")
public class WordDefinition {

    @XmlElement(name = "Word", required = true)
    protected String word;
    @XmlElement(name = "Definitions", required = true)
    protected WordDefinition.Definitions definitions;

    /**
     * Recupera il valore della propriet� word.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWord() {
        return word;
    }

    /**
     * Imposta il valore della propriet� word.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWord(String value) {
        this.word = value;
    }

    /**
     * Recupera il valore della propriet� definitions.
     * 
     * @return
     *     possible object is
     *     {@link WordDefinition.Definitions }
     *     
     */
    public WordDefinition.Definitions getDefinitions() {
        return definitions;
    }

    /**
     * Imposta il valore della propriet� definitions.
     * 
     * @param value
     *     allowed object is
     *     {@link WordDefinition.Definitions }
     *     
     */
    public void setDefinitions(WordDefinition.Definitions value) {
        this.definitions = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Definition">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Word" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Dictionary">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="WordDefinition" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
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
        "definition"
    })
    public static class Definitions {

        @XmlElement(name = "Definition", required = true)
        protected WordDefinition.Definitions.Definition definition;

        /**
         * Recupera il valore della propriet� definition.
         * 
         * @return
         *     possible object is
         *     {@link WordDefinition.Definitions.Definition }
         *     
         */
        public WordDefinition.Definitions.Definition getDefinition() {
            return definition;
        }

        /**
         * Imposta il valore della propriet� definition.
         * 
         * @param value
         *     allowed object is
         *     {@link WordDefinition.Definitions.Definition }
         *     
         */
        public void setDefinition(WordDefinition.Definitions.Definition value) {
            this.definition = value;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Word" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Dictionary">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="WordDefinition" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "word",
            "dictionary",
            "wordDefinition"
        })
        public static class Definition {

            @XmlElement(name = "Word", required = true)
            protected String word;
            @XmlElement(name = "Dictionary", required = true)
            protected WordDefinition.Definitions.Definition.Dictionary dictionary;
            @XmlElement(name = "WordDefinition", required = true)
            protected String wordDefinition;

            /**
             * Recupera il valore della propriet� word.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWord() {
                return word;
            }

            /**
             * Imposta il valore della propriet� word.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWord(String value) {
                this.word = value;
            }

            /**
             * Recupera il valore della propriet� dictionary.
             * 
             * @return
             *     possible object is
             *     {@link WordDefinition.Definitions.Definition.Dictionary }
             *     
             */
            public WordDefinition.Definitions.Definition.Dictionary getDictionary() {
                return dictionary;
            }

            /**
             * Imposta il valore della propriet� dictionary.
             * 
             * @param value
             *     allowed object is
             *     {@link WordDefinition.Definitions.Definition.Dictionary }
             *     
             */
            public void setDictionary(WordDefinition.Definitions.Definition.Dictionary value) {
                this.dictionary = value;
            }

            /**
             * Recupera il valore della propriet� wordDefinition.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWordDefinition() {
                return wordDefinition;
            }

            /**
             * Imposta il valore della propriet� wordDefinition.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWordDefinition(String value) {
                this.wordDefinition = value;
            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "id",
                "name"
            })
            public static class Dictionary {

                @XmlElement(name = "Id", required = true)
                protected String id;
                @XmlElement(name = "Name", required = true)
                protected String name;

                /**
                 * Recupera il valore della propriet� id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Imposta il valore della propriet� id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Recupera il valore della propriet� name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Imposta il valore della propriet� name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }

        }

    }

}
