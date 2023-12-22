package software.ulpgc.kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryOrganizationProcessor implements OrganizationProcessor{
    @Override
    public Map<String, Integer> process(List<Organization> organizations) {
        Map<String, Integer> result = new HashMap<>();
        for (Organization organization: organizations){
            String country = organization.getCountry();
            result.put(country, result.getOrDefault(country, 0)+1);
        }
        return result;
    }
}
