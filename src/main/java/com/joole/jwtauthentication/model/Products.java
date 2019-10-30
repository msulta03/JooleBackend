package com.joole.jwtauthentication.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

// , indexes = { @Index(name = "manufacturer_index", columnList = "manufacturer_id") }
@Entity
@Table(name = "Products" )
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @NotBlank
    @Size(min=3, max = 50)
    private String name;

    
    @Column(name = "description")
    private String description;



    @NotBlank
    @Size(min=3, max = 50)
    private String series;




    @NotBlank
    @Size(min=3, max = 50)
    private String model;



    @NotBlank
    @Size(min=3, max = 50)
    @Column(name = "use_type")
    private String useType;



    @NotBlank
    @Size(min=3, max = 50)
    private String application;



    @NotBlank
    @Size(min=3, max = 50)
    @Column(name = "mounting_location")
    private String mountingLocation;



    @Size(min=3, max = 50)
    private String accessories;



    @NotBlank
    @Size(min=3, max = 50)
    @Column(name = "model_year")
    private String modelYear;



    @Column(name = "series_information", length = 1000)
    private String seriesInfo;




    @Column(name = "product_documents")
    private String productDocuments;


    @Column(name = "technical_specs")
    private String technicalSpec;



    // @ManyToOne
    
    @Column(name = "manufacturer_id", length  = 1000000)
    private long manufacturerId;



    // @ManyToOne
    @Column(name = "salesrep_id")
    private long salesrepId;

    @NotBlank
    @Size(min=3, max = 50)
    private String category;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="employee_has_products", joinColumns={@JoinColumn(name="product_id", referencedColumnName="id")}
    , inverseJoinColumns={@JoinColumn(name="user_id", referencedColumnName="id")})
    private Set<User> users;


    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getSalesrepId() {
        return this.salesrepId;
    }

    public void setSalesrepId(Long salesrepId) {
        this.salesrepId = salesrepId;
    }

    public long getManufacturerId() {
        return this.manufacturerId;
    }

    public void setManufacturerId(long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getTechnicalSpec() {
        return this.technicalSpec;
    }

    public void setTechnicalSpec(String technicalSpec) {
        this.technicalSpec = technicalSpec;
    }


    public String getProductDocuments() {
        return this.productDocuments;
    }

    public void setProductDocuments(String productDocuments) {
        this.productDocuments = productDocuments;
    }

    public String getSeriesInfo() {
        return this.seriesInfo;
    }

    public void setSeriesInfo(String seriesInfo) {
        this.seriesInfo = seriesInfo;
    }

    public String getModelYear() {
        return this.modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getAccessories() {
        return this.accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public String getMountingLocation() {
        return this.mountingLocation;
    }

    public void setMountingLocation(String mountingLocation) {
        this.mountingLocation = mountingLocation;
    }

    public String getApplication() {
        return this.application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getUseType() {
        return this.useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return this.series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
}