package com.cydeo.step_definitions;

import com.cydeo.utilities.DBUtils;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class SpartanSteps {

    List<Map<String,Object>> queryResultList;

    @When("user execute query to get all Male Spartan")
    public void user_execute_query_to_get_all_male_spartan() {
        String query = "select spartan_id, name, gender, phone, created_at, updated_at from spartans";
        queryResultList = DBUtils.getQueryResultMap(query);
        for (Map<String, Object> eachRow : queryResultList) {
            System.out.println("eachRow = " + eachRow);
    }
}
}
