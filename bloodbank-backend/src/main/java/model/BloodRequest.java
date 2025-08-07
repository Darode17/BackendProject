package model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BloodRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patientName;
    private String requiredBloodGroup;
    private String contactnumber;
    private String hospital;
    private LocalDate requesrDate;

    @Enumerated(EnumType.STRING)
    private RequestStatus status;

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the patientName
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * @param patientName the patientName to set
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * @return String return the requiredBloodGroup
     */
    public String getRequiredBloodGroup() {
        return requiredBloodGroup;
    }

    /**
     * @param requiredBloodGroup the requiredBloodGroup to set
     */
    public void setRequiredBloodGroup(String requiredBloodGroup) {
        this.requiredBloodGroup = requiredBloodGroup;
    }

    /**
     * @return String return the contactnumber
     */
    public String getContactnumber() {
        return contactnumber;
    }

    /**
     * @param contactnumber the contactnumber to set
     */
    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    /**
     * @return String return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    /**
     * @return LocalDate return the requesrDate
     */
    public LocalDate getRequesrDate() {
        return requesrDate;
    }

    /**
     * @param requesrDate the requesrDate to set
     */
    public void setRequesrDate(LocalDate requesrDate) {
        this.requesrDate = requesrDate;
    }

    /**
     * @return RequestStatus return the status
     */
    public RequestStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(RequestStatus status) {
        this.status = status;
    }

}
