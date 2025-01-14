/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog8;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author c3
 */
public class ReverseTag extends SimpleTagSupport {

    private String input;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            StringBuilder s=new StringBuilder(input);
            out.println(s.reverse());

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
                
            
            }

        } catch (java.io.IOException ex) {
            throw new JspException("Error in ReverseTag tag", ex);
        }
    }

    public void setInput(String input) {
        this.input = input;
    }
    
}
