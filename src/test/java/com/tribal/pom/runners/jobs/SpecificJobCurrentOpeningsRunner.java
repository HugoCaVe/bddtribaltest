package com.tribal.pom.runners.jobs;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/jobs/specific_job_current_openings.feature",
    glue = {"com.tribal.pom.definitions"},
    snippets = SnippetType.CAMELCASE)
public class SpecificJobCurrentOpeningsRunner {}
