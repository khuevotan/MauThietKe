/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Structural.compositeopattern.BaiHTML;

/**
 *
 * HtmlElement là lớp leaf và nó có nhiệm vụ chính là implement
 * các opearation method. Trong ví dụ này 
 * là generateHtml.
 */
public class HtmlElement extends HtmlTag{
    private String tagName;  
    private String startTag;  
    private String endTag;  
    private String tagBody;  

    public HtmlElement(String tagName) {  
        this.tagName = tagName;  
        this.tagBody = "";  
        this.startTag = "";  
        this.endTag = "";  
    }  

    @Override  
  public String getTagName() {  
        return tagName;  
    }  

    @Override  
  public void setStartTag(String tag) {  
        this.startTag = tag;  
    }  

    @Override  
  public void setEndTag(String tag) {  
        this.endTag = tag;  
    }  

    @Override  
  public void setTagBody(String tagBody) {  
        this.tagBody = tagBody;  
    }  

    @Override  
  public void generateHtml() {  
        System.out.println(startTag + "" + tagBody + "" + endTag);  
    }  
}
