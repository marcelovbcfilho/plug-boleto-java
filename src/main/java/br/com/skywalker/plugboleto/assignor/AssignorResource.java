package br.com.skywalker.plugboleto.assignor;

import br.com.skywalker.plugboleto.Registry;
import br.com.skywalker.plugboleto.assignor.dto.CreateAssignorRequest;
import br.com.skywalker.plugboleto.assignor.dto.CreateAssignorResponse;
import br.com.skywalker.plugboleto.common.Request;
import retrofit2.Retrofit;

public class AssignorResource {
    public static final String ASSIGNOR_SERVICE_KEY = "ASSIGNOR_SERVICE";

    public AssignorResource(Retrofit retrofit) {
        Registry.set(ASSIGNOR_SERVICE_KEY, retrofit.create(AssignorService.class));
    }

    public Request<AssignorPagedResponse> findAll() {
        return new Request<>(Registry.get(ASSIGNOR_SERVICE_KEY, AssignorService.class).findAll());
    }

    public Request<AssignorPagedResponse> findAll(long pageNum, long pageSize) {
        return new Request<>(Registry.get(ASSIGNOR_SERVICE_KEY, AssignorService.class).findAll());
    }

    public Request<AssignorPagedResponse> findById(Long id) {
        return new Request<>(Registry.get(ASSIGNOR_SERVICE_KEY, AssignorService.class).findById(id));
    }

    public Request<CreateAssignorResponse> create(CreateAssignorRequest request) {
        return new Request<>(Registry.get(ASSIGNOR_SERVICE_KEY, AssignorService.class).create(request));
    }

    public Request<CreateAssignorResponse> update(CreateAssignorRequest request, String assignorFederalId, long id) {
        return new Request<>(Registry.get(ASSIGNOR_SERVICE_KEY, AssignorService.class).update(request, assignorFederalId, id));
    }
}
