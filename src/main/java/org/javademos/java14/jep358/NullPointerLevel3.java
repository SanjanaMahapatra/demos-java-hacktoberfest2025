package org.javademos.java14.jep358;

import lombok.Getter;

/**
 * Simple class to show 'helpful' NullPointerExceptions from Java 14.
 * Here we have 4-level nested class structure and somewhere on the way
 * one element is 'null', so invoking method on it will raise 'NullPointer'.
 * 
 * @author Abhineshhh
 */
public class NullPointerLevel3 {
    
    @Getter
    private final NullPointerLevel4 level4;
    
    public NullPointerLevel3() {
        // here is our design flaw
        // nested member is not initialized
        level4 = null;
        // level4 = new NullPointerLevel4();
    }
    
}
