package br.com.skywalker.plugboleto.test.assignor;

import br.com.skywalker.plugboleto.PlugBoleto;
import br.com.skywalker.plugboleto.assignor.AssignorPagedResponse;
import br.com.skywalker.plugboleto.assignor.AssignorResource;
import br.com.skywalker.plugboleto.common.Request;
import br.com.skywalker.plugboleto.exception.ConvertionException;
import br.com.skywalker.plugboleto.exception.RequestFailed;
import br.com.skywalker.plugboleto.exception.ValidationException;
import br.com.skywalker.plugboleto.test.Utils;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

import java.io.IOException;

import static org.junit.Assert.*;

public class AssignorResourceTest {

    @Rule
    public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

    private static AssignorResource assignorResource;

    @BeforeClass
    public static void beforeClass() {
        assignorResource = PlugBoleto.getInstance(
                Utils.TESTING_SH_CNPJ,
                Utils.TESTING_SH_TOKEN,
                Utils.TESTING_ENVIRONMENT
        ).assignors();
    }

    @Test
    public void whenListingAssignors_shouldDeserializeCorrectly() throws RequestFailed, ConvertionException, ValidationException {
//        AssignorPagedResponse assignors = new AssignorPagedResponse(null);
//        assertNotNull(assignors);
//        System.out.println(assignors.getData().get(0).getAddress().getStreet());
    }
}
