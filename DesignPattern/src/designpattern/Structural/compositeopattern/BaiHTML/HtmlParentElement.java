/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.Structural.compositeopattern.BaiHTML;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THIS PC
 */
public class HtmlParentElement extends HtmlTag{
    private String tagName;  
    private String startTag;  
    private String endTag;  
    private List<HtmlTag> childrenTag;  

    public HtmlParentElement(String tagName) {  
        this.tagName = tagName;  
        this.startTag = "";  
        this.endTag = "";  
        this.childrenTag = new ArrayList<>();  
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
  public void addChildTag(HtmlTag htmlTag) {  
        childrenTag.add(htmlTag);  
    }  

    @Override  
  public void removeChildTag(HtmlTag htmlTag) {  
        childrenTag.remove(htmlTag);  
    }  

    @Override  
  public List<HtmlTag> getChildren() {  
        return childrenTag;  
    }  

    @Override  
  public void generateHtml() {  
        System.out.println(startTag);  
        for (HtmlTag tag : childrenTag) {  
            tag.generateHtml();  
        }  
        System.out.println(endTag);  

    }  
}
