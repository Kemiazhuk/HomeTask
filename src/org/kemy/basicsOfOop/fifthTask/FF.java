package com.efinancialcareers.resumeservice.api.bean;

import com.efinancialcareers.resumeservice.api.enums.PropertyDefaults;
import com.efinancialcareers.resumeservice.api.enums.ResumeFileFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Calendar;


/**
 * ResumeBean
 */
public class ResumeBean {

    @JsonProperty("id")
    private String externalResumeId;
    @JsonProperty("jobseeker_id")
    private String externalJobSeekerId;
    @JsonProperty("document_title")
    private String documentTitle;
    @JsonProperty("application_count")
    private Integer applicationCount = 0;
    @JsonProperty("is_active")
    private Boolean isActive;
    @JsonFormat(pattern = PropertyDefaults.JSON_DATE_TIME_FORMAT)
    @JsonProperty("created_date")
    private Calendar createdDate;
    @JsonProperty("mime_type")
    private String mimeType;

    public String getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    public Integer getApplicationCount() {
        return applicationCount;
    }

    public void setApplicationCount(Integer applicationCount) {
        this.applicationCount = applicationCount;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Calendar getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getId() {
        return externalResumeId;
    }

    public void setId(String externalResumeId) {
        this.externalResumeId = externalResumeId;
    }

    public String getExternalJobSeekerId() {
        return externalJobSeekerId;
    }

    public void setExternalJobSeekerId(String externalJobSeekerId) {
        this.externalJobSeekerId = externalJobSeekerId;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static class Builder {
        protected String externalResumeId;
        protected String externalJobSeekerId;
        protected String documentTitle;
        protected Integer applicationCount = 0;
        protected Boolean isActive;
        protected Calendar createdDate;
        protected String mimeType;


        /**
         * Create builder
         *
         * @return builder
         */
        public static Builder create() {
            return new Builder();
        }

        /**
         * Set external job seeker id
         *
         * @param externalJobSeekerId value
         * @return Builder
         */
        public Builder withExternalJobSeekerId(String externalJobSeekerId) {
            this.externalJobSeekerId = externalJobSeekerId;
            return this;
        }

        /**
         * Set document title
         *
         * @param documentTitle value
         * @return Builder
         */
        public Builder withDocumentTitle(String documentTitle) {
            this.documentTitle = documentTitle;
            return this;
        }

        /**
         * Set application count
         *
         * @param applicationCount value
         * @return Builder
         */
        public Builder withApplicationCount(Integer applicationCount) {
            this.applicationCount = applicationCount;
            return this;
        }

        /**
         * Set is active
         *
         * @param isActive value
         * @return Builder
         */
        public Builder withIsActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        /**
         * Set created date
         *
         * @param createdDate value
         * @return Builder
         */
        public Builder withCreatedDate(Calendar createdDate) {
            this.createdDate = createdDate;
            return this;
        }


        /**
         * Set file mime type
         *
         * @param mimeType value
         * @return Builder
         */
        public Builder withMimeType(ResumeFileFormat mimeType) {
            if (mimeType != null) {
                this.mimeType = mimeType.getMimeType();
            }
            return this;
        }

        /**
         * Set external resume id
         *
         * @param externalResumeId value
         * @return Builder
         */
        public Builder withExternalResumeId(String externalResumeId) {
            this.externalResumeId = externalResumeId;
            return this;
        }

        /**
         * Build resume
         *
         * @return resume
         */
        public ResumeBean build() {
            ResumeBean bean = new ResumeBean();
            bean.setDocumentTitle(documentTitle);
            bean.setApplicationCount(applicationCount);
            bean.setIsActive(isActive);
            bean.setCreatedDate(createdDate);
            bean.setMimeType(mimeType);
            bean.setId(externalResumeId);
            bean.setExternalJobSeekerId(externalJobSeekerId);
            return bean;
        }
    }
}