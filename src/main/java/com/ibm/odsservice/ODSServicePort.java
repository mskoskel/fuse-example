package com.ibm.odsservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.2
 * 2021-02-25T13:37:37.933+01:00
 * Generated source version: 3.4.2
 *
 */
@WebService(targetNamespace = "http://odsservice.ibm.com", name = "ODSServicePort")
@XmlSeeAlso({ObjectFactory.class})
public interface ODSServicePort {

    @WebMethod(action = "updateCitizenCaseStatus")
    @RequestWrapper(localName = "updateCitizenCaseStatus", targetNamespace = "http://odsservice.ibm.com", className = "com.ibm.odsservice.UpdateCitizenCaseStatus")
    @ResponseWrapper(localName = "updateCitizenCaseStatusResponse", targetNamespace = "http://odsservice.ibm.com", className = "com.ibm.odsservice.UpdateCitizenCaseStatusResponse")
    @WebResult(name = "updateCitizenCaseStatusReturn", targetNamespace = "")
    public int updateCitizenCaseStatus(

        @WebParam(name = "accessUserId", targetNamespace = "")
        java.lang.String accessUserId,
        @WebParam(name = "caseId", targetNamespace = "")
        java.lang.String caseId,
        @WebParam(name = "citizenCaseStatus", targetNamespace = "")
        java.lang.String citizenCaseStatus,
        @WebParam(name = "eventType", targetNamespace = "")
        java.lang.String eventType,
        @WebParam(name = "eventCode", targetNamespace = "")
        java.lang.String eventCode,
        @WebParam(name = "eventSource", targetNamespace = "")
        java.lang.String eventSource,
        @WebParam(name = "eventDescription", targetNamespace = "")
        java.lang.String eventDescription,
        @WebParam(name = "eventDescription_EN", targetNamespace = "")
        java.lang.String eventDescriptionEN,
        @WebParam(name = "eventDescription_SV", targetNamespace = "")
        java.lang.String eventDescriptionSV,
        @WebParam(name = "timeUpdated", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar timeUpdated,
        @WebParam(name = "timeCreated", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar timeCreated
    );
}
