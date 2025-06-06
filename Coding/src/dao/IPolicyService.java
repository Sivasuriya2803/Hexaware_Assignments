package dao;

import java.util.Collection;
import Model.Policy;

public interface IPolicyService {
    boolean createPolicy(Policy policy);
    Policy getPolicy(int policyId);
    Collection<Policy> getAllPolicies();
    boolean updatePolicy(Policy policy);
    boolean deletePolicy(int policyId);
}
