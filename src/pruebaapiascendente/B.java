package pruebaapiascendente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import vistdsapixmlcreator.Node;
import vistdsapixmlcreator.Paso;

/**
 *
 * @author Adrian Garcia Oller
 */
public class B {

    private String value;
    private Integer id;
    
    private Paso paso;
    private Node node;
    public B() {
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public Paso getPaso() {
        return paso;
    }

    public void setPaso(Paso paso) {
        this.paso = paso;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}