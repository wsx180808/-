import java.util.Iterator;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.io.SAXReader;

public class ParseXML {
	public static void main(String[] args) throws Exception {
		
		SAXReader reader = new SAXReader();
        Document document = reader.read("src/NewFile.xml");
		
        Element root = document.getRootElement();
        
//        System.out.println(root.getName());
        
        Iterator<Element> it = root.elementIterator();
        while(it.hasNext()) {
        	Element ele = it.next();
        	if(ele.getName().equals("good")) {
        		Element name = ele.element("name");
        		if(name!=null)System.out.println(name.getText());
        	}
        	System.out.println(ele.getName());
        	Iterator<Attribute> attributes= ele.attributeIterator();
        	while(attributes.hasNext()) {
        		Attribute ab = attributes.next();
        		System.out.println(ab.getName()+":"+ab.getValue());
        	}
        }
        //xml:Element Attribute
        Element ele = null;
//        ele.elementIterator() ±éÀú·½·¨
        
        Attribute ab = null;
        
	}
}
