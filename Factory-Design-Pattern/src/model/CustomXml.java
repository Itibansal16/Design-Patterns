package model;

public class CustomXml {
    private XmlType type;
    private String msg;

    public CustomXml(XmlType type, String msg) {
        this.type = type;
        this.msg = msg;
    }

    public XmlType getType() {
        return type;
    }

    public void setType(XmlType type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
