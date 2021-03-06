
package org.projet.library.model.prets;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PretsWS", targetNamespace = "http://webapp.libraryservice.projet.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PretsWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.projet.library.model.prets.Pret>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPretByUser", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.prets.GetPretByUser")
    @ResponseWrapper(localName = "getPretByUserResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.prets.GetPretByUserResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/PretsWS/getPretByUserRequest", output = "http://webapp.libraryservice.projet.org/PretsWS/getPretByUserResponse")
    public List<Pret> getPretByUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.projet.library.model.prets.Pret
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPretById", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.prets.GetPretById")
    @ResponseWrapper(localName = "getPretByIdResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.prets.GetPretByIdResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/PretsWS/getPretByIdRequest", output = "http://webapp.libraryservice.projet.org/PretsWS/getPretByIdResponse")
    public Pret getPretById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.projet.library.model.prets.Pret>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPretLate", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.prets.GetPretLate")
    @ResponseWrapper(localName = "getPretLateResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.prets.GetPretLateResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/PretsWS/getPretLateRequest", output = "http://webapp.libraryservice.projet.org/PretsWS/getPretLateResponse")
    public List<Pret> getPretLate();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updatePret", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.prets.UpdatePret")
    @ResponseWrapper(localName = "updatePretResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.prets.UpdatePretResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/PretsWS/updatePretRequest", output = "http://webapp.libraryservice.projet.org/PretsWS/updatePretResponse")
    public void updatePret(
        @WebParam(name = "arg0", targetNamespace = "")
        Pret arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.projet.library.model.prets.Pret>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListPret", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.prets.GetListPret")
    @ResponseWrapper(localName = "getListPretResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.prets.GetListPretResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/PretsWS/getListPretRequest", output = "http://webapp.libraryservice.projet.org/PretsWS/getListPretResponse")
    public List<Pret> getListPret();

}
