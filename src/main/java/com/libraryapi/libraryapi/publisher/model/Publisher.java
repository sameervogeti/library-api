package com.libraryapi.libraryapi.publisher.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * Publisher
 */


public class Publisher {

    @JsonProperty("publisherId")
    private Integer publisherId = null;
    @JsonProperty("name")
    private String name = null;
    @JsonProperty("emailId")
    private String emailId = null;
    @JsonProperty("phoneNumber")
    private String phoneNumber = null;

    public Publisher(Integer publisherId, String name, String emailId, String phoneNumber) {
        this.publisherId = publisherId;
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    public Publisher publisherId(Integer publisherId) {
        this.publisherId = publisherId;
        return this;
    }

    /**
     * Get publisherId
     *
     * @return publisherId
     **/


    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public Publisher name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Publisher emailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    /**
     * Get emailId
     *
     * @return emailId
     **/


    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Publisher phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get phoneNumber
     *
     * @return phoneNumber
     **/


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Publisher publisher = (Publisher) o;
        return Objects.equals(this.publisherId, publisher.publisherId) &&
                Objects.equals(this.name, publisher.name) &&
                Objects.equals(this.emailId, publisher.emailId) &&
                Objects.equals(this.phoneNumber, publisher.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisherId, name, emailId, phoneNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Publisher {\n");

        sb.append("    publisherId: ").append(toIndentedString(publisherId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
