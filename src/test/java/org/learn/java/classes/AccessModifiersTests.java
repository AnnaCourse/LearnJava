package org.learn.java.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.learn.java.classes.inherit.InheritAccessModifiers;

public class AccessModifiersTests {

    @Test
    public void tochAllVariables() {
        AccessModifiers am = new AccessModifiers();
        am.protVar = "protected var value";
        Assertions.assertEquals("protected var value",am.protVar);
    }

    @Test
    public void checkDefAndProt() {
        AccessModifiers am = new AccessModifiers();
        InheritAccessModifiers iam = new InheritAccessModifiers();
        iam.protVar = "iam prot value";
        am.defVar = "default var value";
        Assertions.assertEquals("iam prot value",iam.protVar);
        Assertions.assertEquals("default var value",am.defVar);
        Assertions.assertNull(am.protVar);


    }

}
