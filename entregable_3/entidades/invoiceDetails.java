package entregable_3.entidades;
@Table(name = "client")

public class invoiceDetails {

     @Id
    
    private Integer id;

    private String name;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "doc_number")
    private String docNumber;

    public void Client(){
    }

    public void Client(Integer id, String name, String lastname, String docNumber) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.docNumber = docNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }
    
}
