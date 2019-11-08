/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog7;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author c3
 */
public class SubstringTag extends SimpleTagSupport {

    private String input;
    private int start;
    private int end;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            if(!(start < 0 || start >= input.length() || end < 0 || end > input.length() || end <= start)){
            String s=input.substring(start,end);
            out.println(s);
            }
            else{
                out.println("Enter Correct Value");
            }
            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

           
        } catch (java.io.IOException ex) {
            throw new JspException("Error in SubstringTag tag", ex);
        }
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    
}
