/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.model;

/**
 *
 * @author Tom
 */
public class PhoneNumber {
    
    private String prefix;
    private Integer number;
    private Type type;

    public PhoneNumber(String prefix, Integer number, Type type) {
        this.prefix = prefix;
        this.number = number;
        this.type = type;
    }

    public String getPrefix() {
        return prefix;
    }

    public Integer getNumber() {
        return number;
    }

    public Type getType() {
        return type;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    
    
    public static enum Type {
        Office, Home, Fax, Pager, Mobile
    }
}
