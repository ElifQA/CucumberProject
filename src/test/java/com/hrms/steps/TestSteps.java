package com.hrms.steps;

import java.util.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
public class TestSteps {
    @When("I do some step")
    public void i_do_some_step() {
        System.out.println("I do some step");
    }
    @When("another step")
    public void another_step(DataTable table) {
        System.out.println("another step");
        System.out.println(table);
        System.out.println("asList");
        System.out.println(table.asList());
        System.out.println("asLists");
        System.out.println(table.asLists());
        for (List<String> row : table.asLists()) {
//          System.out.println(row);
            for (String cell : row) {
                System.out.print(cell + ", ");
            }
            System.out.println();
        }
        System.out.println("asMaps");
        System.out.println(table.asMaps());
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            System.out.println();
            System.out.println(map);
            Set<String> keys = map.keySet();
            System.out.println("keys: " + keys);
            Collection<String> values = map.values();
            System.out.println("values: " + values);
            for (String key : keys) {
                System.out.println(key + " -> " + map.get(key));
            }
        }
        System.out.println("rows(0, 2)");
        System.out.println(table.rows(0, 2));
        
        System.out.println("row(1)");
        System.out.println(table.row(1));
    }
    @Then("I validate the outcomes")
    public void i_validate_the_outcomes(DataTable table2) {
        System.out.println("I validate the outcomes");
        System.out.println(table2);
        //HW
        //Try asList, asLists, asMaps
        //Extra credit: Iterate them
    }

}
