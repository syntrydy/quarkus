package io.quarkus.mongodb.panache;

import static org.junit.jupiter.api.Assertions.fail;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkus.builder.BuildException;
import io.quarkus.test.QuarkusUnitTest;

public class DuplicateIdMongoEntityTest {
    @RegisterExtension
    static QuarkusUnitTest runner = new QuarkusUnitTest()
            .setExpectedException(BuildException.class)
            .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class)
                    .addClasses(DuplicateIdMongoEntity.class));

    @Test
    void shouldThrow() {
        fail("A BuildException should have been thrown due to duplicate entity ID");
    }

}
